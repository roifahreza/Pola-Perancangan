package ice_cream;



/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:51:06
 */
public class Strawberry extends IceCreamMixer {

	private IceCream iceCream;

	public Strawberry(IceCream iceCream){
            this.iceCream = iceCream;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public double cost(){
		return 1800 + iceCream.cost();
	}

	public String getDescription(){
		return iceCream.getDescription()+" ,Strawberry";
	}

	public String stirIceCream(){
		return iceCream.stirIceCream()+" ,add Strawberry";
	}
 @Override
    public String createBaseIceCream() {
        return iceCream.createBaseIceCream();
    }
}