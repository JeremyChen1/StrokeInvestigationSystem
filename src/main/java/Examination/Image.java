package Examination;

import javax.swing.*;
import java.net.URL;

public class Image{
    protected URL url;
    public Image(URL url){
        this.url = url;
        JLabel label = new JLabel();
        URL url= null;
        try {
            url = new URL(https://martinh.netfirms.com/b3ta/kennyg.jpg);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(url);
        label.setIcon(thisImageIcon);
    }
}