package singleton;

public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Method to get the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method of the singleton class
    public void showMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }

    public static void main(String[] args) {
        // Example usage of the singleton class
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage(); // Output: Hello, I am a singleton instance!

        // Trying to create another instance will still return the same instance
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton == anotherSingleton); // Output: true
    }
}


