
package assignment4;

import java.util.Scanner;

public class EverandOld {
    public static void main(String[] args)
    {
        System.out.print("Nhap gia tri a:");
    Scanner keyboard= new Scanner(System.in);
    int a=keyboard.nextInt();
    if (a%2==0)
    {
        System.out.println(a+" la so chan");
    }
    else
    {
        System.out.println(a+ " la so le");
    }
        }
    
}