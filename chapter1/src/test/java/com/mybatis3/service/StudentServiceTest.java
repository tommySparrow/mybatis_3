package com.mybatis3.service;

import com.mybatis3.domain.Student;
import com.mybatis3.services.StudentService;
import org.junit.*;

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
     * 查询单个对象
     */
    @Test
    public void testFindStudentById()
    {
        Student student = studentService.findStudentById(1);
        Assert.assertNotNull(student);
        System.out.println(student);
    }
    /**
     * 查询所有对象
     */
    @Test
    public void testFindAllStudents()
    {
        List<Student> students = studentService.findAllStudents();
        Assert.assertNotNull(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
    /**
     * 创建对象
     */
    @Test
    public void testCreateStudent()
    {
        Student student = new Student();
        int id = 3;
        student.setStudId(id);
        student.setName("student_" + id);
        student.setEmail("student_" + id + "@163.com");
        student.setDob(new Date());
        studentService.createStudent(student);
        Student newStudent = studentService.findStudentById(id);
        Assert.assertNotNull(newStudent);
        System.out.println(newStudent);
    }
}
