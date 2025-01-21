import java.util.ArrayList;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TarefList {

    java.util.Date juDate = new Date();
    
    public static void main(String[] args) throws InterruptedException {

        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance(DateFormat.MEDIUM);

        Scanner sc = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();
        
        int op;

        do {
            System.out.println("--------------------------------------");
            System.out.println(" BEM VINDO(A) A LISTA DE TAREFAS 1.0");
            System.out.println("--------------------------------------");
            System.out.println("              MENU: ");
            System.out.println("--------------------------------------");
            System.out.println("DATA DE ACESSO: " + f.format(data));
            System.out.println("1- Listar Tarefas: " );
            System.out.println("2- Remover Tarefa: " );
            System.out.println("3- Adicionar Tarefa: ");
            System.out.println("0- Sair: ");
            System.out.println("--------------------------------------");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();
            System.out.println("ACESSANDO SUA ESCOLHA...");
            System.out.println("--------------------------------------");
            switch (op) {
                case 1:
                    System.out.println("Suas tarefas:");
                    if (tarefas.isEmpty()){
                        System.out.println("Nenhuma tarefa adicionada ainda.");
                    }else{
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i+1) + " - " + tarefas.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da tarefa que deseja remover: ");
                    if (tarefas.isEmpty()){
                        System.out.println("Nenhuma tarefa para remover.");
                    }else{
                        int indexToRemove = sc.nextInt();
                        sc.nextLine();
                        if (indexToRemove > 0 && indexToRemove <= tarefas.size()){
                                tarefas.remove(indexToRemove - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        }else{
                            System.out.println("Número inválido!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("ADICIONE A TAREFA DESEJADA: ");
                    sc.nextLine(); 
                    String aux = sc.nextLine();
                    tarefas.add(aux);
                    System.out.println("Você adicionou uma nova tarefa! Seu total de tarefas é: " + tarefas.size());
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    TimeUnit.SECONDS.sleep(2);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }while (op != 0);
    }
}
