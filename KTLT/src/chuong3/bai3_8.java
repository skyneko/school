package chuong3;

import java.util.Scanner;

public class bai3_8 {
  
  // Kiem tra so nguyen to
  private static boolean isPrimeNumber(int n) {
    if (n < 2) return false;

    for (int i=2; i<n-1; ++i) {
      if (n % i == 0) return false;
    }

    return true;
  }

  // In ra tất cả ước số của n  
  private static void printAllDivisors(int n) {
    System.out.print("b) Các ước số của n: ");

    for (int i = 1; i<=n; ++i) {
      if (n % i == 0)
        System.out.print(i + " ");
    }

    System.out.println();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Nhập n: ");
    final int n = input.nextInt();
    // final int n = 4;

    input.close();

    if (n < 1) {
      System.out.println("Lỗi, n không phải số nguyên dương.");
      return;
    }
    
    System.out.println("a) " + (isPrimeNumber(n) ? "N là số nguyên tố" : "N không phải số nguyên tố"));
    printAllDivisors(n);   
  
  }
}
