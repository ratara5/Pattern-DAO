package com.raymond.dao;

import com.raymond.model.Medico;
import com.raymond.model.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoDAOImpl implements MedicoDAO{

    @Override
    public List<Medico> listarTodos() {
        List<Medico> lista=new ArrayList<>();

        Medico med=new Medico();
        med.setId(1);
        med.setNombres("Mata Lozano");
        lista.add(med);

        med=new Medico();
        med.setId(2);
        med.setNombres("Doctor Tículis");
        lista.add(med);

        return lista;
        // Reemplazar por tomar de base de datos
    }

    @Override
    public Medico leerPorId(int id) {
        return null;
    }

    @Override
    public void registrar(Medico medico) {

    }

    @Override
    public void actualizar(Medico medico) {

    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public void curar() {

    }
}
