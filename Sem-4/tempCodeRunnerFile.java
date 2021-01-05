import java.util.Queue;
import java.util.LinkedList;

public class QueEx {

  public static void main(String[] args) {
    // Creating Queue using the LinkedList class
    Queue<Character> forward = new LinkedList<>();
    Queue<Character> reversed = new LinkedList<>();

    String inputString = "COFFEE";

    for (int i = 0; i < inputString.length(); i++) {
      forward.add(inputString.charAt(i));
      reversed.add(inputString.charAt((inputString.length())-i-1));
    }

    System.out.println("Fibo: " + forward);
    System.out.println("Fibo: " + reversed);
  }
}
