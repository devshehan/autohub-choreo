package com.autohub.autohubProject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@Table(name = "auto_hub_service_provider")
@RequiredArgsConstructor
public class AHServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String AHServiceProviderName;
    private String address;
    private String email;
    private String pNumber;
    private String description;

    @Lob
    private byte[] profileImage;

}
