package com.io;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;

public class Ewm {

	public static void main(String[] args)throws Exception{
		Qrcode ewm=new Qrcode();
		ewm.setQrcodeVersion(7);
		int width=139;
		int height=139;
		BufferedImage hctx=new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		Graphics2D ewhb=hctx.createGraphics();
		ewhb.setBackground(Color.white);
		ewhb.setColor(Color.BLACK);
		ewhb.clearRect(0, 0, width, height);
		String zf="江汉艺术职业学院";
		byte[] zjsz=zf.getBytes();
		boolean[][] ewsz=ewm.calQrcode(zjsz);
		for (int i = 0; i < ewsz.length; i++) {
			for (int j=0; j< ewsz.length; j++) {
			if (ewsz[j][i]) {
				ewhb.fillRect(j*3+2, i*3+2, 3, 3);
			}
		}
		hctx.flush();
		
		ImageIO.write(hctx,"jpg", new File("ewm.jpg"));
	}
	}
}
