package com.example.easy_school_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }
}
