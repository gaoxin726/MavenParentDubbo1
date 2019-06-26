package com.qphone.controller;

import com.qphone.pojo.Text;
import com.qphone.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TextController {
    @Autowired
    private TextService textService;
    @RequestMapping("/text")
    public List<Text> getall(){

        return textService.getall();
    }
}
