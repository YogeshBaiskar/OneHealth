package com.oneHealth.Appointments.repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneHealth.Appointments.entity.Appointment;

/**
 * Repository interface for handling database operations related to the Appointment entity.
 * This interface extends the JpaRepository to provide basic CRUD operations on the Appointment table.
 * @author Anup
 * @version 3.9.10
 */
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    
    /**
     * Find an appointment by patient ID.
     * @param patientId The ID of the patient.
     * @return An optional containing the appointment if found, otherwise empty.
     */
    List<Appointment> findByPatientId(Long patientId);
    
    /**
     * Find an appointment by doctor ID.
     * @param doctorId The ID of the doctor.
     * @return An optional containing the appointment if found, otherwise empty.
     */
    List<Appointment> findByDoctorId(Long doctorId);
    
    /**
     * Find appointments by type.
     * @param type The type of the appointment.
     * @return An optional containing the appointment if found, otherwise empty.
     */
    Optional<Appointment> findByType(String type);
    
    /**
     * Find appointments by doctor ID and status.
     * @param doctorId The ID of the doctor.
     * @param status The status of the appointment.
     * @return A list of appointments with the specified doctor ID and status.
     */
    List<Appointment> findByDoctorIdAndStatus(long doctorId, String status);
    
    /**
     * Find appointments by doctor ID and type.
     * @param doctorId The ID of the doctor.
     * @param type The type of the appointment.
     * @return A list of appointments with the specified doctor ID and type.
     */
    List<Appointment> findByDoctorIdAndType(long doctorId, String type);
    
    /**
     * Find appointments by patient ID and type.
     * @param patientId The ID of the patient.
     * @param type The type of the appointment.
     * @return A list of appointments with the specified patient ID and type.
     */
    List<Appointment> findByPatientIdAndType(long patientId, String type);
    
    
 // Retrieve a list of appointments based on the provided currentDate.
 // The method returns appointments scheduled on the given currentDate.
 List<Appointment> findByDate(LocalDate currentDate);

 // Retrieve a list of upcoming appointments after the specified date with the given status.
 // The method returns appointments that are scheduled after the provided date and have the specified status.
 List<Appointment> findByDateAfterAndStatus(Date date, String status);

 // Retrieve a list of upcoming appointments after the specified date for the given doctorId and status.
 // The method returns appointments that are scheduled after the provided date, for the specified doctorId, and have the given status.
 List<Appointment> findByDateAfterAndDoctorIdAndStatus(Date date, long doctorId, String status);

 // Retrieve a list of upcoming appointments after the specified date for the given doctorId, status, and type.
 // The method returns appointments that are scheduled after the provided date, for the specified doctorId, have the given status, and belong to the specified type.
 List<Appointment> findByDateAfterAndDoctorIdAndStatusAndType(Date date, long doctorId, String status, String type);
 
 
 List<Appointment> findByDateAndDoctorIdAndStatus(LocalDate currentDate, long doctorId, String status);

}

