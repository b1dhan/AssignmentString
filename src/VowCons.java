import java.util.Scanner;
public class VowCons {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = sc.nextLine();
        int a,b,v=0,c = 0;
        for(a=0;a<word.length();a++){
            if(word.charAt(a) == 'a' || word.charAt(a) == 'e' || word.charAt(a) == 'i' || word.charAt(a) == 'o' || word.charAt(a) == 'u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("The number of vowels in the word is: "+v);
        System.out.println("The number of consonants in the word is: "+c);

    }

}
