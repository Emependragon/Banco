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

        
        
        
    }































































//










