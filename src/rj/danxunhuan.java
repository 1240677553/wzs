package rj;

public class danxunhuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] yb= {"管理学院","设计学院","音乐学院","演艺学院","教育学院","中专部","饮食文化","轮空"};
		System.out.println("第十三届江汉艺术职业学院篮球赛对阵表");
		//外循环对应轮次
		for(int i=1;i<yb.length;i++) {
			System.out.println("第"+i+"轮");
		if(i>1) {
			int k=yb.length-1;
			String stemp=yb[k];
			
			for(;k>1;k--)
				yb[k]=yb[k-1];
					
				yb[1]=stemp;
		}
			//内循环对阵
			for(int j=0;j<yb.length/2;j++) {
				System.out.println(yb[j]+"vs"+yb[yb.length-j-1]);
			}
		}
	}

}
