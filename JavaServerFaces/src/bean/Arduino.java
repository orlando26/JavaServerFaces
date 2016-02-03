package bean;
import com.panamahitek.PanamaHitek_Arduino;

public class Arduino {
	PanamaHitek_Arduino arduino;
	public Arduino(){
		arduino = new PanamaHitek_Arduino();
	}
	
	public void conectarArduino(){
		try {
			arduino.ArduinoTX("COM3", 2000, 9600);
			System.out.println("Conectar arduino");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void on(){
		System.out.println("encender");
		try {
			arduino.sendData("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void off(){
		System.out.println("apagar");
		try {
			arduino.sendData("0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
