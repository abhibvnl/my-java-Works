package whatsAppJsp3;

import java.util.Scanner;

public class whatsApp {

	void textMsg(String user,String msg) {
		System.out.println("sending "+msg+" to "+ user);
	}
	void sendImg(String user) {
		System.out.println("sending img to "+ user);
	}
	void sendAudio(String user) {
		System.out.println("sending audio to "+ user);
	}
	void sendVideo(String user) {
		System.out.println("sending video to "+ user);
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		whatsApp w=new whatsApp();
		
		System.out.println("enter ur Option\n1:To Send Text msg\n2:To send Img\n3:To send audio\n4:To send video");
		int option=scan.nextInt();
		System.out.println("To whom U r sending");
		String user=scan.next();
		
		switch(option) {
		case 1:
			System.out.println("Enter ur message");
			String msg=scan.next();
			w.textMsg(user,msg);
			break;
		case 2:
			w.sendImg(user);
			break;
		case 3:
			w.sendAudio(user);
			break;
		case 4:
			w.sendVideo(user);
			break;
			default:System.out.println("invalid option");
		}
	}
}
