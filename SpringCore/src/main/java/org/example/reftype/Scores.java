package org.example.reftype;

public class Scores {
    private double maths;
    private double chem;
    private double pys;

    public Scores() {
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getChem() {
        return chem;
    }

    public void setChem(double chem) {
        this.chem = chem;
    }

    public double getPys() {
        return pys;
    }

    public void setPys(double pys) {
        this.pys = pys;
    }

    public Scores(double maths, double chem, double pys) {
        this.maths = maths;
        this.chem = chem;
        this.pys = pys;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "maths=" + maths +
                ", chem=" + chem +
                ", pys=" + pys +
                '}';
    }
}
