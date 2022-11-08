package com.lzj.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xcp
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    Integer questionAbility1;
    Integer questionAbility2;
    Integer questionAbility3;
    Integer questionAbility4;
    Integer questionAbility5;
    String questionName;
    String preferance;

}
