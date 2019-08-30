package com.mybatis3.domain;

import lombok.Data;

import java.util.Date;

/**
 *
 * @author User
 */
@Data
public class Student {

    private Integer studId;
    private String name;
    private String email;
    private Date dob;
    private PhoneNumber phone;
}
