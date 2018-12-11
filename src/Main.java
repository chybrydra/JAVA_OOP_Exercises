public class Main {

    public static void main(String[] args) {
        System.out.println("=== initializing 3-element stack and checking its size ===");
        Stack<String> littleContainer = new StackImpl<>(3);
        System.out.println("size() -->" + littleContainer.size());
        System.out.println("\n=== checking value in stack ===");
        System.out.println("get() --> " + littleContainer.get());

        System.out.println("\n=== trying to add five fields ===");
        littleContainer.add("1st field");
        littleContainer.add("2nd field");
        littleContainer.add("3rd field");
        littleContainer.add("4th field");
        littleContainer.add("5th field");

        System.out.println("\n=== checking what's inside the stack ====");
        System.out.println("get() ---> " + littleContainer.get());

        System.out.println("\n=== try to remove() 4 times ===");
        littleContainer.remove();
        littleContainer.remove();
        littleContainer.remove();
        littleContainer.remove();

        System.out.println("\n===trying to add 4 fields again===");
        littleContainer.add("6th field");
        littleContainer.add("7th field");
        littleContainer.add("8th field");
        littleContainer.add("9th field");

        System.out.println("\n=== checking what's inside the stack ====");
        System.out.println(littleContainer.get());

        System.out.println("\n=== remove() 1 time ===");
        littleContainer.remove();

        System.out.println("\n=== checking what's inside the stack ====");
        System.out.println(littleContainer.get());

        System.out.println("\n=== remove() 1 time ===");
        littleContainer.remove();

        System.out.println("\n=== checking what's inside the stack ====");
        System.out.println(littleContainer.get());

        System.out.println("\n=== remove() 1 time ===");
        littleContainer.remove();

        System.out.println("\n=== checking what's inside the stack ====");
        System.out.println(littleContainer.get());

        System.out.println("\n=== remove() 1 time ===");
        littleContainer.remove();

        System.out.println("\n=== checking what's inside the stack ====");
        System.out.println(littleContainer.get());
    }
}
