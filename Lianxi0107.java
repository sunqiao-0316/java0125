package lianxi.part01;

import java.util.Scanner;

public class Lianxi0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��д�������x��ֵ������y��ֵ��������x��y��ֵ
		/*
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int y;
		if(x<0){
			y=-1;
		}
		else if(x==0){
			y=0;
		}
		else {
			y=1;
		}
		System.out.println(x+" "+y);
		*/
		//����һ���ַ��������жϸñ����Ƿ�ΪԪ����ĸ�����
		//Ԫ����ĸΪa��e��i��o��u
		/*
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch);
			break;
		default:
			System.out.println("����Ԫ����ĸ");
		}
*/
		//���200��300֮�������������������������������֮��Ϊ42����������֮��Ϊ12
		/*
		for(int i=200;i<=300;i++){
			int a=(i/100%10)*(i/10%10)*(i%10);
			int b=i/100%10+i/10%10+i%10;
			if(a==42&&b==12){
				System.out.println(i);
			}
		}
		*/
		//��0~100�����
		/*
		int s=0;
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				
				s+=i;
			}
		}
		System.out.println(s);
		*/
		//Ѱ�����е�ˮ�ɻ�����һ������λ����ÿһλ��������������������������ı�������153=111 + 555 + 333
		/*
		for(int i=100;i<1000;i++){
			int a=i/100%10;
			int b=i/10%10;
			int c=i%10;
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}
		}
		*/
		//�����Ҷ��ʼ���䡣��һ����Ҷ��ʼ������һ�뻹��һƬ���ڶ�����������ʣ�µ�һ����һƬ���������ѭ����ֱ����ʮ���죬���ϻ�ʣһƬҶ�ӡ��ʣ���Ŵ����ܹ��ж���ƬҶ��
		/*
		int s=1;
		for(int i=15;i>1;i--){
			s=2*s+2;
		}
		System.out.println(s);
		*/
		//�����"����ٵ�"���⣬��һ��ƥ����һ�ٵ�����������3����������2������ֻС����1�������д��У�С�����ƥ��
		/*
		int s=100;
		for(int d=1;d<=100;d++){
			for(int z=1;z<=100;z++){
				for(int x=1;x<=100;x++){
					if(s==3*d+2*z+0.5*x&&d+z+x==100){
						System.out.println(d+" "+z+" "+x);
					}
				}
			}
		}
		*/
		//����һ����ݣ��ж��Ƿ������� 1.��4���������ܱ�100������2.�ܱ�400����
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������");
		int i=scanner.nextInt();
		
		//����һ���·ݣ�����ڴ��·�������ͬ���·�:135781012(31)  46911(30) 2(29)
		
		System.out.println("�����·�");
		int mo=scanner.nextInt();
		switch(mo){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		case 2:
			if(i%4==0&&i%100!=0){
				System.out.println("28��");
			}
			else if(i%400==0){
				System.out.println("28��");
			}
			else{
				System.out.println("29��");
			}
			break;
		
		}
		*/
	}

}
