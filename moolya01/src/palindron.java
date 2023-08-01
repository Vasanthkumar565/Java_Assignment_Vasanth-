import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindron
{
    public static void main(String[] args) {

        int num = 676;
        int temp = num;
        int sum = 0;
         while(num>0)
         {
             int r= num%10; //5
             sum =(sum*10)+r;
             num=num/10; //
         }
         if(sum==temp)
         {
             System.out.println("number is palindron");
         }else
         {
             System.out.println("number is not palindron");
         }

    }
}
