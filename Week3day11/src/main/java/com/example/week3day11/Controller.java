package com.example.week3day11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

// to give me response in jason

@RequestMapping(path="/welcome")
@RestController
public class Controller {

    Scanner in = new Scanner(System.in);

    //    Controller
    //  1- url or path
    //  2- method
    //  3- write the method include java


    // every gate(get , post , put , ) have it's own notation

    @GetMapping(path = "hello") // if there is no get request the request mapping will get the mapp
    public String welcome (){

        return "Hello from springboot";
    }


    @GetMapping(path = "name")
    public String Name (){
        return "Mariam almesfer";
    }




}
