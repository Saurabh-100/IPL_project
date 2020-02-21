import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Ipl {
    public static void main(String args[])
    {
        String fileName="/home/saurabh/IdeaProjects/matches.csv";
        File file=new File(fileName);
        LinkedHashMap<String,String[]> map=new LinkedHashMap<>();
        String data=null;
        String array[];
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String key=null;

            br.readLine();
            while((data=br.readLine())!=null) {

                array = data.split(",");
                key=array[0];

                //System.out.println(key);
                /*if(map.containsKey(key))
                {
                    map.put(key,map.get(key)+1);
                }
                else
                {
                    map.put(key,1);
                }*/
                map.put(key,array);

            }
            key="2012";
            TreeMap<String,Integer>  noOFMatch=new TreeMap<>();
            //System.out.println(map.get(key));
          //  System.out.println("the no of matches per season are   :"+);
            for(Map.Entry<String,String[]> entry:map.entrySet())
            {
                String tempArray[]=entry.getValue();
                String matchKey=tempArray[1];
                if(noOFMatch.containsKey(matchKey))
                {
                    noOFMatch.put(matchKey,noOFMatch.get(matchKey)+1);
                }
                else
                {
                    noOFMatch.put(matchKey,1);
                }
            }
            System.out.println("the no of matches per season are   :" + noOFMatch);





        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
}
