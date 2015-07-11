package ice_cream;

import java.util.ArrayList;

public class FoodTruckIceCream extends AbstractIceCreamStore{

	private String location;

	public String getLocation(){
            return location;
	}
	public void setLocation(String location){
            this.location = location;
	}

    @Override
    IceCream createIceCream(String type, ArrayList<String> mixerList) {
	if (type.equals("clumpies")) {
            IceCream iceCream = new ClumpiesIceCream();
            for (String value : mixerList) {
                iceCream=addMixer(iceCream, value);
            }
            return iceCream;
	} else if (type.equals("turkish")) {
            IceCream iceCream = new TurkishIceCream();
          for (String value : mixerList) {
                iceCream=addMixer(iceCream, value);
            }
            return iceCream;
 	} else if (type.equals("gellato")) {
            IceCream iceCream = new GellatoIceCream();
           for (String value : mixerList) {
                iceCream=addMixer(iceCream, value);
            }
            return iceCream;
	} else return null;
    }

}