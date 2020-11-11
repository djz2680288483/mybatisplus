package com.djz.controller;

import com.djz.pojo.User;
import com.djz.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
     @RequestMapping("/add")
    @ResponseBody
    public String test() throws JsonProcessingException {
    ObjectMapper o=new ObjectMapper();
    User user=new User();
    user.setName("赵云");
    user.setAge(33);
    user.setEmail("070499@qq.com");
    user.setUpdateTime(new Date());
      String str= JsonUtils.getJson(user);
    return str;

    }

    @RequestMapping("/time")
    @ResponseBody
    public String test1() throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        Date date=new Date();
        objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS,true);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        objectMapper.setDateFormat(sdf);

        return objectMapper.writeValueAsString(date);
    }

    @RequestMapping("/time1")
    @ResponseBody
    public String test2()  {

        Date date=new Date();
        String string = JsonUtils.timeToJson(date);
        return string;

    }

    @RequestMapping("/time2")
    @ResponseBody
    public String test3()  {
        Date date=new Date();
        String string=  JsonUtils.getJson(date,"yyyy/MM/dd");
        return string;
    }
}
