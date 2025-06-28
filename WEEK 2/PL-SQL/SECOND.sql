CREATE TABLE  savings_acc(
    account_id INT PRIMARY KEY,
    customer_id INT,
    balance NUMBER(12,2)
);
INSERT INTO savings_acc VALUES(1, 101, 5000.00),(2, 102, 8000.00),
        (3, 103, 15000.00),
        (4, 104, 2500.00),
         (5, 105, 10000.00);
SELECT * FROM savings_acc;

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    department VARCHAR(50),
    salary NUMBER(12,2)
);

INSERT INTO employees VALUES (1, 'Alice Johnson', 'Finance', 5000);
INSERT INTO employees VALUES (2, 'Bob Smith', 'IT', 6000);
INSERT INTO employees VALUES (3, 'Charlie Lee', 'Finance', 7000);
INSERT INTO employees VALUES (4, 'Diana Brown', 'HR', 5500);
INSERT INTO employees VALUES (5, 'Ethan White', 'IT', 6500);

CREATE TABLE accounts (
    account_id INT PRIMARY KEY,
    customer_id INT,
    balance NUMBER(12,2)
);

INSERT INTO accounts VALUES (201, 101, 12000.00),
(202, 102, 5000.00),
 (203, 103, 3000.00),
 (204, 104, 7000.00),
 (205, 105, 15000.00);

SELECT * FROM employees;
SELECT * FROM accounts;
-- scenario 1

CREATE OR REPLACE PROCEDURE  ProcessMonthlyInterest IS
BEGIN
    UPDATE savings_acc
    SET balance=balance+(balance*0.01);
    DBMS_OUTPUT.PUT_LINE('Monthly Interset is applied to all accounts');
END;
/   
BEGIN
    ProcessMonthlyInterest;
END;
/
-- scenario 2

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus_pct IN NUMBER
) IS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * (p_bonus_pct / 100))
    WHERE department = p_department;

    COMMIT;
    
    DBMS_OUTPUT.PUT_LINE('Salaries updated with bonus in department: ' || p_department);
END;
/
EXEC UpdateEmployeeBonus('Finance',2);

-- scenario 3
CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_account IN INT,
    p_to_account IN INT,
    p_amount IN NUMBER
)
IS 
v_balance NUMBER(12,2);
BEGIN
    SELECT balance INTO v_balance
    FROM accounts
    WHERE account_id=p_from_account
    FOR UPDATE;
    IF v_balance<p_amount THEN 
         RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
    END IF;
    UPDATE accounts
    SET balance=balance-p_amount
    WHERE account_id=p_from_account;
    
    UPDATE accounts 
    SET balance=balance+p_amount
    WHERE account_id=p_to_account;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer successful: ' || p_amount || ' transferred from account ' || p_from_account || ' to account ' || p_to_account);
END;
/
EXEC TransferFunds(201,202,6000);