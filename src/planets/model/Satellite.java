package planets.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Eugeny on 25.10.2016.
 */
@Entity
public class Satellite {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Basic
    @Column(name = "radius", nullable = true)
    private Integer radius;

    @Basic
    @Column(name = "distance", nullable = true)
    private Integer distance;

    @ManyToOne
    private Planet planet;

    public Satellite(String name, Integer radius, Integer distance) {
        this.name = name;
        this.radius = radius;
        this.distance = distance;
    }

    public Satellite() {
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

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Satellite satellite = (Satellite) o;
        return id == satellite.id &&
                Objects.equals(name, satellite.name) &&
                Objects.equals(radius, satellite.radius) &&
                Objects.equals(distance, satellite.distance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, radius, distance);
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
}
