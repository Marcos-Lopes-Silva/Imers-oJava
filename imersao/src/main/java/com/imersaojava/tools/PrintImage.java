package com.imersaojava.tools;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class PrintImage {

    private BufferedImage image;
    private Graphics2D g;

    public PrintImage(String url) {
        this.image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        this.g = (Graphics2D) image.getGraphics();
        this.g.setBackground(Color.WHITE);
        g.clearRect(0, 0, 15, 15);
        g.setColor(Color.BLACK);
        g.drawRect(2, 2, 15, 15);
        g.drawString("Poster", 20, 120);

    }

    public void print() throws IOException {

    }

}
