import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class demsolanxuathiencuakytutrongchuoi {
    public static void main(String[] args) {
        char character;
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi:");
        text = scanner.nextLine();
        System.out.println("nhập ký tự:");
        character = scanner.next().charAt(0);
        System.out.println("Số lần xuất hiện ký tự là: "+countchar(text,character)+" lần");
    }
    public static int countchar(String str,char character){
        int count = 0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==character){
                count++;
            }
        }
        return count;
    }
}
