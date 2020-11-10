package chuong3;
import java.util.Scanner;

public class bai3_12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Nhap so A:");
    int a = input.nextInt();
    System.out.print("Nhap so B:");
    int b = input.nextInt();
    input.close();
  
    if (a == 0 || b == 0) {
      System.out.println("Khong co uoc chung lon nhat.");
      return;
    }

    while(a != b) {
      if (a > b) {
        a = a - b;
      }
      else {
        b = b - a;
      }
    }
    System.out.println("Uoc chung lon nhat la: " + a);
  }
}
