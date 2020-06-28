package src.OOP_File_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Test_File {
	private String FILENAME = "file1.txt";
	public void  writeToFile_BufferWriter(String FILENAME) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			String content = JOptionPane.showInputDialog("about IIT DU");

			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Write Done" + content);
                        
                        if (bw != null)				bw.close();
			if (fw != null)				fw.close();

		} catch (IOException e) {
			System.out.println("Problem in File Write" + e.getMessage());
		} finally {

		}
	}
	
    public ArrayList<String> readFromFile_BufferReader(String FILENAME) {

        BufferedReader br = null;
        FileReader fr = null;
        ArrayList<String> information_list = new ArrayList<>();

        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                information_list.add(sCurrentLine);
            }
            if (br != null)		br.close();
            if (fr != null)		fr.close();

        } catch (IOException e) {
                System.out.println("Problem File Read" + e.getMessage());
        }        
        return information_list;
    }

}
