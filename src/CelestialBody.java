public abstract class CelestialBody {
    protected String name;

    public CelestialBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
