package OOP.Soda;

public class Soda {

    public int Price;
    public Sodas type;

    public Soda(Sodas type){
        this.type = type;
        Price = type.getPrice();
    }
}
