import com.ridgesoft.intellibrain.IntelliBrain;
import com.ridgesoft.robotics.Servo;

public class ManeuverWithServo {

	public static void main(String[] args) {
		System.out.println("Maneuver I");

		// Create two servo object to represent the servomotors of the robot.
		Servo leftServo = IntelliBrain.getServo(1);
		Servo rightServo = IntelliBrain.getServo(2);

		// Control servos to move robot forward at maximum speed.
		// leftServo.setPosition(100);
		// rightServo.setPosition(0);

		// Control servos to rotate the robot to the right.
		//leftServo.setPosition(100);
		//rightServo.setPosition(100);

		// Control servos to move the robot in a curve.
		leftServo.setPosition(55);
		rightServo.setPosition(0);

		// Wait 5 seconds while robot moves.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		// Turn-off servos to stop the robot
		leftServo.off();
		rightServo.off();
	}
}
