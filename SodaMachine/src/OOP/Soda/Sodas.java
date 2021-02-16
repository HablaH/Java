package OOP.Soda;

public enum Sodas {
    Fanta (20),
    Coke (22),
    Sprite (19),
    Urge (21);

    public final int Price;

    private Sodas(int price){
        Price = price;
    }
    public int getPrice(){return Price;}
}
