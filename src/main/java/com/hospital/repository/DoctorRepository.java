package com.hospital.repository;

import com.hospital.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // İhtiyaca göre özel sorgu ekleyebiliriz:
    // List<Doctor> findBySpecialty(String specialty);
}