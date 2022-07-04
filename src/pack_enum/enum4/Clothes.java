package pack_enum.enum4;

public class Clothes {
    private int size;
    private String color;
    private Gender gender;

    public Clothes(int size, String color, Gender gender) {
        this.size = size;
        this.color = color;
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
