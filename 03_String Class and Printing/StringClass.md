# String Class and Regular Expressions
## 1. Declaration of a String


```
        String str1 = "Java program"; // String created in pool
        System.out.println(str1);
```

`String(String)`
```
        String str2 = new String("Java program"); // String created in Heap
        System.out.println(str2);
```

`String(char[])`
```
        char c[] = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(c); // String using character array
        System.out.println(str3);
```

`String(byte[])`
```
        byte b[] = {65, 66, 67, 68, 69, 70};
        String str4 = new String(b); // String using byte array 
        System.out.println(str4);

        String str5 = new String(b, 1, 3); // string starting from the 1st index and of length 3 of Byte array b
        System.out.println(str5);
```

## 2. String Methods

 **Methods of String**

 `int length()`: returns the length of the String.
```
        String str = "Welcome";
        System.out.println(str);

        // int length()
        int l = str.length();
        System.out.println("length(): "+l);
```

`String toLowerCase()`: Create a new String with all lowercase characters
```
        System.out.println("toLowerCase(): "+str.toLowerCase());
```

`String toUpperCase()`: Create a new String with all uppercase characters
```
        System.out.println("toUpperCase(): "+str.toUpperCase());
```

`String trim()`: create a new String by removing all the blank spaces(Leading or tailing blankspaces only) 
```
        String s = "   I Love Java       ";
        int s_length = s.length();
        System.out.println("length before using trim(): "+ s_length);
        System.out.println("trim(): "+  s.trim());
        System.out.println("length after using trim(): " + s.trim().length());
```

`String substring(int begin)`: returns a substring starting from begin index
```
        String sub_str = str.substring(2);
        System.out.println(sub_str);
```

`String substring(int begin, int end)`: returns a substring starting from the beginning index and ending on end index
```
        String sub_str2 = str.substring(2, 4);
        System.out.println(sub_str2);
```

`String replace(char old, char new)` : returns a new String by replacing the chracter of the String
```
        System.out.println("replace(c, k): " + str.replace('c', 'k'));
```

Checking if two string are same or not
```
        String s1 = "Java";
        String s2 = new String("Java"); // Because One is created in Heap and another is at Pool
        System.out.println(s1 == s2);
```

`bool startsWith(String s)`: returns true/false if the String starts with or not "s"
```
        String str = "www.google.com";
        System.out.println("startsWith(\"www\"): " + str.startsWith("www"));
```

`bool endsWith(String s)`: returns true/false if the String ends with or not "s"
```
        System.out.println("endsWith(\".com\"): "+ str.endsWith(".com"));
```

`char charAt(int index)`: returns the character at index
```
        System.out.println("charAt(4): "+ str.charAt(4));
```

`int indexOf(String s)`: returns the index of string in a given string
```
        System.out.println("indexOf(\".com\"): "+ str.indexOf(".com"));

        // int indexOf(String s, int index): returns the index of string in a given string, starting after the given index
        System.out.println("indexOf(\"g\"): "+ str.indexOf("g", 5));

        // returns - 1 if not found the given string
        System.out.println("indexOf(\"CODE\"): "+ str.indexOf("CODE"));
```

`int lastIndexOf(String s)`: returns index by searching from right hand side 
```
        System.out.println("lastIndexOf(\".\"): "+ str.lastIndexOf("."));

        // int lastIndexOf(String s, int index): Starts searching from right hand side from index
        System.out.println("lastIndexOf(\".\", 9): "+ str.lastIndexOf(".", 9));
```

`bool equals(Strig s)`: Equals true if the strings are equal or else fasle
```
        String s1 = "JAVA";
        String s2 = "Java";
        String s3 = "python";
        String s4 = "python";

        System.out.println("s1.equals(s2): "+ s1.equals(s2));
        System.out.println("s3.equals(s4): "+ s3.equals(s4));
```

`bool equalsIgnoreCase(String s)`: returns true if both Strings are equal or not by ignoring the cases.
```
        System.out.println("equalsIgnoreCase(): "+ s1.equalsIgnoreCase(s2));
```

`int s1.comapreTo(s2)`: Check the order of the Strings alphabetically, result will be +ve if `s1 > s2`, -ve if `s1 < s2` and 0 if `s1 == s2`
```
        System.out.println("s1.compareTo(s2): "+ s1.compareTo(s2));
```

Difference between "==" and equals()
```
        String str2 = new String("JAVA");
        System.out.println(s1 == str2); // Comapares the references of the given two Strings
        System.out.println(s1.equals(str2)); // It compares the values of the given two string
```

`bool contains()`: contains method will find out that a string is present inside or not
```
        String str3 = "The great wall of China";
        System.out.println("str2.contains(\"China\"): "+ str3.contains("China"));
```

`String concat()`: String can concat two strings
```
        System.out.println("s1.concat(s2): "+ s1.concat(s2));
        System.out.println("s1 + s2: "+ s1 + s2); // "+" can be used to concatinate the Strings
```

`String valueOf()`: Converts the value of other data types into the String data type
```
        int num = 100;
        String str4 = String.valueOf(num); //"100"
        System.out.println(str4);   
```

## 3. Regular Expressions

**Method** 
  - boolean `java.lang.String.matches(String regex)`
  - Tells whether or not this string matches the given regular expression.


**MATCHING CHARACTERS**
 
`.` => Any single character, digit, symbol
```
        String str = "XZ";

        System.out.println(str.matches("."));
```

`[abc]` => Exactly given letters, single letter from the given letters
```
        System.out.println(str.matches("[abc]"));
```

`[abc][vz]` => one letter from firt bracket, and second leeter from the second bracket, two alphabets are compulsory 
```
        System.out.println(str.matches("[abc][yz]"));
```

`[^abc]` => Expect abc, anything other than abc
```
        System.out.println(str.matches("[^abc]"));
```

`[a-z1-9]` => a to z or 1 to 7, Single character form a-z or 1-9
```
        System.out.println(str.matches("[a-z1-9]"));
```

`A | B` => A or B, Either A or B only
```
        System.out.println(str.matches("A|B"));
```

`XZ` => Exactly XZ
```
        System.out.println(str.matches("XZ"));
```

**META CHARACTERS**

`\d` => Digits 
```
        System.out.println(str.matches("\\d"));
```

`\D` => Not Digits 
```
        System.out.println(str.matches("\\D"));
```

`\s` => Space
```
        System.out.println(str.matches("\\s"));
```

`\S` => Not Space
```
        System.out.println(str.matches("\\S"));
```

`\w` => Alphabets or Digits
```
        System.out.println(str.matches("\\w"));
```

`\W` => Neither alphabet or digits
```
        System.out.println(str.matches("\\W")); 
        System.out.printf("\n\n");
```

**QUANTIFIERS** 

`*` => 0 or more times
```
        String str2 = "aaaaa";
        System.out.println(str2.matches(".*"));
        System.out.println(str2.matches("[a-z]*"));
        System.out.println(str2.matches("[a]*"));
```
`+` => 1 or more times
```
        System.out.println(str2.matches("[ab]+"));
```
`?` => 0 or 1 time
```
        System.out.println(str2.matches("[a]?"));
```
`{X}` => X times
```
        System.out.println(str2.matches("[a]{5}"));
```
`{X, Y}` => Between X and Y times
```
        System.out.println(str2.matches("[a]{2,3}"));
```

**Usecase**

Validation of the Gmail     
```
        String mail = "vicky@gmail.com";
        System.out.println(mail.matches(".*@gmail.com"));
        System.out.println(mail.matches("\\w*@gmail.com"));
```