public class ElectronicItem extends CISItem{
    private int storeCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public ElectronicItem(String name, String location, int price, String description, int storeCapacity, String model, String maker, String operatingSystem) {
        super(name, location, price, description);
        this.storeCapacity = storeCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }

    public void setStoreCapacity(int storeCapacity) {
        this.storeCapacity = storeCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}