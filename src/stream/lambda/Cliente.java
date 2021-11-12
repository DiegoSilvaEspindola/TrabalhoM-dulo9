package stream.lambda;

public class Cliente implements Autentica  {

    private String nome;
    private String senha;
    private int compras;
    private boolean status;

    public Cliente (String nome, String senha, int compras, boolean status){
        this.compras = compras;
        this.nome = nome;
        this.senha = senha;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", compras=" + compras +
                ", status=" + status +
                '}';
    }



    @Override
    public void autentica(boolean status, String senha) {
        if(this.status == status && this.senha == senha){
            System.out.println("Cliente Validado");
        }else{
            System.out.println("Cliente irregular !");
        }
    }




}
