
package com.app.service;

import java.util.List;
import com.app.model.Despesa;
import com.app.repository.DespesaRepository;

public class FinanceiroService {
    private DespesaRepository repository = new DespesaRepository();

    public void adicionar(Despesa d) {
        repository.save(d);
    }

    public double total() {
        return repository.findAll().stream()
            .mapToDouble(Despesa::getValor)
            .sum();
    }

    public List<Despesa> listar() {
        return repository.findAll();
    }
}
