package Strategy;

public class Pork implements Strategy {
    @Override
    public void calculate(double weight) {
        System.out.println("您购买的"+weight+"kg猪肉一共"+weight*33.3+"元！");
    }
}
