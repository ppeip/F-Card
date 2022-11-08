package com.lzj.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xcp
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    Integer collegeInflunce;
    Integer coin;
    String name;
    String password;
    String college;
    String phoneNumber;
    String UID;
    String dateTime;
    String task;
}
