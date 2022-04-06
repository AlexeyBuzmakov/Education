package animalplanet;

public abstract class GameObject{
    private String kind;
    private int amount;

    public GameObject(String kind, int amount) {
        this.kind = kind;
        this.amount = amount;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void appearance() {
        int i = 0;
        while(i < amount) {
            int columnField = (int) (Math.random() * 25);
            int lengthField = (int) (Math.random() * 25);
            while (!Field.GAME_FIELD[columnField][lengthField].equals(kind)) {
                if (!Field.GAME_FIELD[columnField][lengthField].equals(kind)) {
                    Field.GAME_FIELD[columnField][lengthField] = kind;
                } else {
                    columnField = (int) (Math.random() * 25);
                    lengthField = (int) (Math.random() * 25);
                }
            }
            i++;
        }
    }

    public static void appearanceObject(GameObject gameObject) {
        gameObject.appearance();
    }
}
