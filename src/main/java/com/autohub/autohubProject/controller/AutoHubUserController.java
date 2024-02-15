package com.autohub.autohubProject.controller;

import com.autohub.autohubProject.model.AHUser;
import com.autohub.autohubProject.service.AutoHubUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/autohubuser")
@RequiredArgsConstructor
public class AutoHubUserController {

    private final AutoHubUserService autoHubUserService;

    @PostMapping("/adduser")
    public AHUser addNewUser(@RequestBody AHUser ahUser){
        return autoHubUserService.addNewUser(ahUser);
    }

    @GetMapping("/getallusers")
    public List<AHUser> getAllUsers(){
        return autoHubUserService.getAllUsers();
    }

    @GetMapping("/getuser/{id}")
    public AHUser getUserById(@PathVariable Long id){
        return autoHubUserService.getUserById(id);
    }

    @PutMapping("/updateuser/{id}")
    public AHUser updateUser(@PathVariable Long id, @RequestBody AHUser autoHubUser){
        return autoHubUserService.updateUser(id, autoHubUser);
    }

    @DeleteMapping("/deleteuser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        return autoHubUserService.deleteUser(id);
    }
}
