package simple.bank.gals.linguagens.formais.e.automatos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import simple.bank.linguagens.formais.e.automatos.SimpleBank;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        switch(action){
            case 1:
                System.out.println("Seu saldo é:\tR$ "+SimpleBank.saldo);
                break;
            case 2:
                SimpleBank.val = capturaValor();
                SimpleBank.saldo += SimpleBank.val;
                System.out.println("Depósito realizado no valor de R$ "+SimpleBank.val
                                    +"\n\n***********************"
                                    +"\n\nSeu novo saldo é:\t"
                                    +SimpleBank.saldo);
                break;
            case 3:
                SimpleBank.val = capturaValor();
                SimpleBank.saldo -= SimpleBank.val;
                System.out.println("Saque realizado no valor de R$ "+SimpleBank.val
                                    +"\n\n***********************"
                                    +"\n\nSeu novo saldo é:\t"
                                    +SimpleBank.saldo);
                break;
        }
    }	
    
    /*
     * captura valor na string e transforma para decimal com duas casas
     * arredondando o mesmo, caso necessário
    */
    public double capturaValor()
    {
        BigDecimal bd = new BigDecimal(
                                Double.parseDouble(SimpleBank.entrada.replaceAll("[^0-9\\.]", ""))
                            ).setScale(2, RoundingMode.HALF_EVEN);

        return bd.doubleValue();
    }
    
}
