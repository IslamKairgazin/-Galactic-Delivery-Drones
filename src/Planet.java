public class Planet extends CelestialBody {
    private String atmosphereType;

    public Planet(String name, String atmosphereType) {
        super(name);
        this.atmosphereType = atmosphereType;
    }

    public String getAtmosphereType() {
        return atmosphereType;
    }
    public void setAtmosphereType(String atmosphereType) {
        this.atmosphereType = atmosphereType;
    }
}
