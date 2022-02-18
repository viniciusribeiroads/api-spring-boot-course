package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){

        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping(value = "/{id}")
    ResponseEntity<Optional<User>> findBy(@PathVariable Long id){
        return ResponseEntity.ok().body(userService.findById(id));
    }




}
