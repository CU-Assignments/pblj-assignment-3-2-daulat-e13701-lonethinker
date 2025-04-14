package com.example.banking.controller;

import com.example.banking.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banking")
public class BankingController {

    @Autowired
    private BankingService bankingService;

    @PostMapping("/transfer")
    public String transferMoney(
            @RequestParam Long fromId,
            @RequestParam Long toId,
            @RequestParam double amount) {
        return bankingService.transferMoney(fromId, toId, amount);
    }
}
