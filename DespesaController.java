
package com.app.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.app.model.Despesa;
import com.app.service.FinanceiroService;

@RestController
@RequestMapping("/api/despesas")
public class DespesaController {

    private FinanceiroService service = new FinanceiroService();

    @PostMapping
    public void criar(@RequestBody Despesa d) {
        service.adicionar(d);
    }

    @GetMapping
    public List<Despesa> listar() {
        return service.listar();
    }

    @GetMapping("/total")
    public double total() {
        return service.total();
    }
}
