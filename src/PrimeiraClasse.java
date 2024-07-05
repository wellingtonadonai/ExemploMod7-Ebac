import java.util.Set;

/**
 * @author wellingtonOliveira
 *
 */

public class PrimeiraClasse {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(23);
        cliente.imprmirEndereco();
        String end = cliente.retornarEnderecoCliente();

        System.out.println(cliente.getCodigo());
        System.out.println(end);
        System.out.println(cliente.valorTotal());





    }
}
