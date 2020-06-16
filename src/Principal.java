public class Principal {
    public static void main(String[] args) {
        Conta cliente1 = new Conta();
        Conta cliente2 = new Conta();

        cliente1.abrirConta("cc");
        cliente2.abrirConta("cp");

        cliente1.setDono("Bruna Pissará");
        cliente2.setDono("Matheus Minguini");
        cliente1.setNumConta(5252);
        cliente2.setNumConta(5353);

        cliente1.depositar(500);
        cliente2.depositar(300);

        cliente1.sacar(100);

        System.out.println("O nome do dono é" + " " + cliente1.getDono());
        System.out.println("O numero da conta é" + " " + cliente1.getNumConta());
        System.out.println("Seu saldo é" + " " + cliente1.getSaldo());
        System.out.println("O tipo da conta é" + " " + cliente1.getTipo());
        System.out.println("O nome do dono é" + " " + cliente2.getDono());
        System.out.println("O numero da conta é" + " " + cliente2.getNumConta());
        System.out.println("Seu saldo é" + " " + cliente2.getSaldo());
        System.out.println("O tipo da conta é" + " " + cliente2.getTipo());
    }

}
