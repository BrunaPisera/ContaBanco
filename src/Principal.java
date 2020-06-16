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

        cliente1.sacar(700);

        System.out.println(cliente1.feedBack());
        System.out.println(cliente2.feedBack());

    }

}
