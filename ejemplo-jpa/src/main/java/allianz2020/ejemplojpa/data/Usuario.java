package allianz2020.ejemplojpa.data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Table(name="USERS")
@Entity
public class Usuario {
    @Id
    private Long id;
    @Column(name="NAME", unique = true)
    private String nombre;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="REGISTER_TIME")
    private Date fechaRegistro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
