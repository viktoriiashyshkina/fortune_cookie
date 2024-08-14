package com.example.fortunecookie.controller;

import com.example.fortunecookie.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FortuneController {

    @Autowired
    private FortuneService fortuneService;

    @GetMapping("/")
    public String showFortune(Model model) {
        model.addAttribute("fortune", fortuneService.getRandomFortune());
        model.addAttribute("boxBottomColor", fortuneService.getRandomColor());
        return "index";
    }
}
