package advans;
import java.net.*;
import java.io.*;

class bestCliate {
   public static void main(String[] arg)throws Exception{
    Socket s=new Socket("localhost",8877);
    System.out.println("connected succesfully: ");

    InputStream is=s.getInputStream();
    BufferedReader serverReader= new BufferedReader(new InputStreamReader(is));

    BufferedReader keybordReader= new BufferedReader(new InputStreamReader(System.in));

    OutputStream os= s.getOutputStream();
    PrintStream serverWritter= new PrintStream(os);

    String sMessage;
    String cMessage;

    while(true){
        System.out.print("cliate: ");
        cMessage = keybordReader.readLine();
        serverWritter.println(cMessage);
        if(cMessage.equalsIgnoreCase("bye")){
            System.out.print("connection is closed: ");
            break;
        }
        sMessage = serverReader.readLine();
        System.out.println("server: "+ sMessage);
    }

    serverWritter.close();
    keybordReader.close();
    serverReader.close();
    s.close();
   }
}
    
