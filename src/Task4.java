public class Task4 {
    private String name;

    public Task4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Task4 cat1 = new Task4("Whiskers");
        Task4 cat2 = new Task4("Rex");

        // Call the meow method on the cat instance
        cat1.meow();
        cat1.meow();
        cat2.meow();
        cat1.meow();
    }
}
