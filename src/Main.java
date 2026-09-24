public class Main {
    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneOutlet = new SmartphoneAdapter(smartphoneCharger);


        System.out.println(laptopOutlet.plugIn());
        System.out.println(refrigeratorOutlet.plugIn());
        System.out.println(smartphoneOutlet.plugIn());
    }
}
