package Seminar2;
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Тамерлана");
//        Human human2 = new Human("Эльвира");
//        Human human3 = new Human("Тимур");
//        Human human4 = new Human("Фоат");
//        Human human5 = new Human("Марина");
//        Human human6 = new Human("Владимир");
        Market market = new Market();
        market.acceptToMarket(human1);
//        market.acceptToMarket(human2);
//        market.acceptToMarket(human3);
        market.update();
        System.out.println();
//        market.acceptToMarket(human4);
//        market.acceptToMarket(human5);
//        market.acceptToMarket(human6);
        market.update();
    }
}
