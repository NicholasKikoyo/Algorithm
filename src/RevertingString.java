

public class RevertingString {
    public static void main(String[] args) {

        revertingString("hello world");


}
    public static void revertingString(String text){


        String result = "";
        for(int i = text.length()-1;i>=0;i--){
            result = result + text.charAt(i);
        }
        System.out.println(result);

    }
}
