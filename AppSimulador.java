package App;

import Entidades.*;
import Util.DataUtility;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import lombok.*;

@Getter
@Setter

public class AppSimulador {

    public static void main(String[] args) {
        
        Especie Mamifero = new Especie();
        Mamifero.setDescricao("Mamífero");
        
        Especie Ave = new Especie();
        Ave.setDescricao("Ave");
        
        Especie Peixe = new Especie();
        Peixe.setDescricao("Peixe");

        String animal = "";
        int resposta;
        
        do{
        
            animal = JOptionPane.showInputDialog("Para qual animal deseja adicionar dados?\n\n"
                    + "1) Papagaio\n"
                    + "2) Leão\n"
                    + "3) Cavalo\n"
                    + "4) Tilápia\n"
                    + "5) Gato\n"
                    + "6) Elefante\n"
                    + "7) Galinha\n"
                    + "8) Cachorro\n"
                    + "9) Golfinho\n"
                    + "10) Onça\n");

            System.out.println("\n##########################################\n");
            
            switch (animal) {

                case "1":

                    Papagaio papagaio = new Papagaio();

                    papagaio.setNome(JOptionPane.showInputDialog("Nome: "));
                    papagaio.setCor(JOptionPane.showInputDialog("Cor: "));
                    papagaio.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    papagaio.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    papagaio.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    papagaio.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    papagaio.setEspecie(Ave);
                    papagaio.imprimir();

                    break;

                case "2":

                    Leao leao = new Leao();

                    leao.setNome(JOptionPane.showInputDialog("Nome: "));
                    leao.setCor(JOptionPane.showInputDialog("Cor: "));
                    leao.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    leao.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    leao.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    leao.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    leao.setEspecie(Mamifero);
                    leao.imprimir();

                    break;

                case "3":

                    Cavalo cavalo = new Cavalo();

                    cavalo.setNome(JOptionPane.showInputDialog("Nome: "));
                    cavalo.setCor(JOptionPane.showInputDialog("Cor: "));
                    cavalo.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    cavalo.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    cavalo.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    cavalo.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    cavalo.setEspecie(Mamifero);
                    cavalo.imprimir();

                    break;

                case "4":

                    PeixeTilapia tilapia = new PeixeTilapia();

                    tilapia.setNome(JOptionPane.showInputDialog("Nome: "));
                    tilapia.setCor(JOptionPane.showInputDialog("Cor: "));
                    tilapia.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    tilapia.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    tilapia.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    tilapia.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    tilapia.setEspecie(Peixe);
                    tilapia.imprimir();

                    break;

                case "5":

                    Gato gato = new Gato();

                    gato.setNome(JOptionPane.showInputDialog("Nome: "));
                    gato.setCor(JOptionPane.showInputDialog("Cor: "));
                    gato.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    gato.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    gato.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    gato.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    gato.setEspecie(Mamifero);
                    gato.imprimir();

                    break;

                case "6":

                    Elefante elefante = new Elefante();

                    elefante.setNome(JOptionPane.showInputDialog("Nome: "));
                    elefante.setCor(JOptionPane.showInputDialog("Cor: "));
                    elefante.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    elefante.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    elefante.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    elefante.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    elefante.setEspecie(Mamifero);
                    elefante.imprimir();

                    break;

                case "7":

                    Galinha galinha= new Galinha();

                    galinha.setNome(JOptionPane.showInputDialog("Nome: "));
                    galinha.setCor(JOptionPane.showInputDialog("Cor: "));
                    galinha.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    galinha.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    galinha.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    galinha.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    galinha.setEspecie(Ave);
                    galinha.imprimir();

                    break;

                case "8":

                    Cachorro cachorro = new Cachorro();

                    cachorro.setNome(JOptionPane.showInputDialog("Nome: "));
                    cachorro.setCor(JOptionPane.showInputDialog("Cor: "));
                    cachorro.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    cachorro.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    cachorro.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    cachorro.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    cachorro.setEspecie(Mamifero);
                    cachorro.imprimir();

                    break;

                case "9":

                    Golfinho golfinho = new Golfinho();

                    golfinho.setNome(JOptionPane.showInputDialog("Nome: "));
                    golfinho.setCor(JOptionPane.showInputDialog("Cor: "));
                    golfinho.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    golfinho.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    golfinho.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    golfinho.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    golfinho.setEspecie(Mamifero);
                    golfinho.imprimir();

                    break;

                case "10":

                    Onca onca = new Onca();

                    onca.setNome(JOptionPane.showInputDialog("Nome: "));
                    onca.setCor(JOptionPane.showInputDialog("Cor: "));
                    onca.setDescricao(JOptionPane.showInputDialog("Descrição: "));
                    onca.setIdentificador(parseInt(JOptionPane.showInputDialog("Identificador: ")));
                    onca.setSexo(JOptionPane.showInputDialog(null,"Sexo: ").charAt(0));
                    onca.setDataDeNascimento(DataUtility.transformarStringEmDate("12/12/2012"));
                    onca.setEspecie(Mamifero);
                    onca.imprimir();

                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Opção inválida!");

                    break;

            }// fim switch
            do{
                
                resposta = parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro animal?\n\n1) Sim\n2) Não"));
                
                if(resposta == 1){
                    JOptionPane.showMessageDialog(null, "Boa escolha");
                } if(resposta > 2){
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
                
            }while(resposta > 2);
            
        }while(resposta == 1);
    }
}
