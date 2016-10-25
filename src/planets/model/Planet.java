package planets.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Eugeny on 25.10.2016.
 * DB Planets
 */
@Entity
public class Planet {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Basic
    @Column(name = "radius", nullable = true)
    private Integer radius;

    @Basic
    @Column(name = "temp", nullable = true)
    private Integer temp;

    @Basic
    @Column(name = "life", nullable = true)
    private Byte life;

    @Basic
    @Column(name = "atm", nullable = true)
    private Byte atm;

    public Planet() {
    }

    public Planet(String name, Integer radius, Integer temp, Byte life, Byte atm) {
        this.name = name;
        this.radius = radius;
        this.temp = temp;
        this.life = life;
        this.atm = atm;
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

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Byte getLife() {
        return life;
    }

    public void setLife(Byte life) {
        this.life = life;
    }

    public Byte getAtm() {
        return atm;
    }

    public void setAtm(Byte atm) {
        this.atm = atm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return id == planet.id &&
                Objects.equals(name, planet.name) &&
                Objects.equals(radius, planet.radius) &&
                Objects.equals(temp, planet.temp) &&
                Objects.equals(life, planet.life) &&
                Objects.equals(atm, planet.atm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, radius, temp, life, atm);
    }
}
