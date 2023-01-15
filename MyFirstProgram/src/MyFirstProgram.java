public class MyFirstProgram {
    public static void main(String[] args) {

        Car myCar = new Car("Honda","Accord", "Cherry Red");
        /*myCar.make = "Honda";
        myCar.model = "Accord";
        myCar.color = "Cherry Red";*/
        myCar.startEngine();

        Car myCar2 = new Car("Lexus","LS500","Purple");
        /*myCar2.make = "Lexus";
        myCar2.model = "LS500";
        myCar2.color = "Purple"*/
        myCar2.startEngine();

        double hpPowerHonda = myCar.kwToHpHonda(110);
        System.out.println("and there is " + hpPowerHonda + " Honda horse! ");
        double hpPowerLexus = myCar.kwToHpLexus(200);
        System.out.println("and there is " + hpPowerLexus + " Lexus horse! ");
    }

}

