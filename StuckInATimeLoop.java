import java.util.Scanner;

class TimeLoop{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int numb = in.nextInt();

    for (int i=1; i <= numb; i++) {
      System.out.println(i + " Abracadabra");
    }

  }
}
