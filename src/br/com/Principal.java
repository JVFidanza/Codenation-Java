package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;

public class Principal {
    public static void main(String[] args){
        String minhasTarefas = "Minhas Tarefas";
        System.out.println(minhasTarefas);
        System.out.println("-----------------");

        ListaTarefas tarefas = new ListaTarefas( );
        Tarefa tarefa1 = new Tarefa("mandar braza uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Tarefa tarefa2 = new Tarefa("dar o gas");
        Tarefa tarefa3 = new Tarefa("tomar umas");

        tarefas.adicionar(tarefa1);
        tarefas.adicionar(tarefa2);
        tarefas.adicionar(tarefa3);
        tarefas.exibirTarefas();

        System.out.println("A tarefa 1 tem " + tarefa1.obterTamanhoTarefa() + " caracteres");
    }
}