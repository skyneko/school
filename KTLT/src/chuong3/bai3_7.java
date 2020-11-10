package chuong3;

import java.util.Scanner;

/** 
 * Viet chuong trinh giai phuong trinh bac nhat: ax + b = 0
 */
public class bai3_7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Giai phuong trinh bac nhat ax + b = 0.");
    
    System.out.print("Nhap a: ");
    final float a = input.nextFloat();
    System.out.print("Nhap b: ");
    final float b = input.nextFloat();
    
    input.close();

    if (a == 0) {
      if (b == 0) 
        System.out.println("Phương trình có vô số nghiệm");
      else 
        System.out.println("Phương trình vô nghiệm");
      
      return; // guard return statement
    }

    System.out.println("Phương trình có nghiệm là: " + (-b/a));
  }
}
