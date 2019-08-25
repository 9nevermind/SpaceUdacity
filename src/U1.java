import java.util.Random;

public class U1 extends Rocket {
    final double rocketCost = 100.0;//$100 Million
    final double rocketWeight = 10000;//10 Tonnes
    final double maxWeightWithCargo = 18000;//18 Tonnes
    final double cargoLimit = maxWeightWithCargo - rocketWeight;//kg
    double cargoCarried = 0.0;//kg

    void U1() {

         //rocketCost = 100.0;//$100 Million
        //  rocketWeight = 10000;//10 Tonnes
        //  maxWeightWithCargo = 18000;//18 Tonnes
        //  cargoLimit = maxWeightWithCargo - rocketWeight;//kg

    }

    // launchExplosion = return 0.05 * (cargoCarried / cargoLimit)
    // launchCrash = return 0.01 * (cargoCarried / cargoLimit)
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
        if (wynik <= 5) {
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
        //  System.out.println("losu="+losu);
        //System.out.println("wynik="+wynik);
        //   System.out.println("carried="+this.cargoCarried);
        //  System.out.println("limit="+this.cargoLimit);

        if (wynik <= 1) {

            return false;
        } else {
            return super.land();//true
        }
    }
}
