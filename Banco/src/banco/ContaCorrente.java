
package banco;

/**
 *
 * @author Emerson Pendragon
 */
public class ContaCorrente extends ContaBancaria {
private double taxaDeOperacao;

    public ContaCorrente(double taxaDeOperacao, String numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }
 @Override
    public void sacar(double valor) {
    double taxaDeOpecaracao = 0;
        double valorComTaxa = valor + taxaDeOpecaracao;
   if (saldo >= valorComTaxa){
       saldo-= valorComTaxa;
       historico.add("Saque: " + valorComTaxa);
   }else{
       System.out.println("Saldo insufiente");
   }
  } 

  @Override
    public void depositar(double valor) {
        double taxaDeOpecaracao = 0;
         double valorComTaxa = valor + taxaDeOpecaracao;
      saldo += valorComTaxa;
       historico.add("Deposito: " +valorComTaxa);
    }  
   }


 
    

