package chuong3;
import java.util.Scanner;

public class bai3_10 {
  
  private static boolean kiemTraSoNguyenTo(int n) {
    if (n < 2) return false;
    
    for (int i = 2; i < n; ++i) {
      if (n % i == 0) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("KIEM TRA SO NGUYEN TO");
    System.out.print("Nhap so nguyen: ");
    final int n = input.nextInt();

    System.out.println(n + ((kiemTraSoNguyenTo(n) ? " la" : " khong phai") + " so nguyen to.") );

  }
}
