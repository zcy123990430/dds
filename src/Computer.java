public class Computer {
    private Insert i;

    public Computer() {
    }

    public Computer(Insert i) {
        this.i = i;
    }

    public Insert getI() {
        return i;
    }

    public void setI(Insert i) {
        this.i = i;
    }
    public void order (){
        i.lianjie();
    }

}

