package hospital.controller;

import hospital.model.dto.AppointmentDto;
import hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    // 진료 예약 등록
    @PostMapping("/appointment")
    public boolean register(@RequestBody() AppointmentDto appointmentDto) {
        System.out.println("AppointmentController.register");
        System.out.println("appointmentDto = " + appointmentDto);
        boolean result = appointmentService.register(appointmentDto);
        return result;
    }

    // 진료 예약 전체 조회
    @GetMapping("/appointment")
    public List<AppointmentDto> findAll() {
        System.out.println("AppointmentController.findAll");
        List<AppointmentDto> result = appointmentService.findAll();
        return result;
    }


    // 진료 예약 목록 조회
    @GetMapping("/appointment/date")
    public List<AppointmentDto> findDate(@RequestParam(name="date") String appointmentdate) {
        System.out.println("AppointmentController.findDate");
        List<AppointmentDto> result = appointmentService.findDate(appointmentdate);
        return result;
    }


    // 환자별 예약 조회
    @GetMapping("/appointment/patient")
    public List<AppointmentDto> findPatient(@RequestParam(name="patientid") int patientid) {
        System.out.println("AppointmentController.findPatient");
        System.out.println("patientid = " + patientid);
        List<AppointmentDto> result = appointmentService.findPatient(patientid);
        return result;
    }


    // 의사별 예약 조회
    @GetMapping("/appointment/doctor")
    public List<AppointmentDto> findDoctor(@RequestParam(name="doctorid") int doctorid) {
        System.out.println("AppointmentController.findDoctor");
        System.out.println("doctorid = " + doctorid);
        List<AppointmentDto> result = appointmentService.findDoctor(doctorid);
        return result;
    }


    // 예약 수정
    @PutMapping("/appointment")
    public boolean update(@RequestBody() AppointmentDto appointmentDto) {
        System.out.println("AppointmentController.update");
        System.out.println("appointmentDto = " + appointmentDto);
        boolean result = appointmentService.update(appointmentDto);
        return result;
    }

    // 예약 취소
    @DeleteMapping("/appointment")
    public boolean cancel(@RequestParam(name="appointmentid") int appointmentid) {
        System.out.println(">> AppointmentController.cancel");
        System.out.println(">> appointmentid = " + appointmentid);
        boolean result = appointmentService.cancel(appointmentid);
        return result;
    }

}