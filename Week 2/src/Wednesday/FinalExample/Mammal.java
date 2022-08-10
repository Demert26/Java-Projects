package Wednesday.FinalExample;

public class Mammal {
    private String name;
    private int legs;
    private String texture;

    public Mammal(){

    }


    public Mammal(String name, int legs, String texture) {
        this.name = name;
        this.legs = legs;
        this.texture = texture;
    }

    public String setName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getTexture() {
        return texture;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", texture='" + texture + '\'' +
                '}';
    }

    public void setname(String scrappy_doo) {
    }

    public void setName(String name) {
        this.name = name;
    }
}
