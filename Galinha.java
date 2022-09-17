package Entidades;

import Util.DataUtility;
import javax.swing.JOptionPane;

public class Galinha extends Animal {
    
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Eu sou uma Galinha"
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
        
        setComportamentoDeAlimentar(new ComerSementes());
        setComportamentoDeAlimentar(new ComerRacao());
        setComportamentoDeVoar(new VoarDeAsaDelta());
        setComportamentoDeEmitirSom(new EmitirSomGalinha());
        setComportamentoDeTomarBanho(new TomarBanhoDeMangueira());
        setComportamentoDeAndar(new AndarComDuasPatas());
        
        executarCompartamentos();
    }
}
