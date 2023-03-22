
package banco;

import java.util.ArrayList;
/**
 *
 * @author Emerson Pendragon
 */
public abstract class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected ArrayList<String> historico;
    

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.historico = new ArrayList<>();
    }
    
    public abstract void sacar(double valor);
    
    public abstract void depositar (double valor);
}
