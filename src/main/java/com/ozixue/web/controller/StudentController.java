package com.ozixue.web.controller;

import com.ozixue.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("username", "张三");
        model.addAttribute("age", 18);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101,"zhangsan",18));
        list.add(new Student(102,"lisi",20));
        list.add(new Student(103,"wangwu",18));
        model.addAttribute("stuList", list);
        return "stu/list";
    }

}
