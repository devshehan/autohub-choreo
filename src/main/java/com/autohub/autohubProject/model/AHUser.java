package com.autohub.autohubProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "auto_hub_user")
public class AHUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
}
