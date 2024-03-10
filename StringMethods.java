//Strings are immutable and can not be modified

public class StringMethods {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String st = sc.nextLine();
        
        String str = "Prince";
        int value = str.length();                  //This will take the length of the string str
        System.out.println(value);                //This will print the integer value of Prince i.e. 6 


        String str1 = str.toLowerCase();            //This will print the str Prince into lowercase i.e. (prince)
        System.out.println(str1);


        String str2 = str.toUpperCase();            //This will print the str Prince into uppercase i.e. (PRINCE)
        System.out.println(str2);


        String nonTrimmedStr = "      Prince       ";
        System.out.println(nonTrimmedStr);                             //This will print the string with spaces
        System.out.println(nonTrimmedStr.trim());                     //This will print the string without spaces i.e. it will skip all spaces


        System.out.println(str.substring(2));                          //This will print the str from index 2 i.e. (ince)
                                                                       //Note: Index starts with 0 i.e. P has 0 index r has 1 index and soon
        
        System.out.println(str.substring(1,4));            //Starts with index 1 and ends with index 3(in this method end index is excluded that is why 4th index is excluded)
        
        
        System.out.println(str.replace('r','p'));               //This will replace the char 'r' with 'p'

        System.out.println(str.replace("Prince","Kumar"));          //This will replace the whole str with "Kumar"
        System.out.println(str.replace("rin","cpp"));


        System.out.println(str.startsWith("Pr"));                   //If the str starts with "Pr" then it will return true and if not then false
        System.out.println(str.startsWith("pr"));                  //This will return false
    

        System.out.println(str.endsWith("ce"));                         //If the str ends with "ce" then it will return true and if not then false
        System.out.println(str.endsWith("cE"));                        //return false

        System.out.println(str.charAt(0));                   //Return index 0 i.e. P
        System.out.println(str.charAt(3));                  //Return index 3 i.e. n

        String name = "Harrarry";

        System.out.println(name.indexOf('r'));            //Returns the index of given string character(first occurence of 'r' i.e. 2)

        System.out.println(name.indexOf('r',4));             //Starts  to search with index 4 and returns the index 5

        System.out.println(name.indexOf('p'));          //return -1 because match is not found


    
        System.out.println(name.lastIndexOf('a'));               //Returns the last index of String name i.e. 4

        System.out.println(name.lastIndexOf('a',3));            //Returns the last index of String name before index 3 i.e. 1

        System.out.println(str.equals("Prince"));                //Returns true if str equals to "Prince" or false if not
        
        System.out.println(name.equals("prince"));                 //return false beacuse strings are case sensitive
        System.out.println(str.equals("Sumit"));                   //Return false


        //Strings are case sensitive so if we want to ignore uppercase and lowercase characters we will use below method 
        //This will return true ignoring uppercase character "P"
        System.out.println(str.equalsIgnoreCase("prince"));          
    }
    
}
 