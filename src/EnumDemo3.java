enum Apple {
    Jonathan(4),GoldenDel(5),RedDel(12),Winesap(23),Cortland(71);
    private int price;
    Apple (int p){
        price = p;
    }
    int getprice(){
        return price;
    }
}
public class EnumDemo3 { public static void main (String args[]) {
    Apple ap;
    System.out.println("Стоимость яблока Winesap: "+ Apple.Winesap.getprice());

    for (Apple a: Apple.values()){
        System.out.println("Яблоко "+ a +" стоит "+ a.getprice());
    }
}}