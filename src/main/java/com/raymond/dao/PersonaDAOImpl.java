package com.raymond.dao;

import com.raymond.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements PersonaDAO{


    @Override
    public List<Persona> listarTodos() {
        List<Persona> lista=new ArrayList<>();

        Persona per=new Persona();
        per.setId(1);
        per.setNombres("Raymond T");
        lista.add(per);

        per=new Persona();
        per.setId(2);
        per.setNombres("Otra persona");
        lista.add(per);

        return lista;
        // Reemplazar por tomar de base de datos
    }

    @Override
    public Persona leerPorId(int id) {
        //Lógica
        return null;
    }

    @Override
    public void registrar(Persona persona) {
        System.out.println("Persona "+persona.getNombres()+" registrada");
    }

    @Override
    public void actualizar(Persona persona) {
        System.out.println("Persona "+persona.getNombres()+" actualizada");

    }

    @Override
    public void eliminar(int id) {
        System.out.println("id "+id+" eliminado");
    }
}
