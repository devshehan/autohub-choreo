package com.autohub.autohubProject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "auto_hub_service")
@RequiredArgsConstructor
public class AHService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String AHService;
    private Long AHServiceProviderId;
}
