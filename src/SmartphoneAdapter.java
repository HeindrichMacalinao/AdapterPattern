public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger smartphone;

    public SmartphoneAdapter(SmartphoneCharger smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String plugIn() {
        return smartphone.chargePhone();
    }
}