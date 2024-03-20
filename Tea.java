public class Tea extends HotDrinks {
    protected double temperature;

    public Tea(String inputName, double inputVolume, double inputTemperature){
        super.name = inputName;
        super.volume = inputVolume;
        this.temperature = inputTemperature;
    }

    public double getTemperature(){
        return this.temperature;
    } 

    @Override
    public String toString(){
        return String.format("Name: %s, Volume: %.1f, Temperature: %.1f", super.name, super.volume, this.temperature);
    }
}
