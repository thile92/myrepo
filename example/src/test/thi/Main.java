package test.thi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Created by ThiLH on 4/18/2017.
 */
public class Main {

    public static void main(String[] args) {
        char a = 'a';
        char num = (char) -4;
        System.out.println(a + " " + (int) a + " " + (a + 1));
        System.out.println((int) num);

        byte[] bytes;
        double d;

        System.out.println("---------------");
        bytes = new byte[]{(byte) 0x12, (byte) 0xA5, (byte) 0xBD, (byte) 0xC1, (byte) 0xEF, (byte) 0xCB, (byte) 0xC4, (byte) 0x40};
        d = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getDouble();
        System.out.println(d);
        System.out.println(convertGPRMC2Degrees(d));

        System.out.println("---------------");
        bytes = new byte[]{(byte) 0xB9, (byte) 0xFC, (byte) 0x87, (byte) 0xF4, (byte) 0x5B, (byte) 0x6C, (byte) 0x90, (byte) 0x40};
        d = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getDouble();
        System.out.println(d);
        System.out.println(convertGPRMC2Degrees(d));
    }

    public static double convertGPRMC2Degrees(double value) {
        try {
            double result = ((int) (value / 100)) +
                    ((value - ((int) (value / 100)) * 100) / 60);
            return result;
        } catch (Exception e) {
            return value;
        }
    }

}
