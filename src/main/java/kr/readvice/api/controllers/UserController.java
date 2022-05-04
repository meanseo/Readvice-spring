package kr.readvice.api.controllers;

import kr.readvice.api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    @PostMapping("/join") public String register(){
        return "";
    }
    @PostMapping("/login") public String login(){
        return "";
    }
    @PostMapping("/logout") public String logout(){
        return "";
    }
}
