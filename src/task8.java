import java.util.Scanner;
public class task8 {
    public static void main() {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
    }
    public static String LoopForCheck(String letter){
        return CheckString(letter.split(""),0,letter.length());
    }
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