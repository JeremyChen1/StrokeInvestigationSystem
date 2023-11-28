package Examination;

import java.time.LocalDate;

public class BPmeasurement extends Examination {
    protected int syP;
    protected int diaP;
    protected String BPdur;

    public BPmeasurement(LocalDate date, int syP, int diaP, String BPdur){
        super(date);
        this. syP = syP;
        this. diaP =diaP;
        this. BPdur =BPdur;}
    public

    public abstract String getDisplayText();

}