package com.kosta.exam06;

import java.awt.*;

public class MyFrame extends Frame {
    LinePanel lp;
    public MyFrame(){
        lp = new LinePanel();
        add(lp);
        setSize(400,300);
        setVisible(true);
    }
}
