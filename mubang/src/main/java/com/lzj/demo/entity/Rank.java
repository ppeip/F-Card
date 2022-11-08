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
public class Rank {
    Integer collegeInfluence;
    Integer grade;
    String name;
    Integer rank;
    String college;
}
