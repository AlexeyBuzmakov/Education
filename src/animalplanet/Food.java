package animalplanet;

public abstract class Food {
    public final char KIND_FOOD;
    public final int AMOUNT_FOOD;

    public Food(int amountFood, char kindFood) {
        this.AMOUNT_FOOD = amountFood;
        this.KIND_FOOD = kindFood;
    }

    public int getAMOUNT_FOOD() {
        return AMOUNT_FOOD;
    }

    public void appearance() {
        int i = 0;
        while(i <= AMOUNT_FOOD) {
            int columnField = (int) (Math.random() * 25);
            int lengthField = (int) (Math.random() * 25);
            while (Field.GAME_FIELD[columnField][lengthField] != KIND_FOOD) {
            if (Field.GAME_FIELD[columnField][lengthField] != 'G' && Field.GAME_FIELD[columnField][lengthField] != 'H'
            && Field.GAME_FIELD[columnField][lengthField] != 'M' && Field.GAME_FIELD[columnField][lengthField] != 'P') {
            Field.GAME_FIELD[columnField][lengthField] = KIND_FOOD;
                } else {
                    columnField = (int) (Math.random() * 25);
                    lengthField = (int) (Math.random() * 25);
                }
            }
            i++;
        }
    }

    public static void appearanceFood(Food food) {
        food.appearance();
    }
}
