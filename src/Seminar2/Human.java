package Seminar2;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean make) {
        super.isMakeOrder = make;
    }

    @Override
    public void setTakeOrder(boolean take) {
        isTakeOrder = take;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
