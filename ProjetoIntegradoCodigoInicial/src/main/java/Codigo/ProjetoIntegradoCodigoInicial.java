package Codigo;

import javax.swing.JOptionPane;


public class ProjetoIntegradoCodigoInicial {



private static String[] cadastro;
private static String[] login;

private static String menu = "HOPE\n\n" +

"1 --> Login\n" +

"2 --> Cadastro\n" +

"3 --> Sair";

/**

* Método inicial das aplicações Java SE

* @param args argumentos opcionais

*/

public static void main(String[] args) {

// escolha do usuario

String opcao = "";

do {

opcao = JOptionPane.showInputDialog(menu);

if (opcao.equals("1")) {

// Chama o codigo do login la de baixo

login();

} else if (opcao.equals("2")) {

// Chama o codigo de cadastro la de baixo

cadastro();

}

} while (!opcao.equals("3")); // comparacao usando String

} // fim do main

// cadastro

private static void cadastro() {
   

String nome=JOptionPane.showInputDialog("Qual seu nome?");

String senha=JOptionPane.showInputDialog("Qual será a sua senha?");

int matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual seu numero de matricula?"));


 



}




// Login

private static void login() {

int matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual seu numero de matricula?"));
String senha=JOptionPane.showInputDialog("Qual será a sua senha?");




}





}

