import java.io.*;
public class FaceRecognition {

    public static void main(String[] args) throws Exception {
        try {
            String target = new String("python /home/nishant/facecapture.py");
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(target);
            proc.waitFor();
            StringBuffer output = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = "";
            while ((line = reader.readLine())!= null) {
                output.append(line + "\n");
            }
            System.out.println(output);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        try {
            String target = "bash /home/nishant/facerecognition.sh";
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(target);
            proc.waitFor();
            StringBuffer output = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = "";
            while ((line = reader.readLine())!= null) {
                output.append(line + "\n");
            }
            System.out.println(output);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
