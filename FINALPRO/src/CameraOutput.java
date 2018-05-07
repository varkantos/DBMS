
import org.bytedeco.javacv.*;

import static org.bytedeco.javacpp.opencv_core.*;

public class CameraOutput {
    public static void main(String[] args) throws Exception {



        FrameGrabber grabber = FrameGrabber.createDefault(0);
        grabber.start();

        OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();

        IplImage grabbedImage = converter.convert(grabber.grab());

        CanvasFrame frame = new CanvasFrame("Some Title", CanvasFrame.getDefaultGamma()/grabber.getGamma());

        while (frame.isVisible() && (grabbedImage = converter.convert(grabber.grab())) != null) {

            Frame rotatedFrame = converter.convert(grabbedImage);
            frame.showImage(rotatedFrame);

        }
        frame.dispose();
        grabber.stop();
    }
}