package model.support.report;

import java.io.File;

public class CreateFolder {

    public static void criaPastaRelatorio(String caminho) {
        File caminhoRelatorio = new File(caminho);
        if (!caminhoRelatorio.exists()) {
            caminhoRelatorio.mkdir();
        }
    }

}
