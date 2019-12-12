package day59_Exceptions;

public class Notes {
	/*
	 12/03/2019
Topic: Exceptions Continue
            Multi-catch blocks
            throws keyword
            throw keyword
            Custom Exceptions: NoBreakException
            throw vs throws
            final vs finally
        Exceptions Interveiw Questions
Package Name: day59_Exceptions
Agenda:
    Morning: Java
    Afternoon: Selenium
Multi- catch block:
        we can have multiple catch blocks with one try block
        CONDITION: parent exception type needs to be after it's sub exception type, otherwise code will be unreachable
        CANNOT BE CONFLICTED
        Exception > RuntimeException > Arithmetic .....
            try{
            } catch( exception1 name){
            } catch(exception2 name){
            }
            Ex: 
                try{
                }catch(ArithmaticException e){
                }catch(ArithmaticException e){
                }
            in multi-catch block whichever handles the exception first will gets executed
 
	 */

}
