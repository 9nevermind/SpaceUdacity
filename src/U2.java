import java.util.Random;

public class U2 extends Rocket {

    void U2() {
    rocketCost =120.0;//$120 Million
    rocketWeight =18;// Tonnes
    maxWeightWithCargo =29;//Tonnes
}
    //launchExplosion = return 0.04 * (cargoCarried / cargoLimit)
  // launchCrash = return 0.08 * (cargoCarried / cargoLimit)



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
