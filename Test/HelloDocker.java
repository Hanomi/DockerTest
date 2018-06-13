public class HelloDocker {
    public static void main(String[] args) {
        try {
            System.out.println("Do not disturb");
            Thread.sleep(500);
            System.out.println("shhhh...");
            Thread.sleep(500);
            System.out.println("I'm working");
            Thread.sleep(500);
            System.out.println("exit...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
