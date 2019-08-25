import java.util.Random;

public class U2 extends Rocket {
    //int cargoLimit=10;
    final double rocketCost = 120.0;//$120 Million
    final double rocketWeight = 18000.0;// 18 Tonnes
    final double maxWeightWithCargo = 29000.0;//29 Tonnes
    final double cargoLimit = maxWeightWithCargo - rocketWeight;//kg
    double cargoCarried = 0.0;//kg

    void U2() {
        //  rocketCost =120.0;//$120 Million
        // rocketWeight =18000;// 18 Tonnes
        // maxWeightWithCargo =29000;//29 Tonnes
        //  cargoLimit = maxWeightWithCargo - rocketWeight;//kg

    }
    //launchExplosion = return 0.04 * (cargoCarried / cargoLimit)
    // launchCrash = return 0.08 * (cargoCarried / cargoLimit)

    public boolean canCarry(Item item)//takes an Item as an argument and returns true if the rocket can carry such item
    // or false if it will exceed the weight limit
    {
        if (this.cargoCarried + item.weight <= this.cargoLimit) {
            return true;
        } else {
            return false;
        }
    }

    public void carry(Item item)//  takes an Item object and updates the current weight of the rocket
    {
        this.cargoCarried = this.cargoCarried + item.weight;
    }

    @Override
    public boolean launch() {

        Random random = new Random();
        int losu = random.nextInt(100);
        double wynik = losu * (this.cargoCarried / this.cargoLimit);
        if (wynik <= 4) {
            return false;
        } else {
            return super.launch();//true
        }
    }

    @Override
    public boolean land() {

        Random random = new Random();
        int losu = random.nextInt(100);
        double wynik = losu * (this.cargoCarried / this.cargoLimit);
        if (wynik <= 8) {
            return false;
        } else {
            return super.land();//true
        }
    }
}
