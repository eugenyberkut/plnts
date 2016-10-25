package planets.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Eugeny on 25.10.2016.
 */
@Entity
public class Star {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public Star() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return id == star.id &&
                Objects.equals(name, star.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
