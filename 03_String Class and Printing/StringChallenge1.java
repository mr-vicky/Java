// Find if the email id is on gmail
// Find username and domain name form gmail
// String str = "programmer@gmail.com"

public class StringChallenge1 {
    public static void main(String args[]){

        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        String username = str.substring(0, i);
        String domain = str.substring(i+1, str.length());

        System.out.println("Username: "+username);
        System.out.println("Domain: "+domain);
        System.out.println(domain.startsWith("gmail"));
    }
};   
