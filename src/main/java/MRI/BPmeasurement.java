package MRI;

import java.time.LocalDate;

public class BPmeasurement {
    protected LocalDate date;
    protected int syP;
    protected int diaP;
    protected String term;
    public BPmeasurement(LocalDate date, int syP, int diaP, String term){
        this.date = date;
        this.syP = syP;
        this.diaP = diaP;
        this.term = term;
}
    public abstract String getDisplayText();

}