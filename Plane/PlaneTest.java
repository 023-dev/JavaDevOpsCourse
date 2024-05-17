package Plane;

public class PlaneTest {
    public static void main(String[] args) {
        Plane p1 = new Plane();
        Plane p2 = new Plane();
        Plane p3 = new Plane();
        Plane p4 = new Plane();
        Plane p5 = new Plane();

        p1.setProducer("boing");
        p1.setModel("737");
        p1.setPassenger(50);

        p2.setProducer("boing");
        p2.setModel("733");
        p2.setPassenger(30);

        p3.setProducer("boing");
        p3.setModel("733");
        p3.setPassenger(40);

        p4.setProducer("boing");
        p4.setModel("737");
        p4.setPassenger(30);

        p5.setProducer("boing");
        p5.setModel("636");
        p5.setPassenger(20);

        //System.out.println(p1.getProducer()+","+p1.getModel()+","+p1.getPassenger());
        System.out.println(Plane.getPlanes());
    }
}
