package com.autohub.autohubProject.service;

import com.autohub.autohubProject.model.AHUser;
import com.autohub.autohubProject.repository.AutoHubUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AutoHubUserService {

    private final AutoHubUserRepository autoHubUserRepository;

    public AHUser addNewUser(AHUser ahUser) {
        return autoHubUserRepository.save(ahUser);
    }
    public List<AHUser> getAllUsers() {
        return autoHubUserRepository.findAll();
    }
    public AHUser getUserById(Long id) {
        return autoHubUserRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.INTERNAL_SERVER_ERROR, "User not found"
                ));
    }
    public AHUser updateUser(Long id, AHUser ahUser) {
        return autoHubUserRepository.findById(id)
                .map(existingUser -> {
                    return autoHubUserRepository.save(existingUser);
                })
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.INTERNAL_SERVER_ERROR, "User not found"
                ));
    }
    public ResponseEntity<String> deleteUser(Long id) {
        if (!autoHubUserRepository.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "User not found"
            );
        }
        autoHubUserRepository.deleteById(id);
        return ResponseEntity.ok("User successfully deleted");
    }


}
