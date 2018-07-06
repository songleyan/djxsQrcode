package com.djxs.qrcode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;
public class CreateQRCode_1 {
	public static void main(String[] args) throws IOException {
		int ver =35;
		
		int logosize=30;
		
		int  imageSize = 67+12*(ver-1);
		Qrcode qrcdoe = new Qrcode();
		qrcdoe.setQrcodeVersion(ver);

         

		BufferedImage bufferedImage = new BufferedImage(imageSize, imageSize, BufferedImage.TYPE_INT_RGB);
		
		Graphics2D gs = bufferedImage.createGraphics();

		gs.setBackground(Color.WHITE);
	
		gs.setColor(Color.BLACK);
	
		gs.clearRect(0, 0, imageSize, imageSize);

		qrcdoe.setQrcodeErrorCorrect('L');
		
		qrcdoe.setQrcodeEncodeMode('B');
		String base64="iVBORw0KGgoAAAANSUhEUgAAAAsAAAAPCAMAAAAF48UCAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAAB8lBMVEU7Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087Q087RE87RE86Q045Qk47RE87Q087Q087Q087Q087Q086Q044QUw6Q046Q047Q087Q088RFA5QU1MVF98golzeYFDS1Y6Qk48RFAwOEVASFOPlJuHjJNAR1MwOEUEDRxZYGq2ur60uL1XX2kCCxoAAABJUVykqK6hpqtIUFsAAAA2Pko3P0tmbXZjanM3P0s4QEw7Q086Qk5ASFQ/R1M6Qk47Q087Q086Qk45QU45QU46Qk47Q083P0xKUVyeoqidoadKUVw3P0w5Qk6+wcX////////Z293DxcnZ2t3///////++wcU1PkqEiZHg4eP39/j29vfz8/TR09bv8PH29vf39/jg4eOEiZBxd3+nq7C0t7y0t7uztrqdoaextLm0t7u0t7ynqrBvdX45Qk1FTVhWXmiAho3MztHZ2tze3+He3+H////k5efZ2tzt7e7s7O3////r7O3s7O38/Pv//v7q6+z29vb8+/ry8vPv7/Dp6uvt7e/w8PGusbbw8fHe3+Hv8PGrrrNMVF+jpqzf4eOgpKpMU17CxMi4u7/o6eq3ur/CxMgAAABicwdOAAAAfHRSTlMAAAIvW15YLQEAAAADb+P6+vniawIAAD7v///////uOwAAiv////+IAAay/////7AFC77//70KCLf//7YHAqT//6IBAJz//5kAA6z//6oDPOP//+E6S+z//+tJEMP/////////wA4m3v37+/v7+/3bIxNbZGRkZGRkZFoSFJmAvgAAAAFiS0dEpS65Si8AAAAJcEhZcwAAJxAAACcQAZRpURkAAAAHdElNRQfiBhIQGR/oJn0AAAAAv0lEQVQI1wG0AEv/AAABAgMEBQYHCAkKAAsMDQ4PEBESExQVABYXGBkaGxwdHh8gACEiIyR8fX4lJicoACkqKyx/gIEtLi8wADEyM4KDhIWGNDU2ADc4OYeIiYqLOjs8AD0+P4yNjo+QQEFCAENERZGSk5SVRkdIAElKS5aXmJmaTE1OAE9QUZucnZ6fUlNUAFVWV6ChoqOkWFlaAFtcXV5fYGFiY2RlAGZnaGlqa2xtbm9wAHFyc3R1dnd4eXp7SXg02/x/an8AAAAldEVYdGRhdGU6Y3JlYXRlADIwMTgtMDYtMjhUMjI6MjM6NTMrMDg6MDB3HDJmAAAAJXRFWHRkYXRlOm1vZGlmeQAyMDE4LTA2LTE4VDE2OjI1OjMxKzA4OjAwte32+gAAAEN0RVh0c29mdHdhcmUAL3Vzci9sb2NhbC9pbWFnZW1hZ2ljay9zaGFyZS9kb2MvSW1hZ2VNYWdpY2stNy8vaW5kZXguaHRtbL21eQoAAAAYdEVYdFRodW1iOjpEb2N1bWVudDo6UGFnZXMAMaf/uy8AAAAYdEVYdFRodW1iOjpJbWFnZTo6SGVpZ2h0ADUzM8q8AZUAAAAXdEVYdFRodW1iOjpJbWFnZTo6V2lkdGgAMzk0OUtQUwAAABl0RVh0VGh1bWI6Ok1pbWV0eXBlAGltYWdlL3BuZz+yVk4AAAAXdEVYdFRodW1iOjpNVGltZQAxNTI5MzEwMzMxCaeHGgAAABJ0RVh0VGh1bWI6OlNpemUAMzE4NThCty06jgAAAGJ0RVh0VGh1bWI6OlVSSQBmaWxlOi8vL2hvbWUvd3d3cm9vdC9uZXdzaXRlL3d3dy5lYXN5aWNvbi5uZXQvY2RuLWltZy5lYXN5aWNvbi5jbi9zcmMvMTIxMjQvMTIxMjQ3NS5wbmcmPfgJAAAAAElFTkSuQmCC";
					String str = "BEGIN:VCARD\n" + 
		  "PHOTO;ENCODING=b:"+base64+"\n" + 
		  "N:宋\n"+
		  "FN:乐炎\n" + 
		  "ORG:河北科技师范学院\n" + 
		  "TITLE:java学生\n" + 
		  "ADR;WORK:秦皇岛河北科技师范学院\n" +  
		  "TEL;CELL,VOICE:15033527605\n" + 
		  "TEL;WORK,VOICE:15031820695\r\n" + 
		  "URL;WORK;:http://www.hevttc.edu.cn\n" + 
		  "EMAIL;INTERNET,HOME:986983850@qq.com\n" + 
		  "END:VCARD";
		
		
		
		
	

		int startR = 251;
		int startG = 0;
		int startB = 16;
		
		int endR = 20;
		int endG = 161;
		int endB = 210;
		
		boolean[][] calQrcode = qrcdoe.calQrcode(str.getBytes("UTF-8"));
		System.out.println(calQrcode.length);
		int x = 2;
		for (int i = 0; i < calQrcode.length; i++) {
			for (int j = 0; j < calQrcode.length; j++) {
				if(calQrcode[i][j]){
					int num1 = startR + (endR - startR) * (i+1)/calQrcode.length;
					int num2 = startG + (endG - startG) * (i+1)/calQrcode.length;
					int num3 = startB + (endB - startB) * (i+1)/calQrcode.length;
					
					Color color = new Color(num1, num2, num3);
					
					gs.setColor(color);
					gs.fillRect(i*3+x, j*3+x, 3, 3);
				}
			}
		}
		Image logo=ImageIO.read(new File("d:/11.png"));
		int logox=(imageSize-logosize)/2;
		gs.drawImage(logo, logox,logox, 20, 20, null);

		gs.dispose();
		bufferedImage.flush();
		ImageIO.write(bufferedImage, "png", new File("d:/qrcode_1.png"));
	}
}
