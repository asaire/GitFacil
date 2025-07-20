public class HelloJava {
    
    private int Mayor(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        HelloJava obj = new HelloJava();
        System.out.println("Hola Java");
        System.out.println("Mayor: " + obj.Mayor(10,20));   
        System.out.println("=======================");

        for(int i=0 ; i < 5; i++)
            System.out.println(i+1);

        System.out.println("=======================");

        for(int i=0 ; i < 10; i++)
            System.out.print(i+101 + " ");

        System.out.println("=======================");
        System.out.println("Avanzando en el programa...");
    }
}