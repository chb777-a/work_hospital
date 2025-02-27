package hospital.controller;

import hospital.model.dto.DoctorDto;
import hospital.service.DoctorService;
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
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    //ㅇ 의사 등록
    @PostMapping("/doctor")
    public boolean register(@RequestBody() DoctorDto doctorDto) {
        System.out.println("DoctorController.register");
        System.out.println("doctorDto = " + doctorDto);
        boolean result = doctorService.register(doctorDto);
        return result;
    }

    // 의사 목록 조회
    @GetMapping("/doctor")
    public List<DoctorDto> findAll() {
        System.out.println("DoctorController.findAll start");
        List<DoctorDto> result = doctorService.findAll();
        return result;
    }

    // 의사 상세 조회
    @GetMapping("/doctor/detail")
    public DoctorDto find(@RequestParam(name="doctorid") int doctorid) {
        System.out.println("DoctorController.find start");
        System.out.println("doctorid = " + doctorid);
        DoctorDto result = doctorService.find(doctorid);
        return result;
    }

    // 의사 정보 수정
    @PutMapping("/doctor")
    public boolean update(@RequestBody() DoctorDto doctorDto) {
        System.out.println("DoctorController.update");
        System.out.println("doctorDto = " + doctorDto);
        boolean result = doctorService.update(doctorDto);
        return result;
    }

    // 의사 삭제
    @DeleteMapping("/doctor")
    public boolean delete(@RequestParam(name="doctorid") int doctorid) {
        System.out.println("DoctorController.delete");
        System.out.println("doctorid = " + doctorid);
        boolean result = doctorService.delete(doctorid);
        return result;
    }

}