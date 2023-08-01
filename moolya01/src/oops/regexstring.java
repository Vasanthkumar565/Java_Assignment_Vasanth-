package oops;

class A {
    String regex = "[a-zA-Z]+$";   // a,b,c......zA,B,C.....Z  Input :- @ (False) 9436775346--->true
    private String username;

    public void setUsername(String username) {
        if (username.matches(regex)) {
            this.username = username;
            System.out.println("username has been set");
        } else {
            System.out.println("wrong username is provided");
        }

    }
}

public class regexstring {
    public static void main(String[] args) {
        A obj = new A();
        obj.setUsername("sush");
    }
}
