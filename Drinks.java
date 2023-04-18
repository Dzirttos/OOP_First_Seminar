public class Drinks {

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getCost() {
        return cost;
    }

    private String name;

    private Integer volume;

    private Integer temperature;

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    private Integer cost;

    public Drinks(String name, Integer volume, Integer temperature, Integer cost) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return String.format("%s, %d ml, %d°C, %d RUR", name, volume, temperature, cost);
    }
}
