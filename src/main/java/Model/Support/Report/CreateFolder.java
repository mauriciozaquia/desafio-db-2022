package Model.Support.Report;

import java.io.File;

public class CreateFolder {

    public static void criaPastaRelatorio(String caminho) {
        File caminhoRelatorio = new File(caminho);
        if (!caminhoRelatorio.exists()) {
            caminhoRelatorio.mkdir();
        }
    }

}
