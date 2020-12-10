package nl.kars.topicuscasus.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
public class Verpakking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "verpakking_id")
    private int id;

    @Column(nullable = false)
    private Eenheid eenheid;

    @ManyToOne(optional = false)
    @JoinColumn(name = "naam")
    @Fetch(value = FetchMode.SELECT)
    private Medicijn medicijn;

    @Column(nullable = false)
    private int aantal = 0;

    @Column(nullable = false)
    private int tablettenPerStrip = 0;

    @Column(nullable = false)
    private int milliliterPerFlesje = 0;

    @Column(nullable = false)
    private int overig = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Eenheid getEenheid() {
        return eenheid;
    }

    public void setEenheid(Eenheid eenheid) {
        this.eenheid = eenheid;
    }

    public Medicijn getMedicijn() {
        return medicijn;
    }

    public void setMedicijn(Medicijn medicijn) {
        this.medicijn = medicijn;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public int getTablettenPerStrip() {
        return tablettenPerStrip;
    }

    public void setTablettenPerStrip(int tablettenPerStrip) {
        this.tablettenPerStrip = tablettenPerStrip;
    }

    public int getMilliliterPerFlesje() {
        return milliliterPerFlesje;
    }

    public void setMilliliterPerFlesje(int milliliterPerFlesje) {
        this.milliliterPerFlesje = milliliterPerFlesje;
    }

    public int getOverig() {
        return overig;
    }

    public void setOverig(int overig) {
        this.overig = overig;
    }
}
