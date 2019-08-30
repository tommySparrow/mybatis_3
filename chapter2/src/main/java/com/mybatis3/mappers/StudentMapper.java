package com.mybatis3.mappers;

import com.mybatis3.domain.Student;

import java.util.List;

/**
 * @author User
 */
public interface StudentMapper {
    List<Student> findAllStudents();
    Student findStudentById(Integer id);

    /**
     * 往表里插入字符串对象
     * @param student
     */
    void insertStudent(Student student);
}
