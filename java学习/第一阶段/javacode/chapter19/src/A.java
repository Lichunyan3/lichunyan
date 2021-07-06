
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 * 每隔两秒向文件test.txt 中追加1个随机数
 */
public class A extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String filePath = "src\\test.txt";
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(filePath,true);
                fileWriter.write((int)(Math.random()*100+1)+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
