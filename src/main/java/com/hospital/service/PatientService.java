package com.hospital.service;

import com.hospital.entity.Patient;
import com.hospital.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    // Constructor Injection (Repository'yi buraya bağlıyoruz)
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
    // PatientService.java içine ekle
    public Patient login(String tcNo, String password) {
        return patientRepository.findByTcNoAndPassword(tcNo, password);
    }
}