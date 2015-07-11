package ice_cream;



/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:49:33
 */
public class ClumpiesIceCream extends IceCream {

	public ClumpiesIceCream(){
            description = "Clumpies Ice Cream";
            base = "Create Clumpies base Ice Cream";
	}


	public double cost(){
		return 5000;
	}

    @Override
    public String createBaseIceCream() {
        return base;
    }


}