
package com.app.repository;

import java.util.ArrayList;
import java.util.List;
import com.app.model.Despesa;

public class DespesaRepository {
    private List<Despesa> despesas = new ArrayList<>();

    public void save(Despesa d) {
        despesas.add(d);
    }

    public List<Despesa> findAll() {
        return despesas;
    }
}
