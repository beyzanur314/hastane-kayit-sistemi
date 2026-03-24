package com.hospital.service;

import com.hospital.entity.Appointment;
import com.hospital.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    // 1. Tüm Randevuları Getir
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    // 2. Randevu Kaydet (İlişkileriyle Birlikte)
    public Appointment saveAppointment(Appointment appointment) {
        // Burada istersen ek kontroller yapabilirsin (Örn: Aynı saatte randevu var mı?)
        return appointmentRepository.save(appointment);
    }

    // 3. Randevu Sil (İptal Et)
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}