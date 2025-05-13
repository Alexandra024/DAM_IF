package Ex_TM3_Prg_JAVA.src.EjClaseFile;

import java.io.*;

public class Fichero {

    public static void main(String[] args) {
        String archieveruteString = "output.txt";
        String[] content = {"Line 1", "Line 2", "Line 3"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archieveruteString))) {
            for (String line : content) {
                bw.write(line);
                bw.newLine();
            }
            bw.write("Example content");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
