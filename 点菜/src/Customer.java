public class Customer {
    private Food f;

    public Customer() {
    }

    public Customer(Food f) {
        this.f = f;
    }

    public Food getF() {
        return f;
    }

    public void setF(Food f) {
        this.f = f;
    }
    public void order (){
        f.food1();
        f.food2();
    }

}
