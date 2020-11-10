package chuong3;
import java.util.Scanner;

public class bai3_11 {
  private static boolean kiemTraSoChinhPhuong(int n) {

    for (int i = 1; i*i <= n; ++i) {
      if (i*i == n) {
        return true;
      }
    }
    return false;
  }
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("KIEM TRA SO CHINH PHUONG");
    System.out.print("Nhap mot so nguyen: ");
    final int n = input.nextInt();

    System.out.println(n + (kiemTraSoChinhPhuong(n) ? " la": " khong phai la") + " so chinh phuong." );
  }
}
