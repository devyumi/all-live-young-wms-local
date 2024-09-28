package com.all_live_young_wms_local.web.controller;

import com.all_live_young_wms_local.web.dto.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
        model.addAttribute("loginDTO", new LoginDTO());
        model.addAttribute("error", error);
        return "/login";
    }
}
