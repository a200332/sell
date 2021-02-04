package com.imooc.controller;

import com.imooc.VO.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 贝大波
 * @date : 2020/10/29 20:48
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    public Person getPerson() {
        Person person = new Person();
        person.setId("1101");
        person.setName("张少杰");
        person.setAge(19);
        return person;
    }
}
