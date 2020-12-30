package com.cat.o.mat;

import java.awt.*;
import java.awt.image.BufferedImage;

public class AverageColor {

    private AverageColor() {
    }

    public static Color of(BufferedImage bufferedImage) {
        final int width = bufferedImage.getWidth();
        final int height = bufferedImage.getHeight();
        long sumr = 0, sumg = 0, sumb = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color pixel = new Color(bufferedImage.getRGB(x, y));
                sumr += pixel.getRed();
                sumg += pixel.getGreen();
                sumb += pixel.getBlue();
            }
        }
        int num = width * height;
        return new Color((int) sumr / num, (int) sumg / num, (int) sumb / num);
    }
}
