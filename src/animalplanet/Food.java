package animalplanet;

public abstract class Food extends GameObject{

    public Food(String kind, int amount) {
        super(kind, amount);
    }

    @Override
    public String getKind() {
        return super.getKind();
    }

    @Override
    public void setKind(String kind) {
        super.setKind(kind);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }
}
