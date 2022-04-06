package animalplanet;

import java.util.Arrays;

public class Field {
    public static final String[][]GAME_FIELD = new String[25][25];

    public static void fieldInitialization() {
        for (String[] strings : GAME_FIELD) {
            Arrays.fill(strings, "[ ]");
        }
    }

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
