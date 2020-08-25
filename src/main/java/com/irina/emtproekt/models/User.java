package com.irina.emtproekt.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "users")
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer Id;

    @Getter
    @Setter
    @NotNull
    String firstName;
    @Getter
    @Setter
    @NotNull
    String lastName;
    @Getter
    @Setter
    @NotNull
    String email;
    @Getter
    @Setter
    @NotNull
    @Size(min = 8, message = "Password length >= 8")
    String password;
}
