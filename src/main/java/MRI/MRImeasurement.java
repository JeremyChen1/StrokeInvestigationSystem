package MRI;

import java.time.LocalDate;
public class MRImeasurement {
    protected LocalDate date;
    protected String url;
    protected int MFstrength;
    public MRImeasurement(LocalDate date, String url, int MFstrength){
        this.date = date;
        this.url = url;
        this.MFstrength = MFstrength;
    }
    public Image img(){

    }
    public abstract String getDisplayText();

}