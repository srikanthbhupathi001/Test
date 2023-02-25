import java.sql.SQLOutput;

class Mobile{
    String name;
    int price;
    String color;
    public void show(){
        System.out.println(name + ":"+ price +":"+ color);
    }
}
public class Main {
    public static void main(String a[]){
        Mobile m1 = new Mobile();
         m1.name = "Samsung";
         m1.price = 1200;
         m1.color="black";
         m1.show();

    }
}