public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(1,1,1);
        Vector v2 = new Vector(1, 2, 5);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.add(v2));
        System.out.println(v1.sub(v2));
        System.out.println(v1.scalarMult(v2));
        System.out.println(v1.vectorMult(v2));
        System.out.println(v1.equals(v2));
        System.out.println(v1.lenghtEquals(v2));
        System.out.println(v1.mult(5));
    }
}
