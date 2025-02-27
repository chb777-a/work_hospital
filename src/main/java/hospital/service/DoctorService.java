package hospital.service;

import hospital.model.dto.DoctorDto;
import hospital.model.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    //ㅇ 의사 등록
    public boolean register(DoctorDto doctorDto) {
        System.out.println("DoctorService.register");
        System.out.println("doctorDto = " + doctorDto);
        boolean result = doctorMapper._register(doctorDto);
        return result;
    }

    // 의사 목록 조회
    public List<DoctorDto> findAll() {
        System.out.println("DoctorService.findAll start");
        List<DoctorDto> result = doctorMapper._findAll();
        return result;
    }

    // 의사 상세 조회
    public DoctorDto find(int doctorid) {
        System.out.println("DoctorService.find start");
        System.out.println("doctorid = " + doctorid);
        DoctorDto result = doctorMapper._find(doctorid);
        return result;
    }

    // 의사 정보 수정
    public boolean update(DoctorDto doctorDto) {
        System.out.println("DoctorService.update");
        System.out.println("doctorDto = " + doctorDto);
        boolean result = doctorMapper._update(doctorDto);
        return result;
    }

    // 의사 삭제
    public boolean delete(int doctorid) {
        System.out.println("DoctorService.delete");
        System.out.println("doctorid = " + doctorid);
        boolean result = doctorMapper._delete(doctorid);
        return result;
    }


}