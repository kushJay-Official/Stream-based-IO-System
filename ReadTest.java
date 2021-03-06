//# A program for file reading...

package streambasediosystem;

import java.io.*;

public class ReadTest {
    public static void main(String[] args) {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter Path of file.....");
            String s = b.readLine();
            readfile(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readfile(String s) throws Exception{
        File f;
        BufferedReader br=null;
        f=new File(s);
        try {
            br=new BufferedReader(new FileReader(f));
            String ln;
            while ((ln=br.readLine())!=null)
                System.out.println(ln);
        }
        catch (FileNotFoundException e){
            System.out.println("Can't Open File....."+f.getName());
        }
        finally {
            if(br!=null)
                br.close();
        }
    }
}
