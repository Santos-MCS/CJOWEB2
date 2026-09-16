package br.edu.ifspcjo.ads.web2.view;

import java.util.Scanner;

//import javax.swing.JOptionPane;

import br.edu.ifspcjo.ads.web2.controller.EmployeesController;
import br.edu.ifspcjo.ads.web2.model.ComissionedAndSalariedEmployee;
import br.edu.ifspcjo.ads.web2.model.ComissionedEmployee;
import br.edu.ifspcjo.ads.web2.model.Employee;
import br.edu.ifspcjo.ads.web2.model.HourlyEmployee;
import br.edu.ifspcjo.ads.web2.model.SalariedEmployee;

public class App {

    private static EmployeesController employeesController = 
        new EmployeesController();        

    private static Scanner teclado = new Scanner(System.in);
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        // Employee employee1 = 
        //     new SalariedEmployee("Adriana", "1234", 3000);

        // employeesController.save(employee1);
        // System.out.println(employee1);
        // System.out.println(employee1.calculateIncome());
        
        // Employee employee2 =
        //     new HourlyEmployee("Juliana", "5678", 10, 365);
        // System.out.println(employee2.calculateIncome());

    


    // ArrayList<Employee> employeesList = new ArrayList<>();

    int opcao;

    do {

        System.out.println();
        System.out.println("=== MENU ===");
        System.out.println("1 - Adicionar novo funcionário.");
        System.out.println("2 - Gerar folha de pagamento.");
        System.out.println("0 - Sair");

        System.out.print("Escolha uma opção: ");

        opcao = teclado.nextInt();
        teclado.nextLine();

        switch (opcao) {
    
            case 1:
                int opcao2;
                do {
                System.out.println();
                System.out.println("=== Seleção de Tipo de Funcionário ===");
                System.out.println("1 - Funcionário Assalariado.");
                System.out.println("2 - Funcionário Horista.");
                System.out.println("3 - Funcionário Comissionado.");
                System.out.println("4 - Funcionário Assalariado Comissionado.");
                System.out.println("0 - Voltar ao menu principal.");
                System.out.print("Escolha uma opção: ");
                opcao2 = teclado.nextInt();
                teclado.nextLine();

                switch (opcao2) {

                    case 1:

                        adicionarFuncionarioAssalariado();
                        break;

                    case 2:
                        
                        adicionarFuncionarioHorista();
                        break;

                    case 3:
                        
                        adicionarFuncionarioComissionado();
                        break;

                    case 4:
                        
                        adicionarFuncionarioAssalariadoComissionado();
                        break;

                    case 0:
                        
                        System.out.println("Saindo...");
                        
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao2 != 0);
                break;

            case 2:

                break;
            
            case 0:
                System.out.println("Saindo do programa...");    

                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    while (opcao != 0);
    }

    // private static void generatePayroll(){
    //     String message = "";

    // }


    private static void adicionarFuncionarioAssalariadoComissionado() {
        System.out.println("Digite o nome do funcionário: ");
        String name = teclado.nextLine();
        System.out.println("Digite o CPF do funcionário: ");
        String cpf = teclado.nextLine();
        System.out.println("Digite o valor da venda: ");
        double salesValue = teclado.nextDouble();
        System.out.println("Digite a porcentagem da comissão: ");
        double comissionPercentege = teclado.nextDouble();
        System.out.println("Digite o salário do funcionário: ");
        double salary = teclado.nextDouble();

        Employee employee = new ComissionedAndSalariedEmployee(name, cpf, salesValue, comissionPercentege, salary);
        employeesController.save(employee);
    }

    private static void adicionarFuncionarioComissionado() {
       System.out.println("Digite o nome do funcionário: ");
       String name = teclado.nextLine();
       System.out.println("Digite o CPF do funcionário: ");
       String cpf = teclado.nextLine();
       System.out.println("Digite o valor da venda: ");
       double salesValue = teclado.nextDouble();
       System.out.println("Digite a poncentagem da comissão: ");
       double comissionPercentege = teclado.nextDouble();

       Employee employee = new ComissionedEmployee(name, cpf, salesValue, comissionPercentege);
       employeesController.save(employee);
    }

    private static void adicionarFuncionarioHorista() {
        System.out.println("Digite o nome do funcionário: ");
        String name = teclado.nextLine();
        System.out.println("Digite o CPF do funcionário: ");
        String cpf = teclado.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int numberOfHoursWorked = teclado.nextInt();
        System.out.println("Digite o valor das horas trabalhadas: ");
        double valueOfHorsWorked = teclado.nextDouble();

        Employee employee = new HourlyEmployee(name, cpf, numberOfHoursWorked, valueOfHorsWorked);
        employeesController.save(employee);

    }

    private static void adicionarFuncionarioAssalariado() {
        System.out.println("Digite o nome do funcionário: ");
        String name = teclado.nextLine();
        System.out.println("Digite o CPF do funcionário: ");
        String cpf = teclado.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        double salary = teclado.nextDouble();

        Employee employee = new SalariedEmployee(name, cpf, salary);
        employeesController.save(employee);
        
    }
    
}
