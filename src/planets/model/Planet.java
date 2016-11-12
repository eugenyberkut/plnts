package planets.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by Eugeny on 25.10.2016.
 * DB Planets
 */
@Entity
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(nullable = false, length = 20)
    private String name;

    @Basic
    private Integer radius;

    @Basic
    private Integer temp;

    @Basic
    private Byte life;

    @Basic
    private Byte atm;

    @ManyToOne
    private Star star;

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

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    @OneToMany(mappedBy = "planet")
    private Collection<Satellite> satellites;

    public Collection<Satellite> getSatellites() {
        return satellites;
    }

    public void setSatellites(Collection<Satellite> satellites) {
        this.satellites = satellites;
    }
}
