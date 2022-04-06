package animalplanet;

public abstract class Animal extends GameObject{
    private int visibility;

    public Animal(String kind, int amount, int visibility) {
        super(kind, amount);
        this.visibility = visibility;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

   public void find() {
        for(int i = 0; i < Field.GAME_FIELD.length; i++) {
            for(int j = 0; j < Field.GAME_FIELD[i].length; j++) {
                if(Field.GAME_FIELD[i][j].equals(" P ")) {
                    int count = 0;
                    for(int a = i - visibility; a <= i + visibility ; a++) {
                        for(int b = j - visibility; b <= j + visibility; b++) {
                            if(count > 0)
                                break;
                            if(Field.GAME_FIELD[a][b].equals(" H ") || Field.GAME_FIELD[a][b].equals(" M ")) {
                                Field.GAME_FIELD[a][b] = " X ";
                                Field.GAME_FIELD[i][j] = "[ ]";
                                System.out.println("Хищник поел");
                                count++;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void findEat(Animal animal) {
        animal.find();
    }
}
