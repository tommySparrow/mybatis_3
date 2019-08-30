package com;

import com.mybatis3.domain.PhoneNumber;
import com.mybatis3.domain.Student;
import com.mybatis3.services.StudentService;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class StudentServiceTest {

    private static StudentService studentService;
    @BeforeClass
    public static void setup()
    {
        studentService = new StudentService();
    }
    @AfterClass
    public static void teardown()
    {
        studentService = null;
    }

    /**
     * 创建对象(对象中包含对象属性)
     */
    @Test
    public void testCreateStudent()
    {
        Student student = new Student();
        int id = 5;
        student.setStudId(id);
        student.setName("student_" + id);
        student.setEmail("student_" + id + "@163.com");
        student.setDob(new Date());
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode("111");
        phoneNumber.setNumber("");
        phoneNumber.setStateCode("333");
        student.setPhone(phoneNumber);
        studentService.createStudent(student);
        Student newStudent = studentService.findStudentById(id);
        PhoneNumber phone = newStudent.getPhone();
        System.out.println(phone);
        Assert.assertNotNull(newStudent);
        System.out.println(newStudent);
    }
}
