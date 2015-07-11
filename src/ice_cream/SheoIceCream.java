package ice_cream;

import java.util.ArrayList;

public class SheoIceCream {
 
	public static void main(String args[]) {
		ArrayList<String> mixerList = new ArrayList<>();
                AbstractIceCreamStore storeA = new IceCreamStore();
                FoodTruckIceCream truckA = new FoodTruckIceCream();
                mixerList.add("chocolate");
                mixerList.add("strawberry");
		storeA.orderIceCream("clumpies",mixerList);
                
                 
                ArrayList<String> mixerListTruck = new ArrayList<>();
                mixerListTruck.add("chocolate");
                mixerListTruck.add("strawberry");
                truckA.setLocation("jl. Veteran no.1 Malang");
                truckA.orderIceCream("gellato", mixerListTruck);
                
	}
}
