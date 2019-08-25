import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    ArrayList loadItems(String filename) throws FileNotFoundException {// loads all items from a text file and returns an ArrayList of Items
        ArrayList ItemsArray = new ArrayList();
        //ArrayList <Item> ItemsArray=new ArrayList<>(); //<- czy to różnica z zapisem powyżej?
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("=");
            ItemsArray.add(new Item(parts[0], Integer.valueOf(parts[1])));
        }
        return ItemsArray;
    }


    ArrayList loadU1(ArrayList items) throws FileNotFoundException { // takes the ArrayList of Items returned from loadItems and starts creating U1 rockets
        ArrayList U1Array = new ArrayList();
        U1Array.add(new U1());//pierwszy statek
        int u1Counter = 0;
        for (int i = 0; i < items.size(); i++) {
            Item currentItem = (Item) items.get(i);
            if (((U1) U1Array.get(u1Counter)).canCarry(currentItem)) {
                ((U1) U1Array.get(u1Counter)).carry(currentItem);
                //  System.out.println("carried"+((U1)U1Array.get(u1Counter)).cargoCarried);
            } else {
                i--;
                U1Array.add(new U1());//dodaj statek
                u1Counter++;// ((U1) U1Array.get(u1Counter)).cargoCarried=0;
                // System.out.println("carried"+((U1)U1Array.get(u1Counter)).cargoCarried);
            }
        }
        System.out.println("liczba U1=" + U1Array.size());
        return U1Array;
    }


    ArrayList loadU2(ArrayList items) throws FileNotFoundException { // takes the ArrayList of Items returned from loadItems and starts creating U1 rockets
        ArrayList U2Array = new ArrayList();
        U2Array.add(new U2());//pierwszy statek
        int u2Counter = 0;
        for (int i = 0; i < items.size(); i++) {
            Item currentItem = (Item) items.get(i);
            if (((U2) U2Array.get(u2Counter)).canCarry(currentItem)) {
                ((U2) U2Array.get(u2Counter)).carry(currentItem);
                // System.out.println("carried"+((U2)U2Array.get(u2Counter)).cargoCarried);
            } else {
                i--;
                U2Array.add(new U2());//dodaj statek
                u2Counter++;// ((U2) U2Array.get(u2Counter)).cargoCarried=0;
            }
        }
        System.out.println("liczba U2=" + U2Array.size());
        return U2Array;
    }

    double runSimulationU1(ArrayList rockets) { // this method takes an ArrayList of Rockets and calls launch and land methods
        // for each of the rockets in the ArrayList. Every time a rocket explodes or crashes
        // (i.e if launch or land return false) it will have to send that rocket again.
        // All while keeping track of the total budget required to send each rocket safely to Mars.
        // runSimulation then returns the total budget required to send all rockets (including the crashed ones).
        double cost = 0;

        for (int i = 0; i < rockets.size(); i++) {
            if (((U1) rockets.get(i)).land() && ((U1) rockets.get(i)).launch()) {
                cost = cost + ((U1) rockets.get(i)).rocketCost;
              //  System.out.println("ok");
            } else {
                cost = cost + ((U1) rockets.get(i)).rocketCost;
                i--;
              //  System.out.println(" fail ");
            }
        }
        System.out.println("cost of mission");
        return cost;
    }

    double runSimulationU2(ArrayList rockets) { // this method takes an ArrayList of Rockets and calls launch and land methods
        // for each of the rockets in the ArrayList. Every time a rocket explodes or crashes
        // (i.e if launch or land return false) it will have to send that rocket again.
        // All while keeping track of the total budget required to send each rocket safely to Mars.
        // runSimulation then returns the total budget required to send all rockets (including the crashed ones).
        double cost = 0;

        for (int i = 0; i < rockets.size(); i++) {
            if (((U2) rockets.get(i)).land() && ((U2) rockets.get(i)).launch()) {
                cost = cost + ((U2) rockets.get(i)).rocketCost;
               // System.out.println("ok");
            } else {
                cost = cost + ((U2) rockets.get(i)).rocketCost;
                i--;
           //     System.out.println(" fail ");
            }
        }
        System.out.println("cost of mission");
        return cost;
    }
}
