package com.project.schoolmanagment.repository;

import com.project.schoolmanagment.entity.concretes.LessonProgram;
import com.project.schoolmanagment.entity.concretes.Student;
import com.project.schoolmanagment.entity.concretes.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {

    boolean existsBySsn(String ssn);
    List<Teacher> getTeacherByNameContaining(String name);

    Teacher getTeacherBySsn(String ssn);

    boolean existsByPhoneNumber(String studentNumber);
    boolean existsByEmail(String studentNumber);



}
