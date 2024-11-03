package com.workshop.model;

import javafx.beans.property.*;

public class Supplier {
    private final StringProperty nom;
    private final StringProperty ref;
    private final IntegerProperty qte;
    private final StringProperty designation;
    private final IntegerProperty qte2;
    private final DoubleProperty puTtc;
    private final DoubleProperty total;
    private final StringProperty modePaiement;

    public Supplier(String nom, String ref, int qte, String designation,
                    int qte2, double puTtc, String modePaiement) {
        this.nom = new SimpleStringProperty(nom);
        this.ref = new SimpleStringProperty(ref);
        this.qte = new SimpleIntegerProperty(qte);
        this.designation = new SimpleStringProperty(designation);
        this.qte2 = new SimpleIntegerProperty(qte2);
        this.puTtc = new SimpleDoubleProperty(puTtc);
        this.total = new SimpleDoubleProperty(this.qte2.get() * this.puTtc.get());
        this.modePaiement = new SimpleStringProperty(modePaiement);
    }

    // Getters for properties
    public StringProperty nomProperty() { return nom; }
    public StringProperty refProperty() { return ref; }
    public IntegerProperty qteProperty() { return qte; }
    public StringProperty designationProperty() { return designation; }
    public IntegerProperty qte2Property() { return qte2; }
    public DoubleProperty puTtcProperty() { return puTtc; }
    public DoubleProperty totalProperty() { return total; }
    public StringProperty modePaiementProperty() { return modePaiement; }

    // Getters for values
    public String getNom() { return nom.get(); }
    public String getRef() { return ref.get(); }
    public int getQte() { return qte.get(); }
    public String getDesignation() { return designation.get(); }
    public int getQte2() { return qte2.get(); }
    public double getPuTtc() { return puTtc.get(); }
    public double getTotal() { return total.get(); }
    public String getModePaiement() { return modePaiement.get(); }
}