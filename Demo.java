public class Demo {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5, 2);
        int r2 = obj.sub(10, 4);
        int r3 = obj.mul(5, 6);
        int r4 = obj.div(25, 5);
        int r5 = obj.pow(8, 2);
        System.out.println(r1 + "\n" + r2 + "\n" + r3 + "\n" + r4 + "\n" + r5);
    }
}
