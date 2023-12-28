public class Cliente {
    private int codigo;
// o nome da classe deve começar sempre com maiuscula
// ja o nome dos metodos usando camelCase
    public int getCodigo() {
        return codigo;
    }
// GET serve pra pegar um valor da classe e SET pra adicionar um valor a ela
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
// public serve pra que outras Classes possam ter acesso
// ao método cadastrarEndereco
// Void significa que nao vai ter nenhum retorno no metodo
    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);

    }

    public void imprimirEndereco() {
        System.out.println(this.endereco);
    }
}

