package Rarity;

public class Uncommon extends Rarity{
    protected String rarity = "Uncommon";
    protected int howRare = 1;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getHowRare() {
        return howRare;
    }
}
