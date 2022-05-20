package Model.Support.Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;

public class Report {
    private static final ExtentReports extent = ReportGenerator.pegaInstancia();
    private static final ThreadLocal<ExtentTest> parentTest = new ThreadLocal<>();
    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static void criaTeste(String nomeTeste, ReportType tipo) {
        if (tipo.equals(ReportType.SINGLE)) {
            ExtentTest extentTest = extent.createTest(nomeTeste);
            test.set(extentTest);
            return;
        }
        ExtentTest extentTest = extent.createTest(nomeTeste);
        parentTest.set(extentTest);
    }

    public static void criaPasso(String nomePasso) {
        try {
            ExtentTest child = parentTest.get().createNode(nomePasso);
            test.set(child);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void log(Status status, String mensagem) {
        if (existeInstancia()) {
            return;
        }
        test.get().log(status, mensagem);
    }

    public static void log(Status status, String mensagem, MediaEntityModelProvider captura) {
        if (existeInstancia()) {
            return;
        }
        test.get().log(status, mensagem, captura);
    }

    public static boolean existeInstancia() {
        if (test.get() == null) {
            return true;
        }
        return false;
    }

    public static void fecha() {
        if (existeInstancia()) {
            return;
        }
        extent.flush();
    }
}
