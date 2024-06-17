package norm;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] arg) throws IOException{
        ServerSocket ss= new ServerSocket(7777);
        Socket s=ss.accept();

        OutputStream out=s.getOutputStream();
        PrintStream ps= new PrintStream(out);

        ps.println("desta");
        ps.println("hello h r u?");
        ps.close();

    }
    
}
