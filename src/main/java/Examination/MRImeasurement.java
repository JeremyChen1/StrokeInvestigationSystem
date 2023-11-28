package Examination;

import javax.swing.*;
import java.net.URL;
import java.time.LocalDate;
public class MRImeasurement extends Examination{
    protected URL MRIurl;
    protected int MFstrength;
    public MRImeasurement(LocalDate date, URL MRIurl, int MFstrength){
        super(date);
        this. MRIurl = MRIurl;
        this. MFstrength = MFstrength;
    }
    public void image(URL MRIurl){
        JLabel label = new JLabel();
        URL MRIurl=null;
        try {
            MRIurl = new URL("https://martinh.netfirms.com/b3ta/kennyg.jpg");
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);
    }
    public abstract String getDisplayText();

}