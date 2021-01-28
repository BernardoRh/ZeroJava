package javadozero;
import java.util.ArrayList;

public class JavaDoZero {
    public static void main(String[] args) {
        ManipulandoStrings texto = new ManipulandoStrings("NAO NULO MENO");
        ArrayList<Integer> arr = new ArrayList<>();
            arr.add(23);
            arr.add(123);
            arr.add(62234);
            arr.add(734);
        texto.listaCharDaString();
        Listas lista = new Listas();
        lista.adicionandoElementoArrayList(23);
        lista.adicionandoElementoArrayList(231);
        lista.adicionandoElementoArrayList(3);
    }
}
