package com.lzj.demo.controller;

import com.lzj.demo.entity.PersonalCard;
import com.lzj.demo.service.PersonalCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xcp
 * @version 1.0
 */
@RestController
@RequestMapping("/superadmin")
public class PersonalCardController {
    @Autowired
    private PersonalCardService personalCardService;
    @RequestMapping(value = "/listpersonalcard", method = RequestMethod.GET)
    private Map<String,Object> listPersonalCard(){
        Map<String,Object> modelMap = new HashMap<>();
        List<PersonalCard> list = personalCardService.queryPersonalCard();
        modelMap.put("personalCardList",list);
        return modelMap;
    }
    @RequestMapping(value = "/getpersonalcardbyname",method = RequestMethod.GET)
    private Map<String,Object> getPersonalCardByName(String UID){
        Map<String,Object> modelMap = new HashMap<>();
        PersonalCard personalCard = personalCardService.queryPersonalCardByName(UID);
        modelMap.put("personalCard",personalCard);
        return modelMap;
    }
    @RequestMapping(value = "/insertpersonalcard",method = RequestMethod.POST)
    private Map<String,Object> insertPersonalCard(@RequestBody PersonalCard personalCard){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",personalCardService.insertPersonalCard(personalCard));
        return modelMap;
    }
    @RequestMapping(value = "/updatepersonalcard",method = RequestMethod.POST)
    private Map<String,Object> updatePersonalCard(@RequestBody PersonalCard personalCard){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",personalCardService.updatePersonalCard(personalCard));
        return modelMap;
    }
    @RequestMapping(value = "/deletepersonalcard",method = RequestMethod.POST)
    private Map<String,Object> deletePersonalCard(@RequestBody PersonalCard personalCard){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",personalCardService.deletePersonalCard(personalCard));
        return modelMap;
    }
}
