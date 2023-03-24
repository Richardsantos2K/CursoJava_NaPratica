package InterfaceGraficaJava;

import javax.swing.*;  //o * é usado pois não sabemos que biblioteca usar dentro do java swing, ent ele referencia todas as bibliotecas

public class PacoteSwing extends JFrame { //A classe principal ira herdar todos os atributos e metodos da nossa classe Jframe

    public static void main(String[] args) {
        PacoteSwing formulario = new PacoteSwing(); //Jframe é uma janela
        //formulario.setBounds(x, y, width, height); //largura (width), altura(height)
        formulario.setLayout(null);//serve que evite as configurações padrão, isso faz com que as configurações sejam aplicadads do jeito que definimos
        formulario.setBounds(100, 200, 600, 400);//apos passar esse comando "setLocationRelativeTo" não sera mais nescessario este calculo para iniciar a aplicação em algum local do monitor
        formulario.setVisible(true);//setVisible(true) tornara a janela visivel
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a aplicação assim que sair
        formulario.setResizable(true);// ira redimencionar ou não a nossa aplicação
        formulario.setLocationRelativeTo(null);//quando passamos esse comando ele ira centralizar a aplicação para o meio do monitor
        formulario.setTitle("Minha aplicação grafica");//ira colocar um titulo na aplicação

    }


}
