// Find the type of the website and the protocol used
import java.util.*;

public class ConditionalStatementChallenge5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        
        int protocol_index = url.indexOf(":");
        String protocol = url.substring(0, protocol_index);

        int website_type_index = url.lastIndexOf(".");
        String type = url.substring(website_type_index+1);

        // Protocol
        if(protocol.equals("http")){
            System.err.println("Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.err.println("File Transfer Protocol");
        }

        // Type of website
        if(type.equals("com")){
            System.out.println("Commercial");
        }
        else if(type.equals("org")){
            System.out.println("Organizational");
        }
        else if(type.equals("net")){
            System.out.println("Network");
        }
    }
};