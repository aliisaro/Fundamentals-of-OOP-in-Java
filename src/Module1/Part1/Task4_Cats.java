package Module1.Part1;

public class Task4_Cats {
    private String name;

    public Task4_Cats(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Task4_Cats cat1 = new Task4_Cats("Whiskers");
        Task4_Cats cat2 = new Task4_Cats("Rex");

        // Call the meow method on the cat instance
        cat1.meow();
        cat1.meow();
        cat2.meow();
        cat1.meow();
    }
}
