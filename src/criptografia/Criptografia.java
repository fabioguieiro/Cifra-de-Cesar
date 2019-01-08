package criptografia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Criptografia {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String frase;
        int menu = 1;
        frase = "";
        while (menu != 0) {
            System.out.println("\t\tBem vindo ao programa CIFRA DE CESAR");
            System.out.println("escolha uma opcao");
            System.out.println("1- escrever a Mensagem");
            System.out.println("2- Ler a Mensagem Descriptografada");
            System.out.println("3- Ler a Mensagem Criptografada");
            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    try {
                        FileWriter arq = new FileWriter("mensagem.txt");
                        BufferedWriter escritor = new BufferedWriter(arq);
                        System.out.print("Digite a Mensagem: ");
                        frase = ler.nextLine();
                        while (!frase.contentEquals("fim")) {
                            escritor.write(frase);
                            escritor.newLine();
                            escritor.flush();
                            System.out.print("Digite a mensagem: ");
                            frase = ler.nextLine();
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("\t\t~~~~mensagem de Cesar~~~~");
                        FileReader reader = new FileReader("mensagem.txt");
                        BufferedReader leitor = new BufferedReader(reader);
                        String linha = "";
                        while (true) {
                            linha = leitor.readLine();
                            if (linha == null) {
                                break;
                            }
                            System.out.println(linha);
                        }
                        System.out.println("-------------------------------------------------------");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                    
                case 3:
                    try {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("\t\t~~~~mensagem de Cesar~~~~");
                        FileReader reader = new FileReader("mensagem.txt");
                        BufferedReader leitor = new BufferedReader(reader);
                        String linha = "";
                        while (true) {
                            linha = leitor.readLine();
                            if (linha == null) {
                                break;
                            }char linhac[]=linha.toCharArray();
                            for (int i=0;i<linhac.length;i++){
                                linhac[i]+=2;
                            }
                            
                            System.out.println(linhac);
                        }
                        System.out.println("-------------------------------------------------------");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
            }
        }

    }

}
