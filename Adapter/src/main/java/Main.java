/**Задача Калькулятор
 */
public class Main {
    public static void main(String[] args) {
        IntsCalculator intsCalculator = new IntsCalculator(new Calculator());
        System.out.println(intsCalculator.sum(2, 2));
        System.out.println(intsCalculator.mult(10, 22));
        System.out.println(intsCalculator.pow(2, 10));
    }
}
