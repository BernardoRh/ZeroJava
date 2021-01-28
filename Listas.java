package javadozero;
import java.util.ArrayList;
public class Listas {
    //Difenreça entre Array e ArrayList
    
    int[] numerosArray = {1, 5, 6 , 1, 4};
    ArrayList<Integer> numerosArrayList = new ArrayList<>(5);
    public void Listas(){
    }
    /*
    para adicionar um novo elemento na array, 
    "numerosArray", precisamos de um metodo que cria uma nova array,
    copiando a array existente, adicionando mais um
    campo/posição com mais um elemento
    */
    public void adicionaElementoArray(int elemento){
        int[] novaNumerosArray = new int[numerosArray.length + 1];
        for(int i = 0; i < numerosArray.length; i++){
            novaNumerosArray[i] = numerosArray[i];
        }
        novaNumerosArray[numerosArray.length + 1] = elemento;
        for(Integer x: novaNumerosArray)
            System.out.println(x);
    }
    
    //e para mudar um elemento dentro de uma array
    public void modificandoElementosArray(int index, int elemento){
        if(Testes.ExcecaoDePontoNullo(index, numerosArray.length))
            throw new NullPointerException("OutOfRange");
        numerosArray[index] = elemento;
        for(Integer x: numerosArray)
            System.out.println(x);
    }
    
    /*
    as coisas ficam mais facies com numerosArrayList,
    ja que ArrayList é uma biblioteca expecifica pra
    criação de listas, ja tendo seus metodos para
    adicionar e retirar elementos, e suas posições são
    ilimitadas. Você pode adicionar quantos elementos quiser
    */
    
    public void adicionandoElementoArrayList(int elemento){
        numerosArrayList.add(elemento);
        for(Integer x: numerosArrayList)
            System.out.println(x);
    }
    
    public void modificandoElementosArrayList(int index, int elemento){
        numerosArrayList.set(index, elemento);
        for(Integer x: numerosArrayList)
            System.out.println(x);
    }
    
    /*
    existem tmb as arrays multidimencionais
    2D e 3D
    int[][]
    Arraylists<Arraylist<Integer>>
    */
}
