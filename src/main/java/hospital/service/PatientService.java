package hospital.service;

import hospital.model.dto.PatientDto;
import hospital.model.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientMapper patientMapper;

    // 환자 등록
    public boolean register(PatientDto patientDto) {
        System.out.println("PatientService.register");
        System.out.println("patientDto = " + patientDto);
        boolean result = patientMapper.register(patientDto);
        return result;
    }

    // 환자 목록 조회
    public List<PatientDto> findAll() {
        System.out.println("PatientService.findAll");
        List<PatientDto> result = patientMapper.findAll();
        return result;
    }

    // 환자 상세 조회
    public PatientDto find(int patientid) {
        System.out.println("PatientService.find");
        System.out.println("patientid = " + patientid);
        PatientDto result = patientMapper.find(patientid);
        return result;
    }

    // 환자 정보 수정
    public boolean update(PatientDto patientDto) {
        System.out.println("PatientService.update");
        System.out.println("patientDto = " + patientDto);
        boolean result = patientMapper.update(patientDto);
        return result;
    }

    // 환자 삭제
    public boolean delete(int patientid) {
        System.out.println("PatientService.delete");
        System.out.println("patientid = " + patientid);
        boolean result = patientMapper.delete(patientid);
        return result;
    }

}