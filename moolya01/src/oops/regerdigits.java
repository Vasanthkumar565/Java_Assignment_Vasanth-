package oops;
class digits {
    String regex = "[0-9]{10}$";
    private String validnumber;

    public void valid10number(String username) {
        if (username.matches(regex)) {
            this.validnumber = username;
            System.out.println("valide number of 10digits");
        } else {
            System.out.println("invalid number");
        }

    }
}

public class regerdigits {
    public static void main(String[] args) {
        digits di = new digits();
        di.valid10number("0818301442");

    }
}
