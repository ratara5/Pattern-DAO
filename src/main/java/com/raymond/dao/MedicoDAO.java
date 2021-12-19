package com.raymond.dao;

import com.raymond.model.Medico;
import com.raymond.model.Persona;

import java.util.List;

public interface MedicoDAO extends CRUD<Medico> {
    void curar();

}
