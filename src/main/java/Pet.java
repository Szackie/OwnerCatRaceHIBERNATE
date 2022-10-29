import javax.persistence.*;

@Entity
class Pet {
    @Id
    @GeneratedValue

    private Integer id;
    private String name;
    @OneToOne(mappedBy = "pet")
    private Owner owner;
@ManyToOne(targetEntity = Race.class)
    private Race race;



    Race getRace() {
        return race;
    }

    void setRace(Race race) {
        this.race = race;
    }

    Pet() {
    }

    Pet( String name, Owner owner) {

        this.name = name;
        this.owner = owner;
    }

    Integer getId() {
        return id;
    }

    void setId(Integer id) {
        this.id = id;
    }



    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Owner getOwner() {
        return owner;
    }

    void setOwner(Owner owner) {
        this.owner = owner;
    }
}
