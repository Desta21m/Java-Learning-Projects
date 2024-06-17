package advans;
import java.net.*;
import java.io.*;

class bestServer {
  public static void main(String[] arg)throws Exception{

      ServerSocket ss=new ServerSocket(8877);
      System.out.println("the server is waiteing to connect to cliate......");

      Socket s = ss.accept();
      System.out.println("the cliate connected succesfully");

      InputStream is = s.getInputStream();
      BufferedReader cliateReader = new BufferedReader(new InputStreamReader(is));

      BufferedReader keybordReader= new BufferedReader(new InputStreamReader(System.in));

      OutputStream os=s.getOutputStream();
      PrintStream cliateWriter =new PrintStream(os);

      String cliateMessage;
      String ServerMessage;

      while(true){
          cliateMessage=cliateReader.readLine();
          if(cliateMessage.equals("bye" )|| cliateMessage==null){
              System.out.println("coonnection is finfish");
              break;
          }
          System.out.println("cliate: "+cliateMessage);
          System.out.print("server: ");
          ServerMessage=keybordReader.readLine();
          cliateWriter.println(ServerMessage);


      }
      cliateReader.close();
      keybordReader.close();
      cliateWriter.close();
      s.close();
      ss.close();
    }
}
    
