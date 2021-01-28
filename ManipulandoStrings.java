package javadozero;
import java.util.ArrayList;

//uma classe apenas para manipulação de strings
public class ManipulandoStrings {
    private String umaString;
    
    //metodo para instanciar a classe
    public ManipulandoStrings(String umaString){
        setString(umaString);
    }
    
    //metodo para modificar a STRING que esta sendo utilizada nos demais metodos
    public void setString(String umaString){
        this.umaString = umaString;
    }
    
    //separando os caracteres da STRING e os retornando
    public void listaCharDaString(){
        if(Testes.TesteStringNulla(umaString))
            throw new NullPointerException("NullString");
        ArrayList<Character> listaCaracteres = new ArrayList<>();
        for(int i = 0; i < umaString.length(); i++){
            listaCaracteres.add(umaString.charAt(i));
        }
        for(Character x: listaCaracteres)
            System.out.println(x);
    }
    
    //retira uma SUBSTRING de um ponto expecifico da STRING até o seu final
    public void subString(int inicio){
        if(Testes.ExcecaoDePontoNullo(inicio, umaString.length()-1))
            throw new NullPointerException("OutOfRange");
        String subString = umaString.substring(inicio);
        System.out.println(subString);
    }
    
    //printa STRING em caixa baixa
    public void stringCaixaBaixa(){
        if(Testes.TesteStringNulla(umaString))
            throw new NullPointerException("NullString");
        String lowerString = umaString.toLowerCase();
        System.out.println(lowerString);
    }
    
    //printa STRING em caixa alta
    public void stringCaixaAlta(){
        if(Testes.TesteStringNulla(umaString))
            throw new NullPointerException("NullString");
        String uperString = umaString.toUpperCase();
        System.out.println(uperString);
    }
}
