package Strategy;

public class Tomato implements Strategy{

    @Override
    public void calculate(double weight) {
        System.out.println("您购买的"+weight+"kg西红柿一共"+weight*1.5+"元！");
    }
}
