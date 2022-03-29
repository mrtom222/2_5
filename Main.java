import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    int rok = sca.nextInt();
    if((rok%4==0 && rok%100!=0) || rok%400==0){
      System.out.println("Rok jest przestępny");
    }else
  {
      System.out.println("Rok nie jest przestępny");
    }
  }
}