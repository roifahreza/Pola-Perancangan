/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ice_cream;

import java.util.ArrayList;

/**
 *
 * @author Agung Kharisma
 */
public abstract class AbstractIceCreamStore {
    
    abstract IceCream createIceCream(String type, ArrayList<String> mixerList);
    
    public IceCream addMixer(IceCream type, String mixer){
        if (mixer.equals("chocolate")){
            return new Chocolate(type);
        } else if (mixer.equals("peanut")){
            return new Peanut(type);
        }
        else if (mixer.equals("vanilla")){
            return new Vanilla(type);
        }
        else if (mixer.equals("strawberry")){
            return new Strawberry(type);
        } else return null;
    }
    public IceCream orderIceCream(String type, ArrayList<String> mixerList){
        
        IceCream iceCream = createIceCream(type, mixerList);
        System.out.println("Pesan "+iceCream.getDescription()+" =======");
        iceCream.prepareIceCream();
        System.out.println("Cost: "+iceCream.cost());
        return iceCream;
    }
    
}
