public class U2 extends Rocket {

    void U2() {
    rocketCost =120.0;//$120 Million
    rocketWeight =18;// Tonnes
    maxWeightWithCargo =29;//Tonnes
    //launchExplosion = 4% * (cargo carried / cargo limit)
    // landingCrash = 8% * (cargo carried / cargo limit)
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
