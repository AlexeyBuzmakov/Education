package animalplanet;

public class Animal extends GameObject{
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
                if(Field.GAME_FIELD[i][j].equals(getKind())) {
                    int column = visibility;
                    int length = visibility;
                    if(i < visibility && j < visibility) {
                       column = -i;
                       length = -j;
                    }
                    else if(i < visibility) {
                        column = -i;
                    }
                    else if(j < 24 - visibility) {
                        length = visibility - (24 - j);
                    }
                    else if(i < 24 - visibility && j < 24 - visibility) {
                        column = visibility - (24 - i);
                        length = visibility - (24 - j);
                    }
                    else if(i < 24 - visibility) {
                        column = visibility - (24 - i);
                    }
                    else if(j < visibility && i < 24 - visibility) {
                        column = visibility - (24 - i);
                        length = -j;
                    }
                    else if(j < visibility && i >= 24 - visibility) {
                        column = visibility - (24 - i);
                    }

                    for(int a = i - column; a < column * 2 + 1; a++) {
                        for(int b = length; b < length * 2 + 1; b++) {
                            if(Field.GAME_FIELD[a][b].equals(getKind())) {
                                System.out.println("Кто то съеден");
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
