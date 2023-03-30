package banco;

/**
 *
 * @author Emerson Pendragon
 */
public class ContaPoupanca extends ContaBancaria{
        private double limite;

        public ContaPoupanca(String numeroConta, double saldo, double limite) {
            super(numeroConta, saldo);
            this.limite = limite;
        }

    ContaPoupanca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
   

        @Override
        public void sacar(double valor) {
            if (saldo + limite >= valor){
                saldo -= valor;
                historico.add("Saque: " +valor);
            }else{
                System.out.println("Limite de credito excidido");
            }
            
        }

        @Override
        public void depositar(double valor) {
            saldo += valor;
            historico.add("Deposito: +valor");
            
        }

    void setNumeroDeConta(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        
        
        
    }































































//










