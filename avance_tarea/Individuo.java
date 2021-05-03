public class Individuo {
    // private Comuna comuna;
    private int estado; // ( 0=sano / 1=infectado / 2=recuperado / 3=vacunado )
    private bool mascarilla; 



    public Individuo(){
      estado = 0;         // la gente por lo gral es sana
      mascarilla = false; // la gente no nace con mascarilla
    }  // Individuo


    //** Connstructor Individuo **//
    public Individuo ( int estado; bool mascarilla ){
      this.setEstado(estado);
      this.setMascarilla(mascarilla)
    }

    // Estado
    public String getEstado() {
        return estado;
    }

    public String setEstado( int valorEstado ) {
        this.estado = valorEstado;
    }

    // Mascarilla
    public String getMascarilla() {
        return this.mascarilla;
    }

    public String setMascarilla( int mascarilla ) {
        this.estado = mascarilla;
    }


}
