package com.example.demo.Users;


import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;

@RestController
@RequestMapping(path = {"/api/users"})
public class UsersController {
//    @GetMapping
//    public String showUsers(Users users){
//        users = new Users(1,"AKrom","Obidov", LocalDate.of(1996, Month.AUGUST,05),"address kkkk");
//        return users.getAddress();
//    }

    @GetMapping("/user")
    public String showUsersParam(@RequestParam String name, @RequestParam String familyName){
        Users users = new Users(2, name,familyName,LocalDate.of(1996, Month.AUGUST,05),"address");
        return users.toString();
    }
    @PostMapping()
    public String postUser(@RequestBody Users users[]){
        System.out.println(users[1].toString());
        return users[1].toString();
    }

    @GetMapping(value = "/")
     public String getId(){//@PathVariable int id
//        System.out.println( "UserID is: "+ id);
        return "index";
    }


}
