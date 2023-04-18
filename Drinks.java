public class Drinks {

    public String getName() {
        return name;
    }

    public Double getVolume() {
        return volume;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Integer getCost() {
        return cost;
    }

    private String name;

    private Double volume;

    private Double temperature;

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    private Integer cost;

    public Drinks(String name, Double volume, Double temperature, Integer cost) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return String.format("%s, %.f, %.f, %d", name, volume, temperature, cost);
    }
}
