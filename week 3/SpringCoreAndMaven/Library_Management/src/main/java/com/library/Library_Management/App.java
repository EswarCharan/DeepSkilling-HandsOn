package com.library.Library_Management;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookService bookService =(BookService)context.getBean("bookService");
    	bookService.addBook("Sping Tutorial");
    	((ClassPathXmlApplicationContext) context).close();
    }
}
