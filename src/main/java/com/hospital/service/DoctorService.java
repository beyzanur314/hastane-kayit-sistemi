package com.hospital.service;

import com.hospital.entity.Doctor;
import com.hospital.repository.DoctorRepository; // Bu satır kritik
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    // Constructor (Yapıcı Metot)
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}