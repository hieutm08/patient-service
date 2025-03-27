package com.pm.patientservice.mapper;
import java.time.LocalDate;
import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO responseDTO = new PatientResponseDTO();
        responseDTO.setId(patient.getId().toString());
        responseDTO.setName(patient.getName());
        responseDTO.setAddress(patient.getAddress());
        responseDTO.setEmail(patient.getEmail());
        responseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return responseDTO;
    }

    public static Patient toModel(PatientRequestDTO patientRequest) {
        Patient patient = new Patient();
        patient.setName(patientRequest.getName());
        patient.setAddress(patientRequest.getAddress());
        patient.setEmail(patientRequest.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequest.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequest.getRegisteredDate()));
        return patient;
    }
}
