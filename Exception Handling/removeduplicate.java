import java.io.*;
  
public class removeduplicate
{
    public static void main(String[] args) throws IOException 
    {
        // PrintWriter object for removedduplicates.txt
        PrintWriter pw = new PrintWriter("removedduplicates.txt");
          
        // BufferedReader object for input.txt
        BufferedReader br1 = new BufferedReader(new FileReader("reading.txt"));
          
        String line1 = br1.readLine();
          
        // loop for each line of input.txt
        while(line1 != null)
        {
            boolean flag = false;
              
            // BufferedReader object for removedduplicates.txt
            BufferedReader br2 = new BufferedReader(new FileReader("removedduplicates.txt"));
              
            String line2 = br2.readLine();
              
            // loop for each line of removedduplicates.txt
            while(line2 != null)
            {
                  
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }
                  
                line2 = br2.readLine();
              
            }
              
            // if flag = false
            // write line of input.txt to removedduplicates.txt
            if(!flag){
                pw.println(line1);
                  
                // flushing is important here
                pw.flush();
            }
              
            line1 = br1.readLine();
              
        }
          
        // closing resources
        br1.close();
        pw.close();
          
        System.out.println("File operation performed successfully");
    }
}