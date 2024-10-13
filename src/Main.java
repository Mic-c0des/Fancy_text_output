import java.util.Scanner;

public class Main {
        /*
        Main is just a demo area and is not needed if you wat this in your own program
         */
        public static void main(String[] args) throws InterruptedException {
            String testStr;
            Scanner in = new Scanner(System.in);
            textCycle("Hello please enter your desired output");
            System.out.print("\n>");
            testStr = in.nextLine();
            textCycle(testStr);
        }

    /*
    Method to take a sentence
    and print each letter on at a time
    cycling from a to the desired letter.
    */
    public static void textCycle(String strIn) throws InterruptedException {
            // Array of the alphabet
            char[] abcs = new char[]{'a', 'b', 'c', 'd', 'e',
                    'f', 'g', 'h', 'i', 'j', 'k',
                    'l', 'm', 'n', 'o', 'p', 'q',
                    'r', 's', 't', 'u', 'v', 'w',
                    'x', 'y', 'z'};

            for(int i=0; i<=strIn.length(); i++){
                if(i==0){
                    //First letter (capitalized)
                    for(int c=0; c<26; c++){
                        System.out.print("\b" + Character.toUpperCase(abcs[c]));
                        Thread.sleep(10);
                        if(strIn.charAt(i) == Character.toUpperCase(abcs[c]) || strIn.charAt(i) == abcs[c]){
                            System.out.print("\b" + Character.toUpperCase(abcs[c]) + " ");
                            Thread.sleep(10);
                            break;
                        }
                    }
                }
                else if(i>0 && i<strIn.length()){
                    // rest of sentence lower case letters
                    if(strIn.substring(i,i+1).equals(" ")){
                        System.out.print(" ");
                        Thread.sleep(10);
                    }
                    else{
                        for(int c=0; c<26; c++){
                            System.out.print("\b" + abcs[c]);
                            Thread.sleep(10);
                            if(strIn.charAt(i) == abcs[c]){
                                System.out.print("\b" + abcs[c] + " ");
                                Thread.sleep(10);
                                break;
                            }
                        }
                    }
                }
                else{
                    //adds period to end of sentence
                    System.out.print("\b.");
                }
            }
        }
}
