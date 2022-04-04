package exception.exception2;

public class Exсeption {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getSymbolString(String str, int index) {
        System.out.println(str.charAt(index));
    }
}
