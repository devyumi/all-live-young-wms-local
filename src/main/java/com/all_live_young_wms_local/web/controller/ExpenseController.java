package com.all_live_young_wms_local.web.controller;

import com.all_live_young_wms_local.service.ExpenseService;
import com.all_live_young_wms_local.web.dto.ExpenseRequestDTO;
import com.all_live_young_wms_local.web.dto.ExpenseSaveDTO;
import com.all_live_young_wms_local.web.dto.UserDetailsDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/save")
    public String getExpenseSaveForm(Model model) {
        model.addAttribute("expenseSaveDTO", new ExpenseSaveDTO());
        return "/finance/expense-form";
    }

    @PostMapping("/save")
    public String postExpenseSaveForm(@AuthenticationPrincipal UserDetailsDTO user, Model model,
                                      @ModelAttribute @Validated ExpenseSaveDTO expenseSaveDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("expenseSaveDTO", expenseSaveDTO);
            printErrorLog(bindingResult);
            return "/finance/expense-form";
        }
        expenseService.saveExpense(expenseSaveDTO, user.getMember().getWarehouse());
        log.info("지출 등록 완료 | 등록자: {}", user.getMember().getName());
        return "redirect:/expenses";
    }

    private static void printErrorLog(BindingResult result) {
        log.info("{}", "*".repeat(20));
        for (FieldError fieldError : result.getFieldErrors()) {
            log.error("{}: {}", fieldError.getField(), fieldError.getDefaultMessage());
        }
        log.info("{}", "*".repeat(20));
    }
}