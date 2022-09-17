package Entidades;

import Util.DataUtility;
import javax.swing.JOptionPane;

public class Cavalo extends Animal {
    
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Eu sou um Papagaio"
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
        
        setComportamentoDeAlimentar(new ComerFrutas());
        setComportamentoDeAlimentar(new ComerLegumes());
        setComportamentoDeAlimentar(new ComerRacao());
        setComportamentoDeEmitirSom(new EmitirSomCavalo());
        setComportamentoDeTomarBanho(new TomarBanhoDeMangueira());
        setComportamentoDeTomarBanho(new TomarBanhoDeCachoeira());
        setComportamentoDeAndar(new AndarComQuatroPatas());
        
        executarCompartamentos();
    }
}
