package com.example.spsec.demo.Controller;


import com.example.spsec.demo.entity.EmployeeSignup;
import com.example.spsec.demo.repo.SignupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    @Autowired
    private SignupRepo repo;

    @PostMapping("/signup")
    public String register(@RequestBody EmployeeSignup empsignup) {
        repo.save(empsignup);
        return "Registered Successfully!";


    }
}
