package MRI;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class Image{
    private URL url;
    public Image(URL url){
        this.url = url;
    }
    public java.awt.Image getURL(){
        JLabel label = new JLabel();
        URL imageURL=null;
        try {
            imageURL = new URL("https://martinh.netfirms.com/b3ta/kennyg.jpg");
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);
    }
}
