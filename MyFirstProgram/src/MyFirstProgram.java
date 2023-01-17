import mypackage.*;
import yourpackage.subpackage.*;
import java.util.Scanner;


public class MyFirstProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter jour name: ");
        String username = scanner.nextLine();
        System.out.println("Hello my Name is: " + username);

        System.out.println(" ");

        Car myCar = new Car("Honda","Accord", "Cherry Red");
        /*myCar.make = "Honda";    //Sa podrazumevanim Konstruktorom
        myCar.model = "Accord";
        myCar.color = "Cherry Red";*/
        myCar.startEngine();

        double hpPowerHonda = myCar.kwToHpHonda(110);
        System.out.println("and there is " + hpPowerHonda + " Honda Power Horse! ");
        System.out.println(" ");

        Car myCar2 = new Car("Lexus","LS500","Purple");
        /*myCar2.make = "Lexus";    //Sa podrazumevanim Konstruktorom
        myCar2.model = "LS500";
        myCar2.color = "Purple"*/
        myCar2.startEngine();

        double hpPowerLexus = myCar.kwToHpLexus(200);
        System.out.println("and there is " + hpPowerLexus + " Lexus Power Horse! ");


    }

}

