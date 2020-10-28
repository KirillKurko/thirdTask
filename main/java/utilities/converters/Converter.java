package utilities.converters;

import model.beans.Login;
import model.beans.Posting;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Converter {

    public static Login convertToLogin(String[] data) {
        Login login = new Login();
        login.setApplication(data[0].trim());
        login.setAppAccountName(data[1].trim());
        login.setActive(Converter.parseStringToBoolean(data[2].trim()));
        login.setJobTitle(data[3].trim());
        login.setDepartment(data[4].trim());
        return login;
    }

    public static Posting convertToPosting(String[] data) {
        Posting posting = new Posting();
        posting.setMatDoc(data[0].trim());
        posting.setItem(Integer.parseInt(data[1].trim()));
        posting.setDocDate(Converter.parseDate(data[2].trim()));
        posting.setPstngDate(Converter.parseDate(data[3].trim()));
        posting.setMaterialDescription(data[4].trim());
        posting.setQuantity(Integer.parseInt(data[5].trim()));
        posting.setBun(data[6].trim());
        posting.setAmountLC(Double.parseDouble(data[7].trim().replace(',', '.')));
        posting.setCrcy(data[8].trim());
        posting.setUserName(data[9].trim());
        return posting;
    }

    public static boolean parseStringToBoolean(String value) {
        return value.toLowerCase().equals("true");
    }

    public static Calendar parseDate(String data) {
        String[] dataParts = data.split("\\.");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataParts[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(dataParts[1]));
        calendar.set(Calendar.YEAR, Integer.parseInt(dataParts[2]));
        return calendar;
    }
}
