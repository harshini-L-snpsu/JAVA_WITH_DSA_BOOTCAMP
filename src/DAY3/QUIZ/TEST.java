package DAY3.QUIZ;
import java.util.Scanner;
abstract class CurrentBill{
    abstract double amount();
}
class Fan extends CurrentBill{
    double watts;
    double hours;
    Fan(double watts, double hours){
        this.watts = watts;
        this.hours = hours;
    }
    @Override
    public double amount(){
        double x = (watts*hours)/1000;
        return x *1.5;
    }
}
class Light extends CurrentBill{
    double watts;
    double hours;
    Light(double watts, double hours){
        this.watts = watts;
        this.hours = hours;
    }
    @Override
    public double amount(){
        double x = (watts*hours)/1000;
        return x *1.5;
    }
   
}
class TV extends CurrentBill{
   double watts;
    double hours;
    TV(double watts, double hours){
        this.watts = watts;
        this.hours = hours;
    }
    @Override
    double amount(){
        double x = (watts*hours)/1000;
        return x *1.5;
    }
}
public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fan Watts and Hours: ");
        double fanWatts = sc.nextDouble();
        double fanHours = sc.nextDouble();

        System.out.println("Enter Light Watts and Hours: ");
        double lightWatts = sc.nextDouble();
        double lightHours = sc.nextDouble();

        System.out.println("Enter TV Watts and Hours: ");
        double tvWatts = sc.nextDouble();
        double tvHours = sc.nextDouble();

        CurrentBill fan = new Fan(fanWatts, fanHours);
        CurrentBill light = new Light(lightWatts, lightHours);
        CurrentBill tv = new TV(tvWatts, tvHours);

        double total = fan.amount() +light.amount() + tv.amount();

        System.out.printf("Total Bill: %.2f%n", total);

        sc.close();


    }
}