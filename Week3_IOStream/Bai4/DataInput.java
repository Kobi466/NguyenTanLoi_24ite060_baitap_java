package Week3_IOStream.Bai4;import java.awt.image.DataBufferInt;import java.io.*;public class DataInput {    public static void main(String[] args) {        int[] number = {1, 2, 3, 4, 5};        try{            File writeFile = new File("C:\\Users\\ADMIN\\Documents\\TepText\\filewritebai4.txt");            DataOutputStream writeTxt = new DataOutputStream(new FileOutputStream(writeFile));            writeTxt.writeInt(number.length);            for (int i = 0; i < number.length; i++) {                writeTxt.writeInt(number[i]);            }            DataInputStream readTxt = new DataInputStream(new FileInputStream(writeFile));            for (int i = 0; i < number.length; i++) {                System.out.println(readTxt.readInt());            }        } catch (RuntimeException e) {            throw new RuntimeException(e);        } catch (FileNotFoundException e) {            throw new RuntimeException(e);        } catch (IOException e) {            throw new RuntimeException(e);        }    }}