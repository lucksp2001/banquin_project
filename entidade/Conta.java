package entidade;
 class Conta{
  private int numero;
  private double saldo;

  public Conta(int numero) {
    this.numero = numero; // 'this' obrigatório
    this.saldo=0;
  }

  public int getNumero() {
    return this.numero;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void creditar(double valor){
    this.saldo = this.saldo+valor;
  }
  
  public void debitar(double valor){
    this.saldo = this.saldo-valor;
  }

  /*
  class Conta{
    construtor(){
      this.numero=0;
      this.saldo=0;
    }
  }*/
}