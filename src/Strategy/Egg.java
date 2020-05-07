package Strategy;

public class Egg implements Strategy{
    @Override
    public void calculate(double weight) {
        System.out.println("您购买的"+weight+"kg鸡蛋一共"+weight*3.8+"元！");
    }
}
