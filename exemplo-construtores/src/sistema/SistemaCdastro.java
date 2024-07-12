package sistema;

public class SistemaCdastro {
    public static void main(String[] args) {
        Pessoa usuario = new Pessoa("julio", "123.456.789-00");

        usuario.setIdade(23);

        System.out.println("Nome" + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Idade: " + usuario.getIdade());
    }
}
