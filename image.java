import java.io.*;

public class image {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File("image.ppm"));
        printWriter.println("P3");
        printWriter.println("600 600");
        printWriter.println("255");
        for (int i = 0; i < 600; i++) {
            int[] rgb = new int[3];
            for (int j = 0; j < 600; j++) {
                rgb[0] = (2 * i) % 256;
                rgb[1] = (2 * j) % 256;
                rgb[2] = ((int) Math.sqrt(i * j)) % 256;
                printWriter.printf("%d %d %d ", rgb[0], rgb[1], rgb[2]);
            }
            printWriter.println();
        }
        printWriter.close();
    }
}
