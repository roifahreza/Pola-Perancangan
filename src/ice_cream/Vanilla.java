package ice_cream;



/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:50:58
 */
public class Vanilla extends IceCreamMixer {

	private IceCream iceCream;

	public Vanilla(IceCream iceCream){
            this.iceCream = iceCream;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public double cost(){
		return 2000 + iceCream.cost();
	}

	public String getDescription(){
		return iceCream.getDescription()+" ,Vanilla";
	}

	public String stirIceCream(){
		return iceCream.stirIceCream()+" ,add Vanilla";
	}
 @Override
    public String createBaseIceCream() {
        return iceCream.createBaseIceCream();
    }

}