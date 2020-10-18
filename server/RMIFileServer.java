import java.io.*;
import java.rmi.*;

 public class RMIFileServer
  {
     public static void main(String args[])
        {
          
         System.setSecurityManager(new RMISecurityManager());

             try
              {
               FileRemote f = new FileRemoteImpl("FServer");
              System.out.println(" created..");
 
               Naming.rebind("FServer",f);
              System.out.println("object is created..");
              }
  catch(Exception e)
      {
System.out.println(e);
           }
  }
 }