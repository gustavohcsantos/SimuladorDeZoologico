package Entidades;

import Util.DataUtility;
import javax.swing.JOptionPane;

public class Onca extends Animal {
    
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Eu sou uma Onça"
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
        setComportamentoDeTomarBanho(new TomarBanhoDeCachoeira());
        setComportamentoDeTomarBanho(new TomarBanhoDeMangueira());
        setComportamentoDeAndar(new AndarComQuatroPatas());
        rugir();
        executarCompartamentos();
    }
}
