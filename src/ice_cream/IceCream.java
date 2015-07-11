package ice_cream;
/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:50:00
 */
public abstract class IceCream {

	public String description = "Unknown Ice Cream";
        public String base = "Unknown base ice cream";
        public String stir = "Stir Ice  Cream";
	public IceCreamStore m_IceCreamStore;
	public FoodTruckIceCream m_FoodTruckIceCream;
	public IceCreamMixer m_IceCreamDecorator;

	public IceCream(){
	}
	final void prepareIceCream() {
            System.out.println(createBaseIceCream());
            freezingIceCream();
            System.out.println(stirIceCream());
            hardenIceCream();
	}    
	public abstract double cost();

	public abstract String createBaseIceCream();

	public void freezingIceCream(){
            System.out.println( "Freezing ice cream in freezer");
	}

	public String getDescription(){
		return description;
	}

	public void hardenIceCream(){
            System.out.println("Harden Ice Cream");
	}

	public String stirIceCream(){
		return stir;
	}

}