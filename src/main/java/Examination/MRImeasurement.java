package Examination;

import java.net.URL;
import java.time.LocalDate;

public class MRImeasurement extends Examination {
    protected URL MRIurl;
    protected int MFstrength;

    public MRImeasurement(String testname, LocalDate date, URL MRIurl, int MFstrength) {
        super(date,testname);
        this.date = date;
        this.MRIurl = MRIurl;
        this.MFstrength = MFstrength;
    }
    public void MRIdisplayText(){
        System.out.println("The "+testname+" date is on"+getDate(date)+"with Magnetic field strength:" + MFstrength);
    }
    public void MRIimg(URL MRIurl){
        Image MRI = new Image(URL MRIurl);
    }

}