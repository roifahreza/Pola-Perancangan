package ice_cream;



/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:50:37
 */
public class Peanut extends IceCreamMixer {

	private IceCream iceCream;

	public Peanut(IceCream iceCream){
            this.iceCream = iceCream;
	}

        public double cost(){
		return 2000 + iceCream.cost();
	}

	public String getDescription(){
		return iceCream.getDescription()+" ,Peanut";
	}

	public String stirIceCream(){
		return iceCream.stirIceCream()+" ,a Peanut";
	}

     @Override
    public String createBaseIceCream() {
        return iceCream.createBaseIceCream();
    }
}