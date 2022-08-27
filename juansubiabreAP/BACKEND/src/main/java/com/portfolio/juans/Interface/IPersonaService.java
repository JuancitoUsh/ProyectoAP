package com.portfolio.juans.Interface;

import com.portfolio.juans.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    ///Traer una lista de personas
    public List<Persona> getPersona();
    
    ///Guardar un objeto del tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero que buscamos po ID
    public void deletePersona(Long id);
    
    //Necesitamos buscar una Persona pero por ID
    public Persona findPersona(Long id);
}
