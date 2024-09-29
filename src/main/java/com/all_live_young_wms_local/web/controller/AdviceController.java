package com.all_live_young_wms_local.web.controller;

import com.all_live_young_wms_local.web.dto.UserDetailsDTO;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class AdviceController {

    @ModelAttribute
    public void getUserInfo(@AuthenticationPrincipal UserDetailsDTO auth, Model model) {
        if (auth != null) {
            model.addAttribute("authName", auth.getMember().getName());
        } else {
            model.addAttribute("authName", "Guest");
        }
    }
}
