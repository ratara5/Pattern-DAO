package com.raymond;

import com.raymond.dao.*;
import com.raymond.model.Medico;
import com.raymond.model.Persona;

public class App {

    public static void main(String[] args) {
        PersonaDAO dao=new PersonaDAOImpl(); //Buena práctica: trabajar orientado bajo interfaces para desacoplar el código
        dao.listarTodos().forEach(x-> System.out.println(x.getNombres()));

        Persona per=new Persona();
        per.setId(3);
        per.setNombres("Una más");
        dao.registrar(per);

        dao.listarTodos().forEach(x-> System.out.println(x.getNombres())); //Implementar lógica para que nueva persona sea agregada a la lista de personas

        CRUD<Medico> dao1=new MedicoDAOImpl(); //También se puede MedicoDAO dao1...
        dao1.listarTodos().forEach(x-> System.out.println(x.getNombres()));

    }

}
