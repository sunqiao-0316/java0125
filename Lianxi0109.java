package lianxi.part01;

import java.util.Scanner;

public class Lianxi0109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���1-100�ڵ�����ż��
		/*
		for(int ev=1;ev<=100;ev++){
			if(ev%2==0){
				System.out.print(ev);
			}
			System.out.print('\t');
		}
		System.out.println();
		//������1~100���ۼ�ֵ���������и�λΪ3����
		int s=0;
		for(int nu=1;nu<=100;nu++){
			if(nu%10!=3){
			s+=nu;	
			}
		}
		System.out.println(s);
		
		//���ʽ��
		for(int i=1;i<=20;i++){
			int op1=2*i;
			int op2=5*i;
			int s2=op1*op2;
			System.out.println(op1+"*"+op2+"="+s2);
		}
		
		//һ��ֽ�ĺ�ȴ�Լ��0.08mm�����۶��ٴ�֮���ܴﵽ���������ĸ߶ȣ�8848.13 �ף���
		double depth=0.08;//ֽ�ĺ��
		int n=1;
		while(depth<8848130.00){
			depth*=2;
			n++;
		}
		System.out.println(n);
		
		//�����û������һ���������ж�������������ż��
		Scanner scanner=new Scanner(System.in);
		int nu1=scanner.nextInt();
		if(nu1%2==0){
			System.out.println("��ż��");
		}
		else if(nu1%2!=0){
			System.out.println("������");
		}
		*/
		//ʹ��ѭ��������20�Ľ׳ˡ�20��
		/*
		long fa=1L;
		for(int nu2=2;nu2<=20;nu2++){
			fa=fa*nu2;
		}
		System.out.println("20�Ľ׳�="+fa);
		
		//���û�����һ���ַ����ж�����Сд��ĸ���Ǵ�д��ĸ�������Сд��ĸ�Ļ�����ת���ɴ�д��ĸ���
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		if(ch<='z'&&ch>='a'){
			ch=(char) (ch-32);
			System.out.println(ch);
		}
		else if(ch<='Z'&&ch>='A'){
			System.out.println(ch);
		}
		else{
			System.out.println("����");
		}
		
		//�� while ѭ�������� 1~200 ֮������ 3 �ı���֮��
		int nu3=1;
		int s3=0;
		while(nu3<=20){
			if(nu3%3==0){
				s3+=nu3;
			}
			nu3++;
		}
		System.out.println(s3);	
		*/
		
		//��� 200~500 ֮����������� ����1���������ⲻ�ܱ���������
		/*
		boolean bl;
		for(int nu4=1;nu4<=10;nu4++){
			bl=true;
			for(int nu5=2;nu5<nu4;nu5++){
				if(nu4%nu5==0){
					bl=false;
				}
			}
			if(bl){
				System.out.println(nu4);
			}
		}
		int count=0;
		for(int su=1;su<=10;su++){
			count=0;
			for(int su1=2;su1<su;su1++){
				if(su%su1==0){
					count++;
				}
			}
			if(count==0){
				System.out.println(su);
			}
		}
		*/
		
		//�����֣��������һ�����֣����û��´�С��Ȼ����ʾ�´��˻��߲�С�ˣ��²������û�һֱ�£�ֱ���û����У���Ϸ�������Ͳ���Ҫ��������
		//ͨ��Math.random()�������һ������
		int x=(int)(Math.random()*10);//�������һ������
		System.out.println("������");
		Scanner scanner=new Scanner(System.in);
		while(true){
			int y=scanner.nextInt();
			if(y>x){
				System.out.println("�´���");
			}
			else if(y<x){
				System.out.println("��С��");
			}
			else{
				System.out.println("������");
				break;
			}
		}
		
		
	}
}
