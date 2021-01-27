package kiemtra;
import java.util.Scanner;

public class bai3 {
  
  private static long giaithua(int n) {
    long giai_thua = 1;
    if (n == 0 || n == 1) {
        return giai_thua;
    } else {
        for (int i = 2; i <= n; i++) {
            giai_thua *= i;
        }
        return giai_thua;
    }
  }

  private static long tongGiaiThuaDen(int n) {
    long tong = 0;
    for (int i=1; i<=n; i++) {
      tong += giaithua(i);
    }
    return tong;
  }
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("NHAP N: ");
    int N = input.nextInt();
    if (N < 2) {
      System.out.println("N phai lon hon 2 :(");
      return;
    }
    
    double S = 0.0;
    for (int i=1; i<N; i++) {
      S += 1.0/tongGiaiThuaDen(i);
    }

    System.out.println(S);
  }
}
