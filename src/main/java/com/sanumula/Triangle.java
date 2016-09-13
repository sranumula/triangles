package com.sanumula;

/**
 * Created by sanumula on 9/9/16.
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        if(this.sideA <=0 || this.sideB <=0 || this.sideC<=0)
            throw new IllegalArgumentException("Lengths of the sides should always be greater than 0");
        if((this.sideA+this.sideB <= this.sideC) || (this.sideB+this.sideC<=this.sideA) || (this.sideA+this.sideC<=this.sideB))
            throw new IllegalArgumentException("Sum of two sides should always be greater than third side for it to be a triangle");
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.getSideA(), getSideA()) != 0)
            return false;
        if (Double.compare(triangle.getSideB(), getSideB()) != 0)
            return false;
        return Double.compare(triangle.getSideC(), getSideC()) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getSideA());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSideB());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSideC());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
            "sideA=" + sideA +
            ", sideB=" + sideB +
            ", sideC=" + sideC +
            '}';
    }

    public TriangleType getType(){
        if(Double.compare(this.getSideA(),this.getSideB()) == 0 && Double.compare(this.getSideB(),this.getSideC())==0)
            return TriangleType.EQUILATERAL;
        if(Double.compare(this.getSideA(),this.getSideB())!=0 && Double.compare(this.getSideB(),this.getSideC())!=0 && Double.compare(this.getSideA(),this.getSideC())!=0)
            return TriangleType.SCALENE;
        return TriangleType.ISOSCELES;

    }
}
