import javax.swing.JOptionPane;

public class agenda5V1 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Ola Mundo", "Programa do Sergio", JOptionPane.INFORMATION_MESSAGE);
        
        /*  Revisão
        //Recebendo valores do usuario
        int variavelInt = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor inteiro:"));
        double variavelDouble = Double.parseDouble(JOptionPane.showInputDialog("Entre com um valor real:"));
        String variavelString = JOptionPane.showInputDialog("Entre com uma mensagem para criptografar:");

        // Apresentando os valores recebido do usuario.
        JOptionPane.showMessageDialog(null, "Valor Inteiro: " + variavelInt, "Programa do Sergio", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Valor Double: " + variavelDouble, "Programa do Sergio", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mesagem a ser criptografada: " + variavelString, "Programa do Sergio", JOptionPane.INFORMATION_MESSAGE);
        */

        // Inicio
        String variavelString = JOptionPane.showInputDialog("Entre com uma mensagem a ser criptografada:");
        JOptionPane.showMessageDialog(null, "Mesagem a ser criptografada: " + variavelString, "Programa do Sergio", JOptionPane.INFORMATION_MESSAGE);
        
        
        //Convertendo a String de entrada em array tipo char
        char[] caracteres = variavelString.toCharArray(); // cada caracter da string ocupa uma posição do vetor
        for(char c: caracteres){ //for percorre o array caracteres e atribui cada posição à variavel letra.

            JOptionPane.showMessageDialog(null, "Caracter a ser criptografado: "+ c);
        } 

        // construtor para concatenar strings
        StringBuilder mensagemCriptografada = new StringBuilder(); 
        StringBuilder caractereAscii = new StringBuilder(); 
        
        //Obter o valor ASCII da string
        for(char c: caracteres){
            int valorAsciiOriginal = (int) c;

        // Exibir o valor ASCII original
        JOptionPane.showMessageDialog(null, "Valor ASCII do caracter: " + c + " : "+ valorAsciiOriginal);

            caractereAscii.append(valorAsciiOriginal);
        }
        JOptionPane.showMessageDialog(null,"Valor dos caracteres: " + caractereAscii.toString());

        for(char c: caracteres){
            int valorAsciiOriginal = (int) c;

        // Criptografar mensagem- Somar 10 em cada caracter
        int valorAsciiCriptografado = valorAsciiOriginal + 10;

        // Exibir o valor ASCII original
        JOptionPane.showMessageDialog(null, "Valor ASCII do caracter criptografado: " + c + " : "+ valorAsciiCriptografado);
        
        //Converter valor ASCII criptografado para caracter
        char caracterCriptografado = (char) valorAsciiCriptografado;
        
        //Concatena os caractres convertidos para formar a mensagem criptografada
        mensagemCriptografada.append (caracterCriptografado);
        }
        //Exibindo mensagem criptografada
        JOptionPane.showMessageDialog(null,"Messagem Criptografada: " + mensagemCriptografada.toString());

   
    }
}
