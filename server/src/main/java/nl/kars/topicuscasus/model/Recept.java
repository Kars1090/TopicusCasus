package nl.kars.topicuscasus.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Recept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recept_id")
    private long id;

    @ManyToMany
    @JoinTable(name = "ReceptVerpakking",
            joinColumns = {@JoinColumn(name = "RECEPT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "VERPAKKING_ID")})
    private Set<Verpakking> verpakkingen;

    @Column(nullable = false)
    private String bsn;

    @Column(nullable = false)
    private Date voorschrijfDatum;

    @Column(nullable = false)
    private Aflevermethode afleverMethode;

    @Column(nullable = false)
    private Date eindDatum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Verpakking> getVerpakkingen() {
        return verpakkingen;
    }

    public void setVerpakkingen(Set<Verpakking> verpakkingen) {
        this.verpakkingen = verpakkingen;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String BSN) {
        this.bsn = BSN;
    }

    public Date getVoorschrijfDatum() {
        return voorschrijfDatum;
    }

    public void setVoorschrijfDatum(Date voorschrijfDatum) {
        this.voorschrijfDatum = voorschrijfDatum;
    }

    public Aflevermethode getAfleverMethode() {
        return afleverMethode;
    }

    public void setAfleverMethode(Aflevermethode afleverMethode) {
        this.afleverMethode = afleverMethode;
    }

    public Date getEindDatum() {
        return eindDatum;
    }

    public void setEindDatum(Date eindDatum) {
        this.eindDatum = eindDatum;
    }
}
