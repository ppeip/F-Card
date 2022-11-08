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
public class PersonalCard {
    Integer ability1;
    Integer ability2;
    Integer ability3;
    Integer ability4;
    Integer ability5;
    Integer cardLevel;
    Integer experience;
    String rank; //讲师，副教授，教授，院士
    String cardName;
    String introduction;
    String preferance;
    String situation;
    String UID;
}
