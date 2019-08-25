public class Rocket implements SpaceShip {
    double rocketCost;
    int rocketWeight;
    int maxWeightWithCargo;
    int cargoLimit = maxWeightWithCargo - rocketWeight;
    int cargoCarried = 0;

    public boolean launch()//returns true or false indicating if the launch was successful or if the rocket has crashed
    {
        return true;
    }

    public boolean land() //returns true or false based on the success of the landing
    {
        return true;
    }

    public boolean canCarry(Item item)//takes an Item as an argument and returns true if the rocket can carry such item
    // or false if it will exceed the weight limit
    {
        if (this.cargoCarried <= this.cargoLimit) {
            return true;
        } else {
            return false;
        }
    }

    public void carry(Item item)//  takes an Item object and updates the current weight of the rocket
    {
        this.cargoCarried = this.cargoCarried + item.weight;
    }
}
