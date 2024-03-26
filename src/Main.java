import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<Integer, String> Numbers = new HashMap<Integer, String>();
    static Scanner scanner = new Scanner(System.in);
    static Boolean play = true;

    public static void main(String[] args) {
        FillInNumbers();
        Print();

        Translate();
        PrintAll();
    }

    private static void FillInNumbers() {
        Numbers.put(0, "Zero");
        Numbers.put(1, "One");
        Numbers.put(2, "Two");
        Numbers.put(3, "Three");
        Numbers.put(4, "Four");
        Numbers.put(5, "Five");
        Numbers.put(6, "Six");
        Numbers.put(7, "Seven");
        Numbers.put(8, "Eight");
        Numbers.put(9, "Nine");
    }

    private static void Print() {
        System.out.println("x = Print all options. v = Enter a number to translate.");
        char Input = scanner.next().charAt(0);
        if (Input == 'x') {
          PrintAll();
        }
        else if (Input == 'v') {
            Translate();
        }
        else {
            System.out.println("Invalid input");
            Print();
        }
    }

    private static void PrintAll(){
        int i = 0;
        while (play){
            System.out.println(i + " = " + Numbers.get(i));

            i++;
            if (Numbers.get(i) == null)
            {
                play = false;
            }
        }

        Print();
    }

    private static void Translate() {
        System.out.println("Enter a number between 0 and 9");

        int Input = scanner.nextInt();
        if (Numbers.get(Input) != null) {
            System.out.println(Numbers.get(Input));
        }
        else {
            System.out.println("Invalid input");
        }

        Print();
    }
}
