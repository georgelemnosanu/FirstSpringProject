package com.scoalainformala;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloMessageController {

    @GetMapping("/")
    public String sayHi() {
        return "Hello world";
    }

    @GetMapping("/{name}")
    public String sayHiToSomeOne(@PathVariable String name) {
        LocalDate date= LocalDate.now();
        return "Hello" + "  " + name + "    " + date;
    }

    @GetMapping("/date")
    public String date(){
        LocalDate date= LocalDate.now();
       return "Today Is A Good Day" + "   " + date;
    }




}
