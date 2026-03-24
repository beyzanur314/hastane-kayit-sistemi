package com.hospital.repository;

import com.hospital.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    // 1. Bir doktorun tüm randevularını listelemek için
    List<Appointment> findByDoctorId(Long doctorId);

    // 2. Bir hastanın geçmiş randevularını listelemek için
    List<Appointment> findByPatientId(Long patientId);

    // 3. Belirli bir tarihteki randevuları bulmak için (Örn: Bugünün randevuları)
    List<Appointment> findByAppointmentDateBetween(LocalDateTime start, LocalDateTime end);

    // 4. Durumuna göre randevuları getir (Örn: Sadece "Onaylandı" olanlar)
    List<Appointment> findByStatus(String status);
}