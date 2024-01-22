public class Main{
    public static void main(String[] args){
        Usuario olaiz=new Usuario(7,"olaizmfl@msmk.university");
        System.out.println("id:"+olaiz.getId()+" email:"+olaiz.email);
        olaiz.email="diego123";
        olaiz.cambioId(13);
        System.out.println("id:"+olaiz.getId()+" email:"+olaiz.email);
    }
}
