class Car {

    String make;
    String model;
    String color;

    Car(String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
    }

    void startEngine(){
        System.out.println("Engine of " + make + " " + this.model + " " + color + " color " + " is started....");
    }
    double kwToHpHonda(int kw){
        double resultHonda = kw / 0.745699872;
        return resultHonda;
    }
    double kwToHpLexus(int kw){
        double resultLexus = kw / 0.745699872;
        return resultLexus;
    }
}
