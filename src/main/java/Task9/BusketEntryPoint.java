package Task9;

import Task9.Busket;
import Task9.Ball;

public class BusketEntryPoint {
    public static void main(String[] args){
        Task9.Busket busket = new Task9.Busket(new Task9.Ball[]{new Task9.Ball(5.6, "Red"),
                                              new Task9.Ball(2.0, "Blue"),
                                              new Task9.Ball(3.2, "Green"),
                                              new Task9.Ball(4.1, "Blue")});
        System.out.println(busket.blueAmount());
        System.out.println(busket.wholeWeight());
    }
}
