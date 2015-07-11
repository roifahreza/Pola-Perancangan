package ice_cream;

/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:50:46
 */
public class Chocolate extends IceCreamMixer {

	private IceCream iceCream;

	public Chocolate(IceCream iceCream){
            this.iceCream = iceCream;
	}

	
	public double cost(){
		return 1500 + iceCream.cost();
	}

	public String getDescription(){
		return iceCream.getDescription()+" ,Chocolate";
	}

	public String stirIceCream(){
		return iceCream.stirIceCream()+" ,add Chocolate";
	}

    @Override
    public String createBaseIceCream() {
        return iceCream.createBaseIceCream();
    }

  
}