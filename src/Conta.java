public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(){
        this.status = false;
        this.saldo = 0;
    }
    public Conta(int numConta, String tipo, String dono, float saldo, boolean status){
        this.numConta = numConta;
        this.tipo = tipo;
        this.saldo =  saldo;
        this.status = status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getDono() {
        return dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getIsStatus() {
        return status;
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if(tipo == "cc"){
            setSaldo(50);
        }else if(tipo == "cp"){
            setSaldo(150);
        }else{
            System.out.println("Tipo de conta inválida!");
        }
    }
    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }
        else if(getSaldo() < 0){
            System.out.println("Conta em debito");
        }
        else{
            this.status =  false;
        }
    }
    public void depositar (float valor){
        if(getIsStatus() == true){
            this.saldo =  this.saldo + valor;
        }else{
            System.out.println("Impossivel depositar");
        }

    }
    public void sacar(float valor){
        if(getIsStatus() == true && getSaldo() > valor){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Impossivel sacar! Verifique o saldo da conta ou sua ativação");
        }
    }
    public void pagarMensal(){
        int v;
        if(getTipo() == "cc"){
            v = 12;
        }else{
            v = 20;
        }
        if(getIsStatus() == true){
            if(getSaldo() > v){
                this.saldo = this.saldo - v;
            }else{
                System.out.println("Não ha saldo disponivel!");
            }
        }else{
            System.out.println("Sua conta esta desativada!");
        }
    }
}
