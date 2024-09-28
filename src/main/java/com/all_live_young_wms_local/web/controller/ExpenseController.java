package com.all_live_young_wms_local.web.controller;

import com.all_live_young_wms_local.service.ExpenseService;
import com.all_live_young_wms_local.web.dto.ExpenseRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/expenses")
@Slf4j
public class ExpenseController {

    private final ExpenseService expenseService;

    @GetMapping
    public String getExpenses(ExpenseRequestDTO expenseRequestDTO, Model model) {
        model.addAttribute("expenseList", expenseService.findExpenses(expenseRequestDTO));
        return "/finance/expense-list";
    }

    @GetMapping("/{id}")
    public String getExpense(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("expense", expenseService.findExpense(id));
        return "/finance/expense-details";
    }
}