public class BinOps {

    public String sum(String a, String b) {
        int firstValue;
        int secondValue;
        firstValue = Integer.parseInt(a,2);
        secondValue = Integer.parseInt(b,2);
        return Integer.toBinaryString(firstValue + secondValue);
    }

    public String mult(String a, String b) {
        int firstValue;
        int secondValue;
        firstValue = Integer.parseInt(a,2);
        secondValue = Integer.parseInt(b,2);
        return Integer.toBinaryString(firstValue * secondValue);
    }
}
