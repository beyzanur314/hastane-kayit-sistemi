package com.hospital.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Table(name = "patients") // SQL'deki tablo adı
@Data // Getter-Setter'ları otomatik yapar
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Otomatik artan ID (Identity)
    private Long id;

    @Column(nullable = false, length = 11)
    private String tcNo;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
}