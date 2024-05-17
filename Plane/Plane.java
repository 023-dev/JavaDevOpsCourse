package Plane;

public class Plane {
    private String producer;
    private String model;
    private int passenger;
    public static int planes;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public Plane(String producer, String model, int passenger) {
        this.producer = producer;
        this.model = model;
        this.passenger = passenger;
        planes++;
    }
    public Plane() {
        this("None", "None", 0);
    }
    public static int getPlanes(){
        return planes;
    }
}
