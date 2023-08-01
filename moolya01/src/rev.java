import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rev
{
    public static void main(String[] args) throws IOException {
        String str = "google";
        String rev = " ";
        char ch ;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            rev= ch+rev;
        }
//        System.out.println("Reversed string: "+ rev);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String rev = " ";
//        for (int i=str.length()-1; i>=0;i++)
//        {
//            rev = rev + str.charAt(i);
//        }
//        StringBuilder br = new StringBuilder("google");
//        {
//            System.out.println(br.reverse());
//
//        }

    }


}
