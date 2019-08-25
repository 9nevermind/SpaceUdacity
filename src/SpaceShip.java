public interface SpaceShip {
    boolean launch();//returns true or false indicating if the launch was successful or if the rocket has crashed
    boolean land(); //returns true or false based on the success of the landing
    //boolean canCarry(Item item);//takes an Item as an argument and returns true if the rocket can carry such item
                                // or false if it will exceed the weight limit
   // void carry(Item item);//  takes an Item object and updates the current weight of the rocket
}
