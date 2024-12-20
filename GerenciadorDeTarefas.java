import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    
    public static void adicionar(ArrayList<String> tarefas){
        Scanner scanner = new Scanner(System.in);
        String tarefa;
        System.out.println("insira a descriçao da tarefa: ");
        tarefa = scanner.nextLine();
        scanner.nextLine();
        tarefas.add(tarefa);
        System.out.println("tarefa adicionada");
        

    }
    public static void remover(ArrayList<String> tarefas){
        Scanner scanner = new Scanner(System.in);
        int remover;
        for(int i = 0;i<tarefas.size();i++){
            System.out.println(i+"- "+tarefas.get(i));
        }
        System.out.println((tarefas.size()+1)+"- voltar");
        try{ 
            System.out.println("digite o numero da tarefa a ser removida: ");
            remover = scanner.nextInt();
            scanner.nextLine();
            if(remover == (tarefas.size()+1) ){
            System.out.println("voltando.. ");
            }else{
                tarefas.remove(remover);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: indice invalido");
        }catch(Exception e){
            System.out.println("Erro inesperado:"+e.getMessage());
        }finally{
            System.out.println("tarefa removida");
        }
        
        
    }
    public static void mostrarTarefas(ArrayList<String> tarefas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tarefas a serem relizadas:\n");
        for(int i = 0;i<tarefas.size();i++){
            System.out.println(i+"- "+tarefas.get(i));
        }
        System.out.println("pressione enter para voltar ao menu");
        scanner.nextLine();
        
    }
    public static void menu(ArrayList<String> tarefas) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        System.out.println("Bem vindo ao gerenciador de tarefas!\n");
        System.out.println("[1]adicionar tarefa\n[2]remover tarefa\n[3]mostrar tarefas\n[4]sair\n");
        escolha = scanner.nextInt();
        scanner.nextLine();
        switch (escolha) {
            case 1:
                adicionar(tarefas);
                break;
            case 2:
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa para remover.");
                    }else{
                        remover(tarefas);
                    }
                break;
            case 3:
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa .");}
                else{
                    mostrarTarefas(tarefas);}
            case 4:
                break;
            default:
                System.out.println("valor invalido");

        }
        
    }
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            menu(tarefas);
            
            
        }
    }
    
}
