package lianxi.part01;

import java.util.Scanner;

public class Lianxi0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����������������������Լ��
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("����������");
		int result=0;
		int first=scanner.nextInt();
		int last=scanner.nextInt();
		for(int m=2;m<first&&m<last;m++){
			if(first%m==0&&last%m==0){
				result=m;
			}
		}
		System.out.println(result);
		*/
		//���1000��������ˮ�ɻ���narcissus
		/*
		for(int shuixian=100;shuixian<1000;shuixian++){
			int bai=shuixian/100%10;
			int shi=shuixian/10%10;
			int ge=shuixian%10;
			if(shuixian==bai*bai*bai+shi*shi*shi+ge*ge*ge){
				System.out.println(shuixian);
			}
		}
		*/
		//���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬
		//����񫣬�ֶ����һ�����ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
		//�Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
		//����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶���
		/*
		int tao=1;
		for(int da=9;da>=1;da--){
			tao=2*tao+2;
		}
		System.out.println(tao);
		*/

	}

}
