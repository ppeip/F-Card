package com.lzj.demo.controller;

import com.lzj.demo.entity.PersonalCard;
import com.lzj.demo.entity.User;
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
 * @author lzj
 * @version 2.0
 */
@RestController
@RequestMapping("/personalCard")
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

    @RequestMapping(value = "/getpersonalcardbyuid",method = RequestMethod.GET)
    private Map<String,Object> getPersonalCardByName(String UID,String cardName){
        Map<String,Object> modelMap = new HashMap<>();
        PersonalCard personalCard = personalCardService.queryPersonalCardByName(UID,cardName);
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



    @RequestMapping(value = "/rollpersonalcard",method = RequestMethod.POST)
    private Map<String,Object> rollPersonalCard(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("personalCard",personalCardService.rollCard(user));
        return modelMap;
    }

}
