package nl.kars.topicuscasus.model;

import javax.persistence.*;

@Entity
public class ReceptVerpakking {

    @Id
    long id;

    @Column
    String gebruiksVoorschrift;

    public String getGebruiksVoorschrift() {
        return gebruiksVoorschrift;
    }

    public void setGebruiksVoorschrift(String gebruiksVoorschrift) {
        this.gebruiksVoorschrift = gebruiksVoorschrift;
    }
}
