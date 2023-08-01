import java.util.Scanner;
//So we can make object of a class cls2, which can use both mul and add methods.
// Main function is already created in the editor and instance of cls2 is also made.
// So the task is to add a method in class cls2 naming task() which will take 2 parameters as input
// i.e. a and b and print the sum of their squares
// i.e a2+b2. Changes in the main function has been made already.
class cls1 {
    public int add(int p, int q) {
        int add = p + q;
        return add;

    }
}

class cls2 extends cls1 {
    public int mul(int p, int q) {
        int mul = p * q;
        return mul;

    }

    public int task(int a, int b) {
        int sumofsquares = a * a + b * b;
       // double sumofsquares = Math.sqrt(a + b);
        return sumofsquares;
    }
}

public class assigment {
    public static void main(String[] args) {
        cls2 obj = new cls2();
        System.out.println(obj.add(2, 4));
        System.out.println(obj.mul(2, 4));
        System.out.println(obj.task(2, 4));


    }
}
//class cls1
//{
//    public int add(int p, int q)
//    {
//        int add = p+q;
//        return add;
//
//    }
//}
//class cls2 extends cls1 {
//    void mul(int p, int q) {
//        System.out.println(p*q);
//    }
//
//    void task(int a, int b) {
//        int sum = a*a + b*b;
//        System.out.println(sum);
//    }
//}
//    public class assigment {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int T = sc.nextInt();
//            for (int i = 0; i < T; i++) {
//              int a = sc.nextInt();
//              int b = sc.nextInt();
//               cls2 obj = new cls2();
//                 obj.add(a, b);
//                 obj.mul(a, b);
//                 obj.task(a, b);
//            }
//        }
//    }
