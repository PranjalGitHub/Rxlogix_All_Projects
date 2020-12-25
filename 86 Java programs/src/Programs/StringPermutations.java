package Programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {


  public static void main(String[] args) {

    // create an object of scanner class
    Scanner input = new Scanner(System.in);

    // take input from users
    System.out.print("Enter the string: ");
    String data = input.nextLine();
    System.out.println("Permutations of " + data + ": \n" + getPermutation(data));
    }
}