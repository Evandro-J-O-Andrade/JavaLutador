
public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public void apresenta() {
        System.out.println(" Chegou a Hora! Apresetamos o Lutador " + this.getNome());
        System.out.println(" Diretamente de " + this.getNacionalidade());
        System.out.println(" Com "+ this.getIdade());
        System.out.println("Pesando " + this.getPeso());
        System.out.println(this.getVitorias());
        System.out.println(this.getDerrotas());
        System.out.println(this.getEmpates());
    }

    public void status() {
        System.out.println(this.getNome() + "é um peso" + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias()+"vezes ");
        System.out.println("Perdeu " + this.getDerrotas()+ "vezes ");
        System.out.println("Empatou " + this.getEmpates()+"vezes ");
    }

    public void ganhaLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perdeLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empataLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    /**
     *
     * @param nome
     * @param nacionalidade
     * @param idade
     * @param altura
     * @param peso
     * @param vitorias
     * @param derrotas
     * @param empates
     */
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public final void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
        
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria= " Inválido ";
        }else if(this.peso <=70.3){
            this.categoria = " Leve "; 
        }else if (this.peso <=83.9){
            this.categoria = " Medio " ; 
        }else if (this.peso <= 120.2) {
            this.categoria= " Pesado ";          
        }else{
            this.categoria = " Inválido ";          
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
