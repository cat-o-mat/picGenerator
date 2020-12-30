package com.cat.o.mat;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class ColorImageMatcher {

    private ColorImageMatcher() {
    }

    public static HashMap<BufferedImage, Color> getAverageColorFor(File folder) throws IOException {
        HashMap<BufferedImage, Color> imgColorMap = new HashMap<>();
        for (File inputFile : Objects.requireNonNull(folder.listFiles())) {
            BufferedImage read = ImageIO.read(inputFile);
            imgColorMap.put(read, AverageColor.of(read));
        }
        return imgColorMap;
    }

}
