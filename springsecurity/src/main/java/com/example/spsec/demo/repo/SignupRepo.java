package com.example.spsec.demo.repo;

import com.example.spsec.demo.entity.EmployeeSignup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepo extends JpaRepository<EmployeeSignup,Integer> {
}
