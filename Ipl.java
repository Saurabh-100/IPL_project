import java.util.Scanner;
import java.io.*;
public class Ipl {
    public static void main(String args[])
    {
        String fileName="/home/saurabh/IdeaProjects/matches.csv";
        File file=new File(fileName);
        String data=null;
        String array[];
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));


            while((data=br.readLine())!=null) {

                array = data.split(",");
                System.out.println(array[2]);
            }

        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
}
