package chuong3;

import java.util.Scanner;

public class bai3_1 {
  public static void main(String[] args) {
    var input = new Scanner(System.in);

    System.out.println("Nhap a: ");
    float a = input.nextFloat();
    
    System.out.println("Nhap b: ");
    float b = input.nextFloat();

    input.close();

    // print all result
    System.out.println("Kết quả bài toán a + b là: " + (a + b));
    System.out.println("Kết quả bài toán a - b là: " + (a - b));
    System.out.println("Kết quả bài toán a * b là: " + (a * b));
    System.out.println((b != 0) ? "Kết quả bài toán a / b là: " + (a / b) : "Lỗi, không thể chia một số cho 0");

  }
}
