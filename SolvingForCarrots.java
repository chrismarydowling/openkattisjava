import java.util.Scanner;

class Carrots{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    String orgnumbs = in.nextLine();

    String[] numb=orgnumbs.split("\\s");//splits the string based on whitespace


    System.out.println(numb[1]);



  }
}
