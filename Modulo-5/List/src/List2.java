import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class List2 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
    
    List<Gato> meusGatos = new ArrayList<Gato>(){{
        add(new Gato("tata", "preto", 8));
        add(new Gato("fafa", "braco", 9));
        add(new Gato("yaya", "lilas", 5));
    }};    

    System.out.println(meusGatos);  

    Collections.shuffle(meusGatos);

    System.out.println(meusGatos);  

    

    }


}


class Gato implements Comparable<Gato>{
    private String nome, cor;
    private int idade;
    
    public Gato(String nome, String cor, int idade){
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "[nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    } 

    
}