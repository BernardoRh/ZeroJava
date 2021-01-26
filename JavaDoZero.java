package javadozero;
import java.util.ArrayList;

public class JavaDoZero {
    public static void main(String[] args) {
        ManipulandoStrings texto = new ManipulandoStrings("adwadgrggrrgaaaa");
        ArrayList<Character> listaChar = texto.retornaListaCharDaString();
        try{
            for(Character x : listaChar)
                System.out.println(x);
        }catch(NullPointerException ex){
            System.out.println("Null Array");
        }
    }
}
