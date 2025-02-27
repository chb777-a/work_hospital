package hospital.service;

import hospital.model.dto.AppointmentDto;
import hospital.model.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentMapper appointmentMapper;

    // 진료 예약 등록
    public boolean register(AppointmentDto appointmentDto) {
        System.out.println("AppointmentService.register");
        System.out.println("appointmentDto = " + appointmentDto);
        boolean result = appointmentMapper.register(appointmentDto);
        return result;
    }

    // 진료 예약 전체 조회
    public List<AppointmentDto> findAll() {
        System.out.println("AppointmentService.findAll");
        List<AppointmentDto> result = appointmentMapper.findAll();
        return result;
    }

    // 진료 예약 목록 조회
    public List<AppointmentDto> findDate(String appointmentdate) {
        System.out.println("AppointmentService.findAll");
        List<AppointmentDto> result = appointmentMapper.findDate(appointmentdate);
        return result;
    }

    // 환자별 예약 조회
    public List<AppointmentDto> findPatient(int patientid) {
        System.out.println("AppointmentService.findPatient");
        System.out.println("patientid = " + patientid);
        List<AppointmentDto> result = appointmentMapper.findPatient(patientid);
        return result;
    }

    // 의사별 예약 조회
    public List<AppointmentDto> findDoctor(int doctorid) {
        System.out.println("AppointmentService.findDoctor");
        System.out.println("doctorid = " + doctorid);
        List<AppointmentDto> result = appointmentMapper.findDoctor(doctorid);
        return result;
    }

    // 예약 수정
    public boolean update(AppointmentDto appointmentDto) {
        System.out.println("AppointmentService.update");
        System.out.println("appointmentDto = " + appointmentDto);
        boolean result = appointmentMapper.update(appointmentDto);
        return result;
    }

    // 예약 취소
    public boolean cancel(int appointmentid) {
        System.out.println("AppointmentService.cancel");
        System.out.println("appointmentid = " + appointmentid);
        boolean result = appointmentMapper.cancel(appointmentid);
        return result;
    }

}