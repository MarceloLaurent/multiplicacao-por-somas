//Exercicio1
package controller;

public class MultiplicacaoController {

    public MultiplicacaoController() {
        super();
    }

    public int multiplicacao(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        } else if (a == 1) {
            return b;
        } else{
            return b + multiplicacao(a -1, b);
        }
    }
}
