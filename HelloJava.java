public class HelloJava {
    
    private int Mayor(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        HelloJava obj = new HelloJava();
        System.out.println("Hola Java");
        System.out.println("Mayor: " + obj.Mayor(10,20));   
    }
}