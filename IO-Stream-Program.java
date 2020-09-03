//Basic Stream IO Program...

package streambasediosystem;

import java.io.*;

public class IOProgramTest {
    public static void main(String[] args) {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                System.out.println("Enter IntegerType Value");
                int i = Integer.parseInt(b.readLine());
                bytewrite(i);
                charwrite(i);
                break;
            }catch (Exception e){
                System.out.println("Invalid Input....");
            }
        }
    }

    private static void charwrite(int i) throws  Exception{
        FileOutputStream fos;
        OutputStreamWriter osw;
        fos=new FileOutputStream("CharU.txt");
        osw=new OutputStreamWriter(fos, "UTF-16");

        osw.write(((Integer)i).toString());
        osw.close();
        System.out.println(new File("CharU.txt").length());
    }

    private static void bytewrite(int i)throws IOException {
        FileOutputStream fos;
        DataOutputStream dos;
        fos=new FileOutputStream("Simple.txt");
        dos=new DataOutputStream(fos);

        dos.write(i);
        dos.close();
        System.out.println(new File("Sample.txt").length());
    }
}
