import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
class Owner {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")


    private Integer id;
    private String firstName;
    private String lastName;

    @OneToOne
    private Pet pet;

    Owner() {
    }

    Owner(Integer id, String firstName, String lastName, Pet pet) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
    }

    Integer getId() {
        return id;
    }

    void setId(Integer id) {
        this.id = id;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    Pet getPet() {
        return pet;
    }

    void setPet(Pet pet) {
        this.pet = pet;
    }


}
