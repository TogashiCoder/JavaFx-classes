package com.workshop.model;

import javafx.beans.property.*;

public class SalesRecord {
    private final StringProperty date;
    private final StringProperty ref;
    private final IntegerProperty qte;
    private final StringProperty designation;
    private final IntegerProperty qte2;
    private final DoubleProperty puttc;
    private final DoubleProperty total;
    private final StringProperty payment;

    public SalesRecord(String date, String ref, int qte, String designation,
                       int qte2, double puttc, double total, String payment) {
        this.date = new SimpleStringProperty(date);
        this.ref = new SimpleStringProperty(ref);
        this.qte = new SimpleIntegerProperty(qte);
        this.designation = new SimpleStringProperty(designation);
        this.qte2 = new SimpleIntegerProperty(qte2);
        this.puttc = new SimpleDoubleProperty(puttc);
        this.total = new SimpleDoubleProperty(total);
        this.payment = new SimpleStringProperty(payment);
    }

    // Getters for properties
    public StringProperty dateProperty() { return date; }
    public StringProperty refProperty() { return ref; }
    public IntegerProperty qteProperty() { return qte; }
    public StringProperty designationProperty() { return designation; }
    public IntegerProperty qte2Property() { return qte2; }
    public DoubleProperty puttcProperty() { return puttc; }
    public DoubleProperty totalProperty() { return total; }
    public StringProperty paymentProperty() { return payment; }

    // Getters and setters for values
    public String getDate() { return date.get(); }
    public void setDate(String value) { date.set(value); }

    public String getRef() { return ref.get(); }
    public void setRef(String value) { ref.set(value); }

    public int getQte() { return qte.get(); }
    public void setQte(int value) { qte.set(value); }

    public String getDesignation() { return designation.get(); }
    public void setDesignation(String value) { designation.set(value); }

    public int getQte2() { return qte2.get(); }
    public void setQte2(int value) { qte2.set(value); }

    public double getPuttc() { return puttc.get(); }
    public void setPuttc(double value) { puttc.set(value); }

    public double getTotal() { return total.get(); }
    public void setTotal(double value) { total.set(value); }

    public String getPayment() { return payment.get(); }
    public void setPayment(String value) { payment.set(value); }
}