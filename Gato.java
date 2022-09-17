package Entidades;

import Util.DataUtility;
import javax.swing.JOptionPane;

public class Gato extends Animal {
    
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Eu sou um Gato"
                + "\n\nNome: " + getNome()
                + "\nCor: " + getCor()
                + "\nDescrição: " + getDescricao()
                + "\nIdentificador: " + getIdentificador()
                + "\nSexo: " + getSexo()
                + "\nData de Nascimento: " + DataUtility.formatarDataComPadrao(getDataDeNascimento(), "dd/MM/yyyy")
                + "\nDomesticado: " /*+ respostaDomestico*/
                + "\nEu tenho " + calcularIdade(getDataDeNascimento())+ " ano(s)."
                + "\nEspécie: " + especie.getDescricao()
                + "\n---------- Meus comportamentos são: ----------");
        
        setComportamentoDeAlimentar(new ComerCarne());
        setComportamentoDeAlimentar(new ComerRacao());
        emitirSomMiau();
        setComportamentoDeTomarBanho(new TomarBanhoDeMangueira());
        setComportamentoDeAndar(new AndarComQuatroPatas());
        
        executarCompartamentos();
    }
}
