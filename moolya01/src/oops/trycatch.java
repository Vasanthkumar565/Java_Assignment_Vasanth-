package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) throws IOException {

        for (int i=0;i<5;i++) {
            try {
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                int value = Integer.parseInt(br.readLine());
                Scanner sr = new Scanner(System.in);
                int value = sr.nextInt();
                System.out.println(100/value);
            }


            catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
            }catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
//            } catch (NumberFormatException e) {
//                System.out.println("NumberFormatException");
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException");
            }


        }        }}
