import java.util.Scanner;

public class ReverseString {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input String: ");
        String s = in.nextLine();
        System.out.print("Reversed String: "  );
        Revers(s);
    }
     static void Revers(String s){
        char [] letter = s.toCharArray();
        for(int i = letter.length -1; i >= 0; i--){
            System.out.print(letter[i]);
        }
    }
}
