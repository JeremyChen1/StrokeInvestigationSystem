package Examination;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;

public abstract class Examination {
    protected LocalDate date;
    public Examination(LocalDate date){
        this.date = date;
    }
    public void saveDate(LocalDate date){
        LocalDate ld = LocalDate. of(date);
        
    }
    public abstract displayText(){}
}
