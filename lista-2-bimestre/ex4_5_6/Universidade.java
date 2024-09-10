package ex4_5_6;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Departamento> departamentos;

    public Universidade() {
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        if (departamentos.size() < 50) {
            departamentos.add(departamento);
        } else {
            System.out.println("Número máximo de departamentos atingido.");
        }
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
}
