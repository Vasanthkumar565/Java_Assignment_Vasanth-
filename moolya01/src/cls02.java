import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cls02
{
    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        int num1 = Integer.parseInt(br.readLine());
//        System.out.println("any number ");
//
//        int ch = Integer.parseInt(br.readLine());
//        switch (ch) {
//            case 1:
//                System.out.println("multiply");
//                System.out.println(num * num1);
//                break;
//
//                case 2:
//                    System.out.println("divide");
//                    System.out.println(num/num1);
//                    break;
//            case 3:
//                System.out.println("add");
//                System.out.println(num+num1);
//                break;
//
//            }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("enter the mark of phy");
//        int num = Integer.parseInt(br.readLine());
//        System.out.println("enter the mark of chem");
//        int num1 = Integer.parseInt(br.readLine());
//        System.out.println("enter the mark of maths");
//        int num2 = Integer.parseInt(br.readLine());
//
//        int num3 = num+num1+num2;
//      // int percentage = ((num3*100.0)/300.0);
//        double per =(double) num3/3;
//
//        System.out.println(per);
//
//        if((num >=35 && num1 >=35 && num2 >=35)&& per>40.00)
//        {
//            System.out.println("you are pass");
//        }
//        else
//        {
//            System.out.println("you are failed");
//        }
//        char v1 = 'g';
//        int v2 = v1;
//        System.out.println(v1);
//        System.out.println(v2);
//        int v3 = 66;
//        char v4 = (char) v3;
//        System.out.println(v3);
//        System.out.println(v4);
//
//        int num = 50;
//        while (num >= 50) {
//            System.out.println(num);
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(num + " x " + i + " = " + (num * i));
//            }
//            System.out.println();
//            num--;

          //  int num = 50, i = 1;
//            do{
//                System.out.printf("%d * %d = %d \n ", num, i, num * i);
//                i++;
//
//            }
//            int num = 50, i = 1;
//            while(i <= 10)
//            {
//                System.out.printf("\n"+num * i);
//               i++;
//            }
//
//        int num =5;
//        double num2=1;
//        for (int i=1;i<=num;i++)
//          num2 += i;
//
//        {
//            System.out.println(num2);
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(br.readLine());
//        int num=1;
//        int i;
//       //while (num>=1)
//        for(i=1;i<=number;i++){
//            num=num*i;
//        }
//        System.out.println(" "+num);

//        int [] arr = {31,46,9,23,1};
//                int min = arr[0];
//                for (int i=0;i<arr.length;i++)
//                {
//                    if(arr[i]<min)
//                    {
//                        min=arr[i];
//                    }
//                    System.out.println(min);
//                }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        switch (num){
            case 1:
            {
                System.out.println("sunday");
                break;
            }
            case 2:
            {
                System.out.println("monday");
                break;
            }
            case 3:
            {
                System.out.println("Tuesday");
                 break;
            }
            case 4:
            {
                System.out.println("Wednesday");
                break;
            }

            case 5:
            {
                System.out.println("Thursday");
                break;
            }
            case 6:
            {
                System.out.println("Friday");
            }

            case 7:
            {
                System.out.println("Saturday");
            }
            default:
            {
                System.out.println("Its in invalid value");
            }



        }


    }
}




