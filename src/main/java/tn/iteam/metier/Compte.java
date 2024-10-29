package tn.iteam.metier;

import java.util.Date;

public class Compte {
    private long id ;
    private double sold;
    private Date dateCreation;

    public Compte() {
    }

    public Compte(long id, double sold, Date dateCreation) {
        this.id = id;
        this.sold = sold;
        this.dateCreation = dateCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

}
