package com.hospital.repository;

import com.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public// Bu notasyonun olduğundan emin ol
interface PatientRepository extends JpaRepository<Patient, Long> {
    // PatientRepository.java içine ekle
    Patient findByTcNoAndPassword(String tcNo, String password);
}