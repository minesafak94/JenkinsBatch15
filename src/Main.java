public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        for (int i=0; i <20; i++){
            System.out.println("Hello World");
            Thread.sleep(1000);
            System.out.println("My name is Jenkins");
        }
    }
}
