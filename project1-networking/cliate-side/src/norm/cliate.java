import java.net.*;
import java.io.*;
public class cliate {
    public static void main (String[] arg) throws Exception{
        Socket s = new Socket("localhost",7777);
        InputStream in = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String str=br.readLine();

        while(str != null){
        System.out.println(str);
        str = br.readLine();
}
br.close();
        
    } 
}
