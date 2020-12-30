package com.cat.o.mat;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageCreator {

    private ImageCreator() {
    }

    public static void writeToPosition(BufferedImage backgroundImage, BufferedImage toApply, int startX, int startY) throws IOException {
        Graphics graphics = backgroundImage.getGraphics();
        backgroundImage.getGraphics().drawImage(toApply, startX, startY, null);
        // release system resources
        graphics.dispose();

        File file = new File("out.png");
        ImageIO.write(backgroundImage, "png", file);
    }
}
