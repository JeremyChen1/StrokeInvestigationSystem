package Examination;

import Examination.MRImeasurement;

import java.time.LocalDate;

public class Scandate extends MRImeasurement {
    public LocalDate ld;
    public Scandate(LocalDate date,ld){
        super();
        this.ld = ld
    }
    public String getDisplayText(){
        return "MRI scan date on "+ld.toString()+" with administrator at "+location+"<br>";
    }
}