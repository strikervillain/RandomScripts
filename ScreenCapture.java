import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenCapture {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		int count = 0;
		Robot robot = new Robot();
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);

		while (count < 20) {

			ImageIO.write(screenFullImage, "jpg", new File("file" + ++count + ".jpg"));
			Thread.sleep(2000);
		}
	}
}
