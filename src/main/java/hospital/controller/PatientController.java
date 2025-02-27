package hospital.controller;

import hospital.model.dto.PatientDto;
import hospital.service.PatientService;
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
public class PatientController {

    @Autowired
    private PatientService patientService;

    // 환자 등록
    @PostMapping("/patient")
    public boolean register(@RequestBody() PatientDto patientDto) {
        System.out.println("PatientController.register");
        System.out.println("patientDto = " + patientDto);
        boolean result = patientService.register(patientDto);
        return result;
    }

    // 환자 목록 조회
    @GetMapping("/patient")
    public List<PatientDto> findAll() {
        System.out.println("PatientController.findAll");
        List<PatientDto> result = patientService.findAll();
        return result;
    }

    // 환자 상세 조회
    @GetMapping("/patient/detail")
    public PatientDto find(@RequestParam(name="patientid") int patientid) {
        System.out.println("PatientController.find");
        System.out.println(">> patientid = " + patientid);
        PatientDto result = patientService.find(patientid);
        return result;
    }

    // 환자 정보 수정
    @PutMapping("/patient")
    public boolean update(@RequestBody() PatientDto patientDto) {
        System.out.println("PatientController.update");
        System.out.println("patientDto = " + patientDto);
        boolean result = patientService._update(patientDto);
        return result;
    }

    // 환자 삭제
    @DeleteMapping("/patient")
    public boolean delete(@RequestParam(name="patientid") int patientid) {
        System.out.println("PatientController.delete");
        System.out.println("patientid = " + patientid);
        boolean result = patientService.delete(patientid);
        return result;
    }

}