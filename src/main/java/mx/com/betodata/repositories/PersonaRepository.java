package mx.com.betodata.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.betodata.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
    public Optional<Persona> findByEmail(String email);

}
