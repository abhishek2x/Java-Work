import java.util.Queue;
import java.util.LinkedList;

public class QueEx {
  public static void main(String[] args) {

    // Creating Queue using the LinkedList class

    Queue<Character> reversed = new LinkedList<>();
    String inputString = "FAFAF";
    // adding string in queue in reversed

    for (int i = 0; i < inputString.length(); i++) {
      reversed.add(inputString.charAt((inputString.length()) - i - 1));
    }

    // poping element from queue and adding to string

    String reversed_input = "";
    while (!reversed.isEmpty()) {
      reversed_input += reversed.remove();
    }

    // Checking forward and reversed string

    if (reversed_input.equals(inputString)) {
      System.out.println("Equal");
    } else {
      System.out.println("Not equal");
    }
  }
}
