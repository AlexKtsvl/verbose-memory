package Arrays;

public class checkEmail {
    public static void main(String[] args) {
        String [] emails = {"Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmailcom", "JamieM@yahoo.com"};


        for(int i=0; i < emails.length; i++) {
            if(emails[i].trim().contains("@") && emails[i].trim().contains(".")) {

                int at = emails[i].indexOf("@");
                int dot = emails[i].indexOf(".");

                if(at < dot) {
                    System.out.println(emails[i] + " Valid");
                }else{
                    System.out.println(emails[i] + " Invalid");
                }

            }else{

                System.out.println(emails[i] + " Invalid");

            }
        }
    }
}

