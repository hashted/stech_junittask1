package com.mycompany.stech_junittask1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hashted
 */
public class Data {
    public static final String FILE_NAME = "C:\\data.txt";
    
    public static List getDataFromFile(String Operator) {
        
        List<Object[]> Data = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader (new FileReader(FILE_NAME)))
        {
            String line;
            int i = 0;         
            
            while((line = br.readLine())!=null){
                if(checkPattern(line,"[0-9-]+;[0-9-]+;[+*-/];[0-9.-]+")) {  
                    String[] strTempArray = line.split(";");           
                    if(strTempArray[2].equals(Operator)) {
                        Data.add(strTempArray);
                    }
                    i++;
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return Data;
    }
   
    public static boolean checkPattern(String line, String patt) {
        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
    
    public static void main (String[] args) {
        
    }
}
