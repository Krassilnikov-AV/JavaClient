/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.webcl.akr;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Aleks
 */
@WebService(serviceName = "WebCl")
public class WebCl {

User user;
User[] users;

    public WebCl() {
        user = new User("Александр", 25);
        users = new User[]{new User("Shiko",39), new User("Горанфло",37)};
    }



    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
       return num1 + num2;
    }

  
    
    @WebMethod(operationName = "sub")
    public int sub(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
       return num1 - num2;
    }
    
    @WebMethod(operationName = "mul")
    public int mul(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
       return num1 * num2;
    }
    
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
       return num1/num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUser")
    public User getUser() {
        //TODO write your implementation code here:
        return user;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public User[] operation() {
        //TODO write your implementation code here:
        return users;
    }
    
   
}
