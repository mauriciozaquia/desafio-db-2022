package Support.Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class GeradorRelatorio {

    public static WebDriver driver;
    public static final String CAMINHO_RELATORIO = System.getProperty("user.dir") + File.separator + "Relatorio" + File.separator + "Relatorio " + DataTempo.pegaDataNoFormatoDoRelatorio();
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentReports;

    public synchronized static ExtentReports pegaInstancia() {
        if (extentReports == null) {
            configReportExtent();
        }
        return extentReports;
    }

    public static void configReportExtent() {
        CriarPasta.criaPastaRelatorio(CAMINHO_RELATORIO);
        htmlReporter = new ExtentHtmlReporter(CAMINHO_RELATORIO + File.separator + "MeuRelatorio_" + DataTempo.pegaDataNoFormatoDoRelatorio() + ".html");
        htmlReporter.config().setDocumentTitle("Relatorio de Execucao da Automacao");
        htmlReporter.config().setReportName("Relatório de Execução dos Testes");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setEncoding("UTF-8");
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        htmlReporter.config().setCSS(".nav-wrapper {​​ background-color: #1E317A !important; }​​ .brand-logo {​​ background-color: #1E317A !important; padding: 0 10px 0 0 !important; margin: 0 !important; position: absolute !important }​​ .report-name {​​ margin-left: 80px !important }​​ .blue.darken-3 {​​ background-color: #1E317A !important; color: #FFF !important;}​​");
        htmlReporter.config().setJS("$('.brand-logo').html('<img src=\"https://i.imgur.com/qDYwkD2.png\" class=\"db-logo\"/>');");

        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);

    }
}
