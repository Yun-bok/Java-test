package chap003;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ex02 {
	public static void main(String[] args) {
		// �ڹ�å 15�忡 �÷��� �����ӿ�ũ
		//�÷��� - ��ü�� �����ؼ� ����
		//�÷��� �����ӿ�ũ - java.util �÷��ǰ� ���õ� �������̽��� Ŭ������ ��Ī
		
		//List�÷���
		//��ü�� �Ϸķ� �þ���� ����
		//ArrayList, Vector, LinkedList
		//List -> �������̽�(java.util) -> �θ��� Ÿ������ ��밡��
		//List -> ArrayList, Vector, LinkedList ���� (���)
		
		
		//ArrayList
		//���ι迭 -> �迭�� Ư¡
		//�迭�� ������ new int[3] ũ�����
		//��		  5  4  3  2
		//�ε���    0  1  2  3
		//����(1)  5     3  2
		//        0  1  2  3
		//����     5  4  3   2
		//        0  1  2  3
		//        5     4   3   2 //�ڷ� �δ�
		//        0  1  2   3  4
		
		//����
		//�˻��� ������, �Ǹ����� ��ü �߰� ������. -> idx�� ����
		//����
		//����, ���� ������
		ArrayList_ex01();
		
		//LinkedList
		//���Ḯ��Ʈ
		//��� -> ������ ��ų� ǥ���ϴ� �⺻���� ����
		//���� ����Ʈ ��� ����
		//������ ���� -> �� ����, �����Ϳ��� -> ����� ���� ��带 ����Ű�� ����(�ּҰ�����)
		
		//����
		//����,���� ���� -> ����Ʈ ��尡 �־
		//����
		//�˻��� ���� -> Ư�� �ε����� ���� �Ұ� -> ������ ����(ó������)
		
		//�Ϲ����� ȸ�� -> ���� ���ϴ� ��� ���� -> CPU ��ǻ�ͻ��
		//������ �ǽð�, �߿���, ���� -> ������ �ؾ��Ѵ�. 
		
		//ArrayList�� LinkedList ����� ��
		
		Example01();
		//Vector -> ArrayList�� ������ ���α��� -> �迭
		//������ ��Ƽ�����忡�� ���� �۾� X,
		//�ϳ��� �����尡 �Ϸ� �� �ٸ� �����忡�� ������ �� �ִ�.
		//��Ƽ������(�����۾�ȯ��)���� �����ϰ� ��� -> ArrayList����
		//+ ũ�Ⱑ�� + ���� �ڿ� �ε��� ������ + ���Խ� �ڷ� �и�����
		
		
	}
	static void Example01() {
		//List �������̽� -> �θ�Ÿ��
		//ArrayList, LinkedList , Vector -> List �������̽��� ����(���)
		List<String> arr_list = new ArrayList<String>();
		List<String> linked_list = new LinkedList<String>();
		
		
		//���۽ð�
		long startTime;
		//����ð�
		long endTime;
		
		//System.nanoTime() -> �ð��� �������� �޼��� (������ ���뼼���� ns)
		//ms : �и��� 	   0.001 = 10^(-3)��
		//us : ����ũ����	   0.000001�� = 10^(-6)��
		//ns : ������	       0.000000001�� = 10^(-9)��
		startTime = System.nanoTime(); //���۽ð�
		//����
		for(int i =0; i<1000000; i++) {
			//String.valueof() �⺻Ÿ�� -> ���ڿ��� ��ȯ �� ��ȯ
			//0��° ��� Ȯ��
			arr_list.add(0, String.valueOf(i));
			//3 2 1 0
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList : " + (endTime - startTime)+"ns");
		
		//LinkedList �۾��ð� Ȯ��
		startTime = System.nanoTime();
		for(int i=0; i<1000000; i++) {
			linked_list.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList : " +(endTime - startTime)+"ns");
	}
	
	static void ArrayList_ex01() {
		//<���ʸ�Ÿ��> ����Ʈ�ȿ� ����Ǵ� ����� Ÿ�� ����
		// ������ object -> �ֻ��� Ŭ���� -> ������(��� ����Ҷ�) Ÿ�Ժ�ȯ
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("ab");	//"ab"
		arrlist.add("cd");  //"ab"  "cd"
		arrlist.add("ef");  //"ab"  "cd"  "ef"
		arrlist.remove(2);  //"ab"  "cd"   2��°idx ����
		
		//ArrayList  .size() - ũ��(��Ұ���)��ȯ
		for(int i=0; i<arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
	}
}
