package allianz2020.ejemplojpa.data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "USERS")
@Entity
public class Usuario {
    @Id
    private Long id;
    @Column(name = "NAME", unique = true)
    private String nombre;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REGISTER_TIME")
    private Date fechaRegistro;

    @Transient
    private String prueba;

    @ManyToMany(fetch = FetchType.LAZY)
    //@JoinTable(name = "users_roles")
    //@JoinColumn
    List<Rol> roles;


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

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
