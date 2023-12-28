public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Olá Brenda! ");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua Tiradentes");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        cliente.imprimirEndereco();
    }

}
