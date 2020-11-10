package chuong3;
import java.util.Scanner;

public class bai3_9 {
  
  private static int tinhGiaiThua(int n) {
    if (n == 1) return 1;
    else {
      return n * tinhGiaiThua(n-1);
    }
  }
  
  private static int tongGiaiThuaDen(int n) {
    if (n == 1) 
      return 1;
    else 
      return tinhGiaiThua(n) + tongGiaiThuaDen(n - 1);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Nhap N: ");
    final int n = input.nextInt();
    input.close();
    
    float S = 0;

    for (int i = 1; i <= n; ++i) {
      S += 1.0 / tongGiaiThuaDen(i);
    }

    System.out.println(S);
  }
}
