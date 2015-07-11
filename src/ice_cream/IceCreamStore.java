package ice_cream;

import java.util.ArrayList;



/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:45:05
 */
public class IceCreamStore extends AbstractIceCreamStore{

	public IceCreamStore(){

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