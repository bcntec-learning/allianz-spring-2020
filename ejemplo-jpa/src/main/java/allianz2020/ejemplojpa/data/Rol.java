package allianz2020.ejemplojpa.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rol {
    @Id
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
