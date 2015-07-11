package ice_cream;



/**
 * @author asus
 * @version 1.0
 * @created 22-Mei-2015 21:49:50
 */
public class TurkishIceCream extends IceCream {

	public TurkishIceCream(){
            description = "Turkish Ice Cream";
            base = "Create Turkish base Ice Cream";
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public double cost(){
		return 8000;
	}

    @Override
    public String createBaseIceCream() {
        return base;
    }

}