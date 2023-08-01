import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Intro_01
{
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());
//        System.out.println(a/b);
//        System.out.println(a-b);
//        System.out.println(a+b);
//        System.out.println(a*b);
//        Scanner sr = new Scanner(System.in);
//        String str=sr.nextLine();
//        String str1=sr.nextLine();
//        System.out.println(str+str1);
////
//        int phy = 70;
//        int che = 100;
//        int maths = 50;
//        int sun = phy + che + maths;
//        double per = (sun*100.0)/300.0;

      //  double per = (double)sun/3; //type casting // narrowing
        //System.out.println(per);

        //
//         String strr = new String("dkshuisshsks");
//        System.out.println(str.toUpperCase());
//        System.out.println(str.length());

//        String str = "thirnvanathapuram";
//        char[] chars = str.toCharArray(); // convert string to character array
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] >= 'a' && chars[i] <= 'z') {
//                chars[i] = (char) (chars[i] - 'a' + 'A');
//            }
//        }
//
//        String uppercaseStr = new String(chars); // convert character array back to string
//        System.out.println(uppercaseStr);

       // String str="indiaa";
       // System.out.println(str.replace('n','z'));
//
        //String str = "indiaa"
//        if(str.length()>=5)
//        {
//            string str1 =str.substring(0,4)+ "z" +str.substring(5);
//            {
//            System.out.println(str1);
//            }
//
//        }
        int a = 71;
        int b = 15;
        int c = 12;

        if((a<=b)&&(a<=c)||(b<=c)&&(b<=a))
        {
            System.out.println(a);
        }
         else if((b<=c)&&(b<=a) )
        {
            System.out.println(b);

        }else
        {
            System.out.println(c);
        }
    }
}
