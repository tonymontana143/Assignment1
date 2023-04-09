import java.util.Scanner;
public class task8 {
    public static void main() {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
    }
    /*
            @letter-input string to be checked
            @return-"Yes" if the input string consist only of digits, otherwise "No"
     */
    public static String LoopForCheck(String letter){
        return CheckString(letter.split(""),0,letter.length());
    }

    /*
            @arr-array representation of the input string
            @position-current position in the array
            @stop-length of the array
            @return-"Yes" if the input string consist only of digits, otherwise "No"
     */
    static String CheckString(String[] arr,int position,int stop){
        if(position<stop){
            if(isNum(arr[position])){
                return CheckString(arr,position+1,stop);
            }else{
                return "NO";
            }
        }
        return "Yes";
    }
    /*
            @s-input string to be checked
            @return-True if the input string can be parsed as an integer, false otherwise
     */
    static boolean isNum(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

}