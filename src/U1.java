public class U1 extends Rocket {

    void U1()
    {
        rocketCost = 100.0;//$100 Million
        rocketWeight = 10;// Tonnes
        maxWeightWithCargo= 18;// Tonnes
        // double launchExplosion = 5% * (cargo carried / cargo limit)
        //  double landingCrash = 1% * (cargo carried / cargo limit)
    }


   @Override
   public boolean launch() {

        return super.launch();
   }

    @Override
    public boolean land() {

        return super.land();
    }
}
