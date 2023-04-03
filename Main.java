import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String H="Hello World";
        System.out.print("Enter the Line : ");
        H=br.readLine();
        H=H.toUpperCase();
        for (int i = 0; i <= (H.length()); i++) {
            String j=H.substring(0,i);
            //System.out.println(H.indexOf('o'));
            System.out.println("Size : "+j.length()+" | "+j);
        }
    }
}