package Thursday.InterfaceExample;

public  class  Frog implements WaterAnimal, LandAnimal{


    @Override
    public void move() {
        System.out.println("Frog walking");
    }

    @Override
    public void run() {
        System.out.println("Frog running");

    }

    @Override
    public void swim() {
        System.out.println("Frog swimming");

    }
}
