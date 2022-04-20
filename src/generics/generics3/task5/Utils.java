package generics.generics3.task5;

public class Utils <T, E> {

    @SuppressWarnings("all")
    public void print(T par1, E...par2 ) {
        System.out.print(par1 + " ");
        for(E par : par2) {
            System.out.print(par + " ");
        }
    }
}
