
package hospital.model.mapper;

import hospital.model.dto.AppointmentDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AppointmentMapper {

    // 진료 예약 등록
    @Insert("insert into appointment(patientid, doctorid, appointmentdate, appointmenttime) " +
            "values(#{patientid}, #{doctorid}, #{appointmentdate}, #{appointmenttime})")
    boolean register(AppointmentDto appointmentDto);

    // 진료 예약 전체 조회
    @Select("select * from appointment")
    List<AppointmentDto> findAll();

    // 진료 예약 목록 조회
    @Select("select * from appointment where appointmentdate = #{appointmentdate}")
    List<AppointmentDto> findDate(String appointmentdate);

    // 환자별 예약 조회
    @Select("select * from appointment where patientid = #{patientid}")
    List<AppointmentDto> findPatient(int patientid);

    // 의사별 예약 조회
    @Select("select * from appointment where doctorid = #{doctorid}")
    List<AppointmentDto> findDoctor(int doctorid);

    // 예약 수정
    @Update("update appointment set " +
            "appointmentdate = #{appointmentdate}, appointmenttime = #{appointmenttime} " +
            "where appointmentid = #{appointmentid}")
    boolean update(AppointmentDto appointmentDto);

    // 예약 취소
    @Update("update appointment set status = 0 where appointmentid = #{appointmentid}")
    boolean cancel(int appointmentid);

}
