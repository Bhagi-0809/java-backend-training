package com.example.spsec.demo.Controller;

import com.example.spsec.demo.employee.Employee;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    private List<Employee> list=new ArrayList<>(List.of(
            new Employee(123,"Bhagi",23)
    ));
    @GetMapping("/hello")
    public String Hello()
    {
        return "Hello it is a controller";
    }

    @GetMapping("/id")
    public  String Session(HttpServletRequest req){
        return "Session id " + req.getSession().getId();
    }

    @GetMapping("/employee")
    public List<Employee> getemployee()
    {
        return list;
    }

    @PostMapping("/add")
    public List<Employee> add(@RequestBody Employee emp)
    {
        list.add(emp);
        return list;
    }

    @GetMapping("/csrf")
    public CsrfToken sesstoken(HttpServletRequest re)
    {
        return (CsrfToken) re.getAttribute("_csrf");
    }
}