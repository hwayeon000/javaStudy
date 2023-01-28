import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ascii {

	public static void main(String[] args) throws IOException {

		
		BufferedImage im = ImageIO.read(new File("C:\\Users\\PHY\\html\\studyHtml\\image\\food.png"));
		
		int size = 4;
		
		double[][] map = new double[im.getHeight() / size - 1][im.getWidth() / size - 1];
		
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				int k = 0;
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						Color c = new Color( im.getRGB(x * size + j, y * size + i) );
						map[y][x] += c.getRed() / 3.0;
						map[y][x] += c.getGreen() / 3.0;
						map[y][x] += c.getBlue() / 3.0;
						
						k++;
					}
				}
				map[y][k] /= k;
			}
		}
		
		String[][] convert = new String[map.length][map[0].length];
		
		for (int i = 0; i < convert.length; i++) {
			for (int j = 0; j < convert[i].length; j++) {
				convert[i][j] = getString(map[i][j]);
			}
		}
		
		FileWriter fw = new FileWriter(new File("C:\\Users\\PHY\\html\\studyHtml\\image\\food.png"));
		
		for (String[] chars : convert) {
			for (String chr : chars) {
				fw.write(chr);
			}
			fw.write("\r\n");
		}
		fw.close();
	}
	
	public static int getT(String ch) {
		Canvas c = new Canvas() {
			public void paint(Graphics g) {
				g.setColor(Color.black);
				g.drawString(ch, 16, 16);
			}
		};
		
		BufferedImage newIm = new BufferedImage(32, 32, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics g = newIm.getGraphics();
		c.paint(g);
		
		int output = 0;
		for (int y = 0; y < 32; y++) {
			for (int x = 0; x < 32; x++) {
				if (newIm.getRGB(x, y) < 0) {
					output++;
				}
			}
		}
		
		return output;
	}
	
	public static void stringGetter() {
		System.out.println("Start\n");
		
		String[] chars = new String[1024];
		
		for (int i = '가'; i <= '힣'; i++) {
			int k = getT(String.valueOf( (char)i ) );
			chars[k] = String.valueOf( (char)i );
		}
		
		for (int i = 32; i <= 'z' + 4; i++) {
			int k = getT(String.valueOf( (char)i + "" + (char)i ));
			chars[k] = String.valueOf( (char)i + "" + (char)i );
		}
		
		for (int i = 0; i <= 67; i++) {
			String k;
			
			if (chars[i] != null) {
				k = chars[i];
			} else {
				chars[i] = chars[i - 1];
				k = chars[i];
			}
			
//			System.out.print("\"" + k + "\",");
			
		}
	}
	
	static String[] strings = {"  ","  ","..","..","``","``","--","--",";;",";;",";;",";;","~~","~~","__","__","ii","ii","rr","rr","jj","스","}}","수","vv","슈","xx","즈","yy","주","zz","UU","uu","추","kk","mm","hh","HH","KK","ww","qq","NN","99","DD","SS","힑","gg","힗","RR","힓","$$","흏","힖","힅","흷","MM","BB","흺","휊","흂","퓶","풾","@@","쀒","뽧","뾢","뾾","뽪"};
	
	public static String getString(double d) {
		int k = (int) (67 - (67 / 255.0) * d / 300);
		return strings[k];
	}
}
