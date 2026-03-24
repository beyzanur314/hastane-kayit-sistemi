package com.hospital.controller;

import com.hospital.entity.Patient;
import com.hospital.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin("*") // Frontend'den gelen istekleri kabul etmek için
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // 1. Tüm Hastaları Listele (Admin paneli için gerekebilir)
    @GetMapping
    public List<Patient> getAll() {
        return patientService.getAllPatients();
    }

    // 2. Yeni Hasta Kaydı (Kayıt Ol)
    @PostMapping("/register")
    public Patient create(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    // 3. Giriş Yapma (Login)
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Patient loginRequest) {
        Patient found = patientService.login(loginRequest.getTcNo(), loginRequest.getPassword());

        if (found != null) {
            // Giriş başarılıysa hastanın bilgilerini gönder
            return ResponseEntity.ok(found);
        } else {
            // Giriş başarısızsa hata mesajı gönder
            return ResponseEntity.status(401).body("TC Kimlik No veya Şifre hatalı!");
        }
    }
}