package com.all_live_young_wms_local.web.controller;

import com.all_live_young_wms_local.service.SalesService;
import com.all_live_young_wms_local.web.dto.SalesRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/sales")
@Slf4j
public class SalesController {

    private final SalesService salesService;

    @GetMapping
    public String getSales(SalesRequestDTO salesRequestDTO, Model model) {
        model.addAttribute("salesList", salesService.findSales(salesRequestDTO));
        return "/finance/sales-list";
    }
}