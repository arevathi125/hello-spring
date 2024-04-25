package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }

//    @PostMapping("goodbye")
//    public String hellogoodbye(){
//        return "Goodbye, Spring!";
//    }

    //Handles request of the form /hello?name=Launchcode
//    @GetMapping("hello")
//    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name){
//     return "Hello, "+name+"!";
//    }

    //Handles requests of the form /hello/Launchcode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, "+name+"!";
    }

    //Handles request for both GET & POST
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
     return "Hello, "+name+"!";
    }

  // Handles requests for http://localhost:8080/hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>"+
                "<body>"+
                "<form action='hello'>"+   //submit a request to /hello
                "<input type='text' name='name'>"+
                "<input type='submit' value='Greet me!'>"+
                "</form>"+
                "</body>"+
                "</html>";
    }
}
