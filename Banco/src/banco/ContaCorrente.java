
package banco;

/**
 *
 * @author Emerson Pendragon
 */
public class ContaCorrente extends ContaBancaria {
private double taxaDeOperacao;

    public ContaCorrente(double taxaDeOperacao, String numeroConta, double saldo, Object par3) {
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    ContaCorrente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    void setNumeroDeConta(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   }


 
    

