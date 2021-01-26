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
    public ArrayList<Character> retornaListaCharDaString(){
        if(estaNull() == true)
            return null;
        ArrayList<Character> listaCaracteres = new ArrayList<Character>();
        for(int i = 0; i < umaString.length()-1; i++){
            listaCaracteres.add(umaString.charAt(i));
        }
        return listaCaracteres;
    }
    
    //retira uma SUBSTRING de um ponto expecifico da STRING até o seu final
    public String retornaSubString(int inicio){
        if(inicio > umaString.length()-1)
            return null;
        String subString = umaString.substring(inicio);
        return subString;
    }
    
    //retorna string em caixa baixa
    public String retornaStringCaixaBaixa(){
        if(estaNull() == true)
            return null;
        String lowerString = umaString.toLowerCase();
        return lowerString;
    }
    
    public boolean estaNull(){
        if(umaString == null)
            return true;
        return false;
    }
}
