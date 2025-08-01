package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Primary;

@Entity
@Data
public class Users {

   @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    String address;
    String email;
    String password;
}
