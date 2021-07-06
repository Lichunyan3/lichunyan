
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 * 实时将test.txt 中新添加的数字打印到控制台
 */
public class B extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String filePath = "src\\test.txt";
            FileInputStream fileInputStream = null;
            int readLen = 0;
            byte[] buf = new byte[3];
            try {
                fileInputStream = new FileInputStream(filePath);
                while ((readLen = fileInputStream.read(buf))!=-1){
                    System.out.print(new String(buf,0,readLen));
                }
//                int read = fileInputStream.read(buf);
//                System.out.println(new String(buf,0,read));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



}
