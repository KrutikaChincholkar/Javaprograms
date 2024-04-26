import java.io.*;
class Test{
  public static void main(String args[]) throws IOException{
    FileInputStream fp = null;
    try{
      fp = new FileInputStream("PATH_OF_FILE");
      int c =0;
      while ( c != -1){
        c = fp.read();
        if(c ==-1)
          break;
        System.out.print((char)c);
      }
    }
    catch(IOException e){
      System.out.println("Error occured while reading file...");
  }
    finally{
      if(fp!=null)
        fp.close();
        }
  }
}
