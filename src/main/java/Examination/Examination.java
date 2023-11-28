package Examination;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;

public class Examination {
    protected  String testname;
    protected LocalDate date;
    public Examination(LocalDate date, String testname){
        this.testname = testname;
        this.date = date;
    }
    public String getDate(date){
        LocalDate ld = LocalDate. of(date);
        String s = ld.toString();
        return s;
    }
}
}
