package ma.formations.optional;

public class Test1 {
    public static void main(String[] args) {
        String name = getName();
        if (name != null) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println("Name is null");
        }
    }
    public static String getName() {
        return null;
    }
}
