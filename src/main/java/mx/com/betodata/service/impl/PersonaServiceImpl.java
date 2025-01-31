package mx.com.betodata.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.betodata.entities.Persona;
import mx.com.betodata.repositories.PersonaRepository;
import mx.com.betodata.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    @Transactional(readOnly = true)   //la notacion transaccional es para proteger los datos si algo sale se puedan
                                      //volver a su estado inicial
    public Optional<Persona> findByEmail(String email) {
        return personaRepository.findByEmail(email);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    @Transactional
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    @Transactional
    public void deletePersona(Persona persona) {
        personaRepository.delete(persona);
    }
    
}
