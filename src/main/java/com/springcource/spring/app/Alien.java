package com.springcource.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*Inorder to find this class(Bean) we need something to do about it and for that we are using annotation
    To tell the spring that what object i want and what i donot want we are using this annotation i.e Componenet
    By providing this annotaion you are specifing that you want to manage this class 
     */
@Component
public class Alien {

    @Autowired
    /*By applying this annotation we are wiring our alien and alaptop class in spring as spring itself would not do every thing for us
    BY using this annotation now it is speing's responsibility for searching for the class  */
    Laptop laptop;
    public void code(){
        laptop.compile();
    }
    
}
