package com.project.schoolmanagment.repository;

import com.project.schoolmanagment.entity.concretes.AdvisorTeacher;
import com.project.schoolmanagment.entity.concretes.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdvisoryTeacherRepository extends JpaRepository<AdvisorTeacher,Long> {
    boolean existsById(Long advisorTeacherId);
    Optional<AdvisorTeacher> getAdvisorTeacherByTeacher_Id(Long advisorTeacherId);
    AdvisorTeacher getAdvisorTeacherByTeacher_Ssn(String ssn);
}
