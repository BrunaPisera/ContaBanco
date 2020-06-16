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
        this.tipo = tipo;
        this.status = false;
        if(tipo == "cc"){
            this.saldo = 50;
        }else if(tipo == "cp"){
            this.saldo = 150;
        }else{
            System.out.println("Tipo de conta inválida!");
        }
    }
    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Conta com dinheiro");
        }
        else if(this.saldo < 0){
            System.out.println("Conta em debito");
        }
        else{
            this.status =  false;
        }
    }
    public void depositar (float valor){
        if(this.status == true){
            this.saldo =  this.saldo + valor;
        }else{
            System.out.println("Impossivel depositar");
        }

    }
    public void sacar(float valor){
        if(this.status == true && this.saldo > valor){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Impossivel sacar! Verifique o saldo da conta ou sua ativação");
        }
    }
    public void pagarMensal(){
        int v;
        if(this.tipo == "cc"){
            v = 12;
        }else{
            v = 20;
        }
        if(this.status == true){
            if(this.saldo > v){
                this.saldo = this.saldo - v;
            }else{
                System.out.println("Não ha saldo disponivel!");
            }
        }else{
            System.out.println("Sua conta esta desativada!");
        }
    }
        public String feedBack(){
            StringBuilder builder = new StringBuilder();
            builder.append("\nO nome do dono é" + " " + this.dono);
            builder.append("\nSeu saldo é" + " " + this.saldo);
            builder.append("\nO numero da conta é" + " " + this.numConta);
            builder.append("\nO tipo da conta é" + " " + this.tipo);
            builder.append("\n********************************");
            return builder.toString();
        }
}
