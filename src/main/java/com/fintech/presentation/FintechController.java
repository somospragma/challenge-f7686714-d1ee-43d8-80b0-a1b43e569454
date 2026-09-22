package com.fintech.presentation;

import com.fintech.application.FintechService;
import com.fintech.domain.FintechDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fintech")
public class FintechController {

    @Autowired
    private FintechService fintechService;

    @PostMapping
    public FintechDTO createFintechEntity(@RequestBody FintechDTO fintechDTO) {
        return fintechService.createFintechEntity(fintechDTO);
    }

    @GetMapping("/{id}")
    public FintechDTO getFintechEntityById(@PathVariable Long id) {
        return fintechService.getFintechEntityById(id);
    }
}