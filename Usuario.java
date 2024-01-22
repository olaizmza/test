public class Usuario {
    private int id;
    public String email;
    public Usuario(int id, String email){
        this.id=id;
        this.email=email;

    }
    public int getId(){
         return this.id;
    }
    public void cambioId(int nuevoId){
        this.id=nuevoId;
    }

}
