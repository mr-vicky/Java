public class RegularExpressions2 {
    public static void main(String args[]){
        String str = " ";
        
        // META CHARACTERS --->
        // \d => Digits 
        System.out.println(str.matches("\\d"));

        // \D => Not Digits 
        System.out.println(str.matches("\\D"));

        // \s => Space
        System.out.println(str.matches("\\s"));

        // \S => Not Space
        System.out.println(str.matches("\\S"));

        // \w => Alphabets or Digits
        System.out.println(str.matches("\\w"));

        // \W => Neither alphabet or digits
        System.out.println(str.matches("\\W")); 
        System.out.printf("\n\n");

        // QUANTIFIERS --->
        // * => 0 or more times
        String str2 = "aaaaa";
        System.out.println(str2.matches(".*"));
        System.out.println(str2.matches("[a-z]*"));
        System.out.println(str2.matches("[a]*"));

        // + => 1 or more times
        System.out.println(str2.matches("[ab]+"));

        // ? => 0 or 1 time
        System.out.println(str2.matches("[a]?"));

        // {X} => X times
        System.out.println(str2.matches("[a]{5}"));

        // {X, Y} => Between X and Y times
        System.out.println(str2.matches("[a]{2,3}"));

        // Usecase --> 
        // for Validating the Gmail
        String mail = "vicky@gmail.com";
        System.out.println(mail.matches(".*@gmail.com"));
        System.out.println(mail.matches("\\w*@gmail.com"));
    }
};
