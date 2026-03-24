package com.hospital.controller; // Paket ismi doğru olmalı!

import com.hospital.entity.Doctor;
import com.hospital.service.DoctorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins = "*") // Tarayıcıdaki 'Bağlantı Hatası'nı bu satır çözer
public class DoctorController {

    private final DoctorService doctorService;

    // Constructor Injection
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<Doctor> getAll() {
        return doctorService.getAllDoctors();
    }
}