/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soa.tp1.service;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
    private String message = "Hello ";
    
    public Hello(){
    }
    
    @WebMethod
    public String sayHello(String name){
        return message + name + " !";
    }
}

//http://localhost:8080/HelloWorldService5/HelloService?wsdl
//http://localhost:8080/HelloWorldService5/HelloService?Tester
