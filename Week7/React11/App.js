import React from 'react';
import './App.css';
function App() {
  // let counter=0;
  const [amount, setAmount] = React.useState(0);
  const [count,setCount]= React.useState(0);

  const handleSubmit = (event) => {
    event.preventDefault();
    const result=amount * 0.01;
    alert(`Converted amount to Euro is : ${result}`);
    setAmount(0); // Reset the amount after submission
  }
  return (
    <div className="App">
      <div className="head" style={{margin:"20px",padding:"20px",}}>
        {count}<br>
      </br>
        <button onClick={()=>setCount(count+1)}>Increment</button><br/>
        <button onClick={()=>setCount(count-1)}>Decrement</button><br/>
        <button onClick={()=>alert("Welcome")}>Say Welcome</button><br/>
        <button onClick={()=>alert("I was clicked")}>Click on me</button><br/>
      </div>
      <center>
      <h1 style={{color:"green"}}>Currency Converter!!</h1><br/>
      <br/>
      <form onSubmit={handleSubmit}>
        <label> Amount:   </label><br/>
        <input type="number" value={amount} onChange={(e)=>setAmount(Number(e.target.value))} placeholder="Enter amount"/><br/><br/>
        <label> Currency: </label><br/>
        <input type="text" placeholder="Enter Euro" /><br/><br/>

        <button type="submit" >Submit</button>
      </form>
      </center>
    </div>
  );
}

export default App;
