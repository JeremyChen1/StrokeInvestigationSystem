import Examination.Examination;
import Java.time.LocalDate;

import java.awt.*;
import java.net.URL;
public class Patient {
    private String name;
    private Image image;
    private int age;
    private Examination exam;
    public Patient(String name, Image image, int age, Examination exam){
        this.name = name;
        this.image = image;
        this.age = age;
        this.exam =exam;
        Frame f=new Frame();
        f.setLayout(null);
        f.setSize(400, 200);
        f.setVisible(true);
    }
    exam.BPmeasurement BP1 = new Examination.BPmeasurement((2023,09,15), 130,70,'ST' )
    Image img1 = new Image(
            'https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg');
    Image img2 = new Image(
            'https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg');
    Patient pat1 = new Patient(
            'Dapne Von Oram', img1, 62, exam.MRImeasurement, exam.BPmeasurement);
    Patient pat2 = new Patient(
            'Sebastian Compton', img2, 31, exam.MRImeasurement, exam.BPmeasurement);
}
