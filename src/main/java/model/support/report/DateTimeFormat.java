package model.support.report;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormat {

    public static String pegaDataNoFormatoDoRelatorio(){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        Date agora = new Date();
        return formatoData.format(agora);
    }

    public static String pegaDataNoFormatoDaCapturaDeTela(){
        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd-MMM-yyyy_hh'h'mm'm's's'");
        LocalDateTime dataLocal = LocalDateTime.now();
        return formatadorDeData.format(dataLocal);
    }

}
