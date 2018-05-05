
import org.bytedeco.javacv.*;

import static org.bytedeco.javacpp.opencv_core.*;




public class FaceRecognition {
    public static void main(String[] args) throws Exception {

        FrameGrabber grabber = FrameGrabber.createDefault(0);
        grabber.start();

        OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();

        IplImage grabbedImage = converter.convert(grabber.grab());
        int width  = grabbedImage.width();
        int height = grabbedImage.height();


        CvMemStorage storage = CvMemStorage.create();

        CanvasFrame frame    = new CanvasFrame("Some Title", CanvasFrame.getDefaultGamma()/grabber.getGamma());


        while (frame.isVisible() && (grabbedImage = converter.convert(grabber.grab())) != null) {
            cvClearMemStorage(storage);

            Frame frame1 = converter.convert(grabbedImage);
            frame.showImage(frame1);


        }
        frame.dispose();
        grabber.stop();
    }
}