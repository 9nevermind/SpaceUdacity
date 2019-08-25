import java.util.Random;

public class U1 extends Rocket {

    void U1() {
        rocketCost = 100.0;//$100 Million
        rocketWeight = 10;// Tonnes
        maxWeightWithCargo = 18;// Tonnes
    }

  // launchExplosion = return 0.05 * (cargoCarried / cargoLimit)
   // launchCrash = return 0.01 * (cargoCarried / cargoLimit)


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
        if (wynik <= 1) {
            return false;
        } else {
            return super.land();//true
        }
    }
}
