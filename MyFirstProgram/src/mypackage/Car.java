package mypackage;

public class Car {

    public String make;
    public String model;
    public String color;

    // (Podrazumevani Konstruktor) Bez ulaznih parametara

    /* public mypackage.Car(){

    } */

    public Car(String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
    }

   // Metoda bez povratne vrednosti
    public void startEngine(){
        System.out.println("Engine of " + make + " " + this.model + " " + color + " color " + " is started....");
    }
    // Metode sa povratnim vrednostima koja na kraju ispisuje vrednost resultHonda, resultLexus....
    public double kwToHpHonda(int kw){
        double resultHonda = kw / 0.745699872;
        return resultHonda;
    }
    public double kwToHpLexus(int kw){
        double resultLexus = kw / 0.745699872;
        return resultLexus;
    }
}
