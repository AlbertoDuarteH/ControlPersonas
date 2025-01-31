package mx.com.betodata.service;

import java.util.List;
import java.util.Optional;

import mx.com.betodata.entities.Persona;


public interface PersonaService {

    public Optional<Persona> findByEmail(String email);
    public Optional<Persona> findById(Long id);
    public List<Persona> findAllPersonas();
    public Persona savePersona(Persona persona);
    public void deletePersona(Persona persona);
}
