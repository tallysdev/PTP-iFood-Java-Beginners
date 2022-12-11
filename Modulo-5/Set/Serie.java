
class Serie {
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
    
}