package view;

import controller.MultiplicacaoController;

public class Main {
    public static void main(String[] args) {

        MultiplicacaoController mc = new MultiplicacaoController();

        int resultado = mc.multiplicacao(4, 5);

        System.out.println(resultado);
    }
}