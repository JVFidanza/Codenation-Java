package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {
    int i = 0;
    ArrayList<Tarefa> tarefas = new ArrayList<>();
    public void adicionar(Tarefa tarefa){
        if(tarefa != null && tarefa.obterTamanhoTarefa() <= 80){
            this.tarefas.add(tarefa);
        }else{
            System.out.println("Tarefa inválida ");
        }
    }
    public void remover(int posicao){
        this.tarefas.remove(posicao);
    }

    public void exibirTarefas(){
        for(Tarefa tarefa: tarefas){
            i++;
            System.out.print(i+" ");
            tarefa.exibirTarefa();
        }
    }
}
