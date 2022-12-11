import java.util.Comparator;

class Serie implements Comparable<Serie>{
    public String nome;
    public String genero;
    public Integer ep;
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getEp() {
        return ep;
    }
    public Serie(String nome, String genero, Integer ep) {
        this.nome = nome;
        this.genero = genero;
        this.ep = ep;
    }
    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", ep=" + ep + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((ep == null) ? 0 : ep.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (ep == null) {
            if (other.ep != null)
                return false;
        } else if (!ep.equals(other.ep))
            return false;
        return true;
    }
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Serie serie) {
        // TODO Auto-generated method stub
        int quantEp = Integer.compare(this.getEp(), serie.getEp());
        if(quantEp != 0 ) return quantEp;
        return this.getNome().compareTo(serie.getNome());
    }
    
}

class ComparatorNomeGenerpEp implements Comparator<Serie> {

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0 ) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0 ) return genero;

        return Integer.compare(s1.getEp(), s2.getEp());
    }
    
}