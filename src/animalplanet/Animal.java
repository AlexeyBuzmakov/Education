package animalplanet;

public abstract class Animal{
    private final int AMOUNT_ANIMAL;
    private final char KIND_ANIMAL;

    public Animal(int AMOUNT_ANIMAL, char KIND_ANIMAL) {
        this.AMOUNT_ANIMAL = AMOUNT_ANIMAL;
        this.KIND_ANIMAL = KIND_ANIMAL;
    }

    public int getAMOUNT_ANIMAL() {
        return AMOUNT_ANIMAL;
    }

    public int getKIND_ANIMAL() {
        return KIND_ANIMAL;
    }

    public void appearance() {
        int i = 0;
        while(i <= AMOUNT_ANIMAL) {
            int columnField = (int) (Math.random() * 25);
            int lengthField = (int) (Math.random() * 25);
            while (Field.GAME_FIELD[columnField][lengthField] != KIND_ANIMAL) {
                if (Field.GAME_FIELD[columnField][lengthField] != 'G' && Field.GAME_FIELD[columnField][lengthField] != 'H'
                        && Field.GAME_FIELD[columnField][lengthField] != 'M' && Field.GAME_FIELD[columnField][lengthField] != 'P') {
                    Field.GAME_FIELD[columnField][lengthField] = KIND_ANIMAL;
                } else {
                    columnField = (int) (Math.random() * 25);
                    lengthField = (int) (Math.random() * 25);
                }
            }
            i++;
        }
    }

    public static void appearanceAnimal(Animal animal) {
        animal.appearance();
    }
}
