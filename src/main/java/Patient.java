import Examination.Examination;
import Java.time.LocalDate;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.awt.*;

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
    }



