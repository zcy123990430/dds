public class test {
    public static void main(String[] args) {
        Food cc=new ChineseCook();
        Customer c=new Customer(cc);
        c.order();

    }
}
