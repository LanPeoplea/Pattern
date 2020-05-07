package Strategy;

/**
 *一个超市场景，可以购买不同种类、不同价格的蔬菜、食物
 */
public class Supermarket {
    public static void main(String[] args) {
        Strategy tomato = new Tomato();
        Strategy egg = new Egg();
        Strategy pork = new Pork();
        tomato.calculate(2.0);
        egg.calculate(12.3);
        pork.calculate(5.7);
    }
}
