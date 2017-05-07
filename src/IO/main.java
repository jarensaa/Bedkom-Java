package IO;

/**
 *  Main metoden er ferdig implementert.
 *  Skriv ferdig alle klassene slik at programmet funker.
 *
 *  Husk å lukke alle I/O objekter!
 */
public class main {
    public static void main(String[] args) {
        OutputStreamTask.print("OutputStreamWroteThis");
        InputStreamTask.read();
        WriterTask.write("Writer wrote this");
        ReaderTask.read();
    }
}
