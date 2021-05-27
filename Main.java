//import entidade.Cliente;
class Main {
  public static void main(String[] args) {
    Cliente clientes = new Cliente();
    clientes.nome="Otto";
    System.out.println("Cliente: "+clientes.nome);

    
    Conta contas = new Conta(99991);
    System.out.println("Conta: "+conta.getNumero()+ " = R$ "+conta.getSaldo());
    
  }
}