
package CadastroHope;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Menu {

private static String menu = "HOPE\n\n" +

"1 --> Cadastro\n" +
        
"2 --> Lista de Usuarios(ADM)\n" +   
        
"3 --> Editar Usuario\n" +
        
"4 --> Excluir Usuario\n" +           

"5 --> Sair";



public static void main(String[] args) {

ArrayList<Usuario> usuarios = new ArrayList();    

// escolha do usuario

String opcao = "";

do {

opcao = JOptionPane.showInputDialog(menu);

if (opcao.equals("1")) {

// Codigo de cadastro

   String usuario = JOptionPane.showInputDialog("qual seu nome de usuario?");
   int matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual seu numero de matricula?"));
   String senha = JOptionPane.showInputDialog("Qual será sua senha?");
   
   Usuario u = new Usuario();
   u.setUsuario(usuario);
   u.setSenha(senha);

   usuarios.add(u);
   
   JOptionPane.showMessageDialog(null,"Usuario Cadastrado com sucesso!!");


} else if (opcao.equals("2")) {
    
 // Chama o codigo de Listar usuarios de baixo  

    String uTemp="Lista de Usuarios \n\n";
   
 for(int i = 0; i < usuarios.size(); i++) {
     
     uTemp += usuarios.get(i).getUsuario()+" "+ usuarios.get(i).getSenha()+"\n" ;
     
 
 }
 
 JOptionPane.showMessageDialog(null,uTemp);
 
 
}  else if (opcao.equals("3")) {
    
 // Chama o codigo de editar usuario la de baixo
 
  String usuario = JOptionPane.showInputDialog("Qual seu nome de usuario?");
  
  boolean encontrado = false;
  for(int i = 0; i < usuarios.size(); i++){
                
      if (usuario.equals(usuarios.get(i).getUsuario())){
          JOptionPane.showMessageDialog(null,"Usuario encontrado!");
          String usuarionovo = JOptionPane.showInputDialog("qual seu novo nome de usuario?");
          String senhanova = JOptionPane.showInputDialog("qual sua nova senha?");
          usuarios.get(i).setUsuario(usuarionovo);
          usuarios.get(i).setSenha(senhanova);
          encontrado=true;
          JOptionPane.showMessageDialog(null,"Usuario editado com sucesso!!");
      }
          
      
  } 
  
  if(encontrado== false){
      JOptionPane.showMessageDialog(null,"Usuario nao encontrado!");
 
 
 } } else if (opcao.equals("4")){
    
 // chama o codigo de excluir usuario de baixo

 String usuario = JOptionPane.showInputDialog("Qual seu nome de usuario?");
  
  boolean encontrado = false;
  for(int i = 0; i < usuarios.size(); i++){
           
      
      if (usuario.equals(usuarios.get(i).getUsuario())){
          
          usuarios.get(i).setUsuario("");
          usuarios.get(i).setSenha("");
          encontrado=true;
          JOptionPane.showMessageDialog(null,"Usuario Excluido com sucesso!!");
      }
          
      
  } 
  
  if(encontrado== false){
      JOptionPane.showMessageDialog(null,"Usuario nao encontrado!");
 
 
 }

}



} while (!opcao.equals("5")); // comparacao usando String

} // fim do main

}

