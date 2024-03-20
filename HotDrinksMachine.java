import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine{
    
    List<HotDrinks> listHotDrinks = new ArrayList<>();

    public void addHotDrinks(List<HotDrinks> list){
        this.listHotDrinks = list;
    }

    public HotDrinks getProduct(String name){
        for (HotDrinks item : listHotDrinks){
            if (item.getName().equals(name)) return item;
        }
        return null;
    }

    public List<HotDrinks> getList(){
        return listHotDrinks;
    }

    public HotDrinks getProduct(String name, double volume, double temperature){
        for (HotDrinks item : listHotDrinks){
            if ((item.getName().equals(name)) && (item.getVolume() == volume) && (item.getTemperature() == temperature)) return item;
        }
        return null;
    }
}
