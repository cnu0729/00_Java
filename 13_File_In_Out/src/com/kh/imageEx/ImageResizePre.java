package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	//원본이미지 pigs.jpg pigs_cute.jpg 가로=400 세로=200
	public static void main(String[] args) {
		//원본이미지 경로
		String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
		String 사이즈조정이미지 = "src/com/kh/imageEx/pigs_cute.jpg";
		
		//새로 만들 이미지 가로 세로 크기 설정
		int 가로 = 400;
		int 세로 = 200;
		
		try {
			
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			BufferedImage 크기조정이미지 = new BufferedImage(가로, 세로, BufferedImage.TYPE_INT_RGB);
			
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로, 세로, Image.SCALE_SMOOTH);
			
			//모든 준비 완료 이미지 그리기 시작!                    x y  효과추가여부
			크기조정이미지.createGraphics().drawImage(이미지그리기,0, 0, null);
			
			ImageIO.write(크기조정이미지, "jpg", new File(사이즈조정이미지));
			
			System.out.println("이미지 크기 조정 성공~!~!~!");
			
		} catch (IOException e) {
			System.out.println("이미지 저장에 실패했습니다.");
			e.printStackTrace();
		}
	}
}
