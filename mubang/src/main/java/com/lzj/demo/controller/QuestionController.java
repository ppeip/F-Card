package com.lzj.demo.controller;

import com.lzj.demo.entity.Question;
import com.lzj.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xcp
 * @version 1.0
 */
@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @CrossOrigin
    @RequestMapping(value = "/listquestion", method = RequestMethod.GET)
    private Map<String,Object> listQuestion(){
        Map<String,Object> modelMap = new HashMap<>();
        List<Question> list = questionService.queryQuestion();
        modelMap.put("questionList",list);
        return modelMap;
    }

    @CrossOrigin
    @RequestMapping(value = "/getquestionbyname",method = RequestMethod.GET)
    private Map<String,Object> getQuestionByName(String questionName){
        Map<String,Object> modelMap = new HashMap<>();
        Question question = questionService.queryQuestionByName(questionName);
        modelMap.put("question",question);
        return modelMap;
    }

    @CrossOrigin
    @RequestMapping(value = "/insertquestion",method = RequestMethod.POST)
    private Map<String,Object> insertQuestion(@RequestBody Question question){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",questionService.insertQuestion(question));
        return modelMap;
    }

    @CrossOrigin
    @RequestMapping(value = "/updatequestion",method = RequestMethod.POST)
    private Map<String,Object> updateQuestion(@RequestBody Question question){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",questionService.updateQuestion(question));
        return modelMap;
    }

    @CrossOrigin
    @RequestMapping(value = "/deletequestion",method = RequestMethod.POST)
    private Map<String,Object> deleteQuestion(@RequestBody Question question){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",questionService.deleteQuestion(question));
        return modelMap;
    }
}
