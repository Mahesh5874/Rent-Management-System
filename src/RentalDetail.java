/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahesh
 */
public class RentalDetail {
      private int flat;
    private int home;
    
    private double numberofroom;
    private String location;
    private double deposit;
    private double monthlyrent;
    private double electricity;
    private double waterbill;

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public double getNumberofroom() {
        return numberofroom;
    }

    public void setNumberofroom(double numberofroom) {
        this.numberofroom = numberofroom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getMonthlyrent() {
        return monthlyrent;
    }

    public void setMonthlyrent(double monthlyrent) {
        this.monthlyrent = monthlyrent;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getWaterbill() {
        return waterbill;
    }

    public void setWaterbill(double waterbill) {
        this.waterbill = waterbill;
    }
}
