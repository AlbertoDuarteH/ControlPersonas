package mx.com.betodata.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="PERSONAS")
@Data
public class Persona {
    
    @Id
    @Column(name = "ID_PER")
    private Long id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO_PAT")
    private String apellidoPat;
    @Column(name = "APELLIDO_MAT")
    private String apellidoMat;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFONO")
    private String telefono;


}
