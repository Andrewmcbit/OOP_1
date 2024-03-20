public abstract class HotDrinks {
    protected String name;
    protected double volume;

    public HotDrinks(String inputName, double inputVolume){
        this.name = inputName;
        this.volume = inputVolume;
    }
    
    public HotDrinks(){}

    public String getName(){
        return name;
    }
    
    public double getVolume(){
        return volume;
    }

    public abstract double getTemperature();

    @Override
    public String toString(){
        return String.format("Name: %s, Volume: %.1f",name, volume);
    }
}
