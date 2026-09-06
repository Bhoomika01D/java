public class classes {

    void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        classes obj = new classes();
        obj.add(10, 20);
    }
}