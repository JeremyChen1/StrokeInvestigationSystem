package Examination;

import java.net.URL;
import java.time.LocalDate;

public class BPmeasurement extends Examination {
    protected int syP;
    protected int diaP;
    protected String BPdur;

    public BPmeasurement(String testname, LocalDate date, int syP, int diaP, String BPdur) {
        super(date,testname);
        this.date = date;
        this.syP = syP;
        this.diaP = diaP;
        this.BPdur = BPdur;
    }
    public void BPdisplayText(){
        System.out.println("The "+testname+" date is on"+getDate(date)+", systolic measurement:"+syP
        +"mmHg, Diastolic measurement is "+ diaP+"mmHg, Duration is "+ BPdur);
    }

}