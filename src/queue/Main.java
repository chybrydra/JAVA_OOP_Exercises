package queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Creating 4-element queue ===");
        Queue<String> kolejeczka = new QueueImpl<>(4);

        System.out.println("\n=== checking size() ===");
        System.out.println(kolejeczka.size());

        System.out.println("\n=== checking empty() ===");
        System.out.println(kolejeczka.empty());

        System.out.println("\n=== getHead(), getTail()===");
        System.out.println(kolejeczka.getHead());
        System.out.println(kolejeczka.getTail());

        System.out.println("\n=== push(), getHead(), getTail()===");
        kolejeczka.push("Kowalski");
        System.out.println("Head: " + kolejeczka.getHead());
        System.out.println("Tail: " + kolejeczka.getTail());

        System.out.println("\n=== 4x push(), getHead(), getTail()===");
        kolejeczka.push("Nowak");
        kolejeczka.push("Kurak");
        kolejeczka.push("Mondek");
        kolejeczka.push("Miński");
        System.out.println("Head: " + kolejeczka.getHead());
        System.out.println("Tail: " + kolejeczka.getTail());

        System.out.println("\n=== 4x pop(), getHead(), getTail()===");
        kolejeczka.pop();
        System.out.println("Head: " + kolejeczka.getHead());
        System.out.println("Tail: " + kolejeczka.getTail());
        System.out.println("Size: " + kolejeczka.size());

        System.out.println("\n=== 4x pop()===");
        kolejeczka.pop();
        kolejeczka.pop();
        kolejeczka.pop();
        kolejeczka.pop();
        System.out.println("Empty: " + kolejeczka.empty());
        System.out.println("Size: " + kolejeczka.size());

        System.out.println("\n=== 2x push()===");
        kolejeczka.push("Niedźwiedź");
        kolejeczka.push("Biernacki");
        System.out.println("Head: " + kolejeczka.getHead());
        System.out.println("Tail: " + kolejeczka.getTail());
        System.out.println("Size: " + kolejeczka.size());
        System.out.println("Empty: " + kolejeczka.empty());
    }
}
