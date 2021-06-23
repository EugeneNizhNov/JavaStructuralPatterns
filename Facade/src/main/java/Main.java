/**Задача Двоичный фасад
 * */

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade("01100101", "01000101");
        facade.calculateFacade(facade);
    }
}
