package exception.exception2;

public class Main {
    public static void main(String[] args) {
        Exсeption exeption = new Exсeption();

        try{
            exeption.getSymbolString("Sergey", 3);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println(indexOutOfBoundsException.getMessage());
        }

        try{
            System.out.println(exeption.getName());
        }
        catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
    }
}
