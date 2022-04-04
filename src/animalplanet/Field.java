package animalplanet;

public class Field {
    public static final char[][]GAME_FIELD =  new char[25][25];

    public static void showGameField() {
        for(int i = 0; i < GAME_FIELD.length; i++) {
            for(int j = 0; j < GAME_FIELD[i].length; j++) {
                System.out.print(GAME_FIELD[i][j] + " ");
                if(j == GAME_FIELD.length - 1) {
                    System.out.println();
                }
            }
        }
    }
}
