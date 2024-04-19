package anna.colortrianglesjavafx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColorRecktangle {

    double length, width;
    String color;

    public ColorRecktangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorRecktangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public static List<ColorRecktangle> readFile(String filename) throws FileNotFoundException {
        List<ColorRecktangle> colorRecktangles = new ArrayList<>();

        Scanner scan = new Scanner(new File(filename));

        while (scan.hasNext()) {
            double length = scan.nextDouble();
            double width = scan.nextDouble();
            String color = scan.next();
            colorRecktangles.add(new ColorRecktangle(length, width, color));
        }
        scan.close();
        System.out.println(colorRecktangles);
        return colorRecktangles;
    }

}
