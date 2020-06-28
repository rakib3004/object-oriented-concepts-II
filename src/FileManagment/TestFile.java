package src.FileManagment;

import javax.swing.*;
import java.io.*;

public class TestFile {
    private String FILENAME = "Circle.txt";
    public void writeToFile_BufferWriter(){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            String content = JOptionPane.showInputDialog("about IIT DU");
            fw = new FileWriter(FILENAME,true);
            bw =new BufferedWriter(fw);
            bw.write(content);
            System.out.println("Write Done !!!\n"+content);

            if(bw !=null){
                bw.close();
            }
            if(fw !=null){
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFromFile_BufferReader() throws IOException {
        BufferedReader br = null;
        FileReader fr =null;
        try{
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String sCurrentLine;
            while((sCurrentLine = br.readLine())!=null){
                System.out.println(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(br !=null){
            br.close();
        }
        if(fr !=null){
            fr.close();
        }
    }
}
