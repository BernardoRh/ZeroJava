package javadozero;
public class Testes {
    /*
    ESSA CLASSE SERVE APENAS PARA TESTAR
    VALORES E TER CERTEZA DE QUE ELES ELES NÃO
    ESTÃO NULOS OU ENTÃO FORA DO RANGE
    E UMA LISTA.
    */
    
    //testa se posição existe dentro da lista
    public static boolean ExcecaoDePontoNullo(int posicao, int tamanho){
        if(tamanho <= posicao)
            return true;
        return false;
    }
    
    
    //testa se a string não esta nulla
    public static boolean TesteStringNulla(String teste){
        if(teste == null)
            return true;
        return false;
    }
}
