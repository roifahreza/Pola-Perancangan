package ice_cream;



/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:50:15
 */
public class GellatoIceCream extends IceCream {
        
	public GellatoIceCream(){
            description = "Gellato Ice Cream";
            base = "Create Gelato base Ice Cream";
	}

	public double cost(){
		return 15000;
	}

    @Override
    public String createBaseIceCream() {
        return base;
    }


}