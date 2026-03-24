package com.hospital.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "doctors")
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    private String specialty; // Uzmanlık Alanı (Kardiyoloji, Göz vb.)
    private String email;

    @OneToMany(mappedBy = "doctor") // Bir doktorun birden fazla randevusu olabilir
    private List<Appointment> appointments;
}