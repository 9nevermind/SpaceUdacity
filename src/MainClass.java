import java.io.FileNotFoundException;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        Simulation simulation1 = new Simulation();
        System.out.println(simulation1.runSimulationU1(simulation1.loadU1(simulation1.loadItems("C:\\Users\\Agata\\SpaceUdacity\\src\\phase-1.txt"))));
        System.out.println(simulation1.runSimulationU1(simulation1.loadU1(simulation1.loadItems("C:\\Users\\Agata\\SpaceUdacity\\src\\phase-2.txt"))));


        System.out.println(simulation1.runSimulationU2(simulation1.loadU2(simulation1.loadItems("C:\\Users\\Agata\\SpaceUdacity\\src\\phase-1.txt"))));
        System.out.println(simulation1.runSimulationU2(simulation1.loadU2(simulation1.loadItems("C:\\Users\\Agata\\SpaceUdacity\\src\\phase-2.txt"))));
    }
}



/*
U-1
The U-1 Rocket is light weight, agile and pretty safe, but can only carry a total of 18 tonnes of cargo.
It costs $100 Million to build and weighs 10 tonnes.
It has a slim chance of crashing while landing but a bigger chance of exploding when launching,
 both chances depend on the amount of cargo carried in the rocket.

U-2
The U2 Rocket heavier than the U-1 but much safer and can carry a lot more cargo; to a total of 29 tonnes.
 However, it costs $120 Million to build and weighs 18 tonnes. It has a greater chance of crashing while
 landing than while launching, but just like the U-1 both chances depend on the amount of cargo carried.

The Mission
The mission consists of 2 phases:

Phase-1:
This phase is meant to send building equipment and construction material to help build the colony.
In the resources tab, you will find a text file that contains the list of all items that we need to send called
 'Phase-1.txt`. Each line in the file contains the item name as well as its weight in Kgs.

building tools=2000
building tools=2000
building tools=2000
building tools=5000
building tools=5000
building tools=2000
building tools=1000
building tools=5000
building tools=6000
shelter equipment=5000
construction equipment=5000
plants=1000
steel=8000
books=1000
water=5000

Phase-2:
This phase is meant to send the colony of humans along with some food resources. In the resources tab,
you will find a text file that contains the list of all items that we need to send called 'Phase-2.txt`.
 Each line in the file also contains the item name and its weight in Kgs.

habitat=3000
colony=5000
food=5000
habitat=3000
colony=5000
food=3000
colony=5000
food=3000

Your job is to run some simulations and test both rocket types for each phase separately.


 */