public class Facade {
    private String a;
    private String b;

    public Facade(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void calculateFacade(Facade facade) {
        BinOps binOps = new BinOps();
        System.out.println("Сумма двоичных чисел: " + binOps.sum(facade.getA(), facade.getB()));
        System.out.println("Произведение двоичных чисел: " + binOps.mult(facade.getA(), facade.getB()));
    }
}
