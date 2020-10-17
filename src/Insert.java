import java.sql.SQLOutput;

public interface Insert {
    void lianjie();


}
class shubiao implements Insert{
    public void lianjie() {
        System.out.println("鼠标已经连接");

    }
}
class jianpan implements Insert{
    public void lianjie() {
        System.out.println("键盘已经连接");

    }
}
