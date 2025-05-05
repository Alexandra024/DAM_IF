package Ex_TM3_Prg_JAVA.src.Ficheros;

import java.io.FileReader;

public class Fichero {
    

    FileReader fr = new FileReader(null);

    String archieveruteString = 

    String[] = 

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
        bw.write("Example content");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
