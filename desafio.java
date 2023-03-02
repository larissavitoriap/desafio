package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio {




    public static void main(String[] args) {


        String[] contatos = new String[20];
        String[] nomes = new String[20];
        String nome;



        int clicar;




        int ivariavel = 0;
        Scanner input = new Scanner(System.in);//menu




        do {
            System.out.println("1 = Cadastrar novo Contato na Agenda");//feito
            System.out.println("2 =Excluir Contato da Agenda");//feito mas ocorre um erro
            System.out.println("3 = Listar contatos da Agenda");//feito
            System.out.println("4 = Limpar todos os Contatos");
            System.out.println("99 = sair");//feito
            clicar = input.nextInt();


            switch (clicar) {


                // Cadastrar novo Contato na Agenda
                case 1 :

                    do {





                            System.out.println("cadastrar nome");
                            nomes[ivariavel] = input.next();
                            System.out.println("cadastrar numero");
                            contatos[ivariavel] = input.next();

                            ivariavel++;

                    } while (1 != clicar);
                    break;


                //Excluir Contato da Agenda

                case 2:
                    input.nextLine();
                    System.out.println("quer excluir? quem?");
                    nome= input.nextLine();



                    for (int i = 0; i < 20; i++) {

                        if (nome.equals(nomes[i])) {
                            nomes[i] = null;
                            contatos[i] = null;

                        }

                    }

                    System.out.println("contato excluido com sucesso ;)");

                    break;


                //Listar contatos da Agenda
                case 3:

                   for (int i = 0; i < 20; i++) {

                        if (nomes[i] != null) {

                            String contato =("nomes:" + nomes[i] + " "
                                    + "       /telefone:       " + contatos[i]);

                            System.out.println(contato);
                        }


                    } break;



                //Limpar todos os Contatos

                case 4:

                    System.out.println(" você esta excluindo todos os seus contatos!");

                    for (int i = 0; i < 20; i++) {


                        nomes[i] = null;
                        contatos[i]= null;




                    }


                    break;

                default:
                    System.out.println(" ");
                    break;


            }
        }while (clicar != 99) ;
            System.out.println("voce saiu do programa");


            input.close();


        }
    }

