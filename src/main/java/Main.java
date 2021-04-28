import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        try{
            new CreateConnection().connect();
        }catch (IOException ex){
            ex.getMessage();
        }
    }
}
