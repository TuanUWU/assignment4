
package assignment4;

import java.util.Scanner;
public class Age {
    public static void main(String[] args)
    {
        Scanner keyboard =new Scanner(System.in);
        System.out.print("Nhap gia tri a:");
        int a= keyboard.nextInt();
        if (a<=12)
        {
            System.out.println(a+" is child");
        }
        else if (a>=13 && a<=19)
        {
            System.out.println(a+" is teenager");
        }
        else if (a>=20 && a<=59)
        {
            System.out.println(a+" is adult");
        }
        if (a>=60)
        {
            System.out.println(a+" is old");
        }
    }
            
}
