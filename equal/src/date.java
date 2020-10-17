import java.util.Objects;

public class date {
    public static void main(String[] args) {
        MyTime t1=new MyTime(1998,04,30);
        MyTime t2=new MyTime(1998,04,30);
        System.out.println(t1.equals(t2));
        String s1=new String("111");
        String s2=new String("111");
        System.out.println(s1.equals(s2));




    }
}
class MyTime{
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime myTime = (MyTime) o;
        return year == myTime.year &&
                month == myTime.month &&
                day == myTime.day;
    }


}


