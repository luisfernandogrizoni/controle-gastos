package com.luisfatec.demo.controller;

import com.luisfatec.demo.model.Gasto;
import com.luisfatec.demo.repository.GastoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/gastos")
public class GastoController {
    private final GastoRepository repository;
    public GastoController(GastoRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public String listarGastos(Model model) {
        model.addAttribute("gastos", repository.findAll());
        model.addAttribute("novoGasto", new Gasto());
        return "gastos";
    }

    @PostMapping
    public String salvarGasto(@ModelAttribute Gasto gasto) {
        repository.save(gasto);
        return "redirect:/gastos";
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deletarGasto(@PathVariable Long id) {
        repository.deleteById(id);
    }
}