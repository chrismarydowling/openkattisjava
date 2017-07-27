import java.util.Scanner;

class TwoStones{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int numb = in.nextInt();

    if (numb%2 == 0) {
      System.out.print("Bob");
    }

    else {
      System.out.print("Alice");
    }

  }
}
