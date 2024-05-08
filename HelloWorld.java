public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Second line in our file");
        for (int i = 0; i < args.length; i++) {
            System.out.println(i);
        }
    }
}