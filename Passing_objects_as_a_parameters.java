// Methods can have the return type as the objects
public class Passing_objects_as_a_parameters {  
    static String getUserName(String email){
        int index = email.indexOf('@');
        String res = email.substring(0, index);
        return res;
    }

    public static void main(String args[]){
        String email = "mrvicky@gmail.com";
        String user_name = getUserName(email);
        System.out.println(user_name);
    }
}