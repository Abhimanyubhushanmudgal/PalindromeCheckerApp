
import java.util.Scanner;

public class PalindromeCheckerApp {


    static void showWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome Checker ");
        System.out.println("=================================");
    }


    static void checkHardcodedPalindrome() {
        String word = "MADAM";
        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }


    static void checkUserInputPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert string to linked list
    static Node createLinkedList(String input) {
        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Reverse linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Check palindrome using linked list
    static void checkLinkedListPalindrome(String input) {

        Node head = createLinkedList(input);

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        if (isPalindrome)
            System.out.println("Linked List Palindrome");
        else
            System.out.println("Not a Linked List Palindrome");
    }

    public static void main(String[] args) {

        // UC1
        showWelcomeMessage();

        // UC2
        checkHardcodedPalindrome();

        // UC3
        checkUserInputPalindrome();

        checkLinkedListPalindrome("madam");
    }
}
