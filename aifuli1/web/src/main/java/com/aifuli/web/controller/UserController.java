package com.aifuli.web.controller;

import com.aifuli.common.common.RavenResult;
import com.aifuli.pojo.vo.StudentVo;
import com.aifuli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/index")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    WebSocket webSocket;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String getTest() {
        StudentVo student = userService.getStudentList().get(0);
        return student.getName();
    }

    @RequestMapping(value = "/getChatTest")
    public ModelAndView getChatTest(Map<String, Object> map) {

        List<String> names = new ArrayList<>();
        names.add("fengli");
        names.add("longjie");
        map.put("name", names);

        return new ModelAndView("mychat", map);
    }


    @RequestMapping(value = "/sendOrder", method = RequestMethod.POST)
    @ResponseBody
    public RavenResult sendOrder(@RequestParam(name = "order") String order) {
        webSocket.sendMessage("收到订单编号：" + order);
        return RavenResult.ok();
    }

}
