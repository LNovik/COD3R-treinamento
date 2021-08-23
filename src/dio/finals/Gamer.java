package dio.finals;

public class Gamer {

    public String keyboard(){
       return "Keyboard Gamer!";
   }

   // A classe que herdar desta, não poderá sobrescrever este método final
   public final String mouse(){
       return "Mouse Gamer!";
   }

}
