package chap001;

import java.util.Arrays;

public class ex03 {
//page 27 //�������� �������� ����Ͻù߾���..
	//��������
	public static void main(String[] args) {
		String[] folderA = {"myComputer", "myDocument"};
		
		//folderA.length // --> ???
		
		String[] folderB = folderA;
		
		System.out.println("[�纻 �迭�� �� ���� ��] �����迭:"
			+ Arrays.toString(folderA));
		
		folderB[0] = "newFolder"; // �纻�迭�� ù ��° �ε��� �� ����
		folderA[1] = "new3";
		folderA[1] = "newFolder2";
		System.out.println("[�纻 �迭�� �� ���� ��] ���� �迭: "
				+Arrays.toString(folderA));
		System.out.println("[�纻 �迭�� �� ���� ��] ���� �迭: "
				+Arrays.toString(folderB));
		
		System.out.println("���� ����");
		String[] folA = {"myComputer","myDocument"};
		String[] folB = new String[folA.length];
		
		System.out.println("[�纻 �迭�� �� ���� ��] ���� �迭 :"
				+Arrays.toString(folA));
		
		//���� {"myComputer","myDocument"};
		//�纻 {"",""}
		//�ݺ� {"myComputer",""}
		//    {"myComputer","myDocument"};
		
		for(int i=0; i<folA.length; i++) {
			folB[i] = folA[i]; // folA -> �ּҰ� folA[idx] -> ��
		}
		
		folB[0] = "newFolder"; // �纻 �迭�� ù��° �ε����� ����
		//���� {"myComputer","myDocument"};
		//�纻 {"newFolder","myDocument"}
		System.out.println("[�纻 �迭�� �� ���� ��] �����迭:"
				+Arrays.toString(folA));
		System.out.println("[�纻 �迭�� �� ���� ��] �����迭:"
				+Arrays.toString(folB));
		
		//�Ϲ������� ���α׷��� -> ����� ��������
		//�纻 -> ������ �Ѽ������ʰڴ� �ǹ� �Ѽ�X
		
		//������
		//Object -> �ֻ��� Ŭ���� ->��� Ŭ�������� �������� �ʵ�, �޼���
		//clone -> �����ϴ� ��� -> ��������
		String[] testA = {"origin","oring2"};
		String[] testB = new String[] {"origin","oring2"};
		String[] folC = folA.clone(); //-> ��������
		String[] folD = folA; // -> ��������
		
		folC[0] = "clone";
		folD[0] = "colne";
		
		
		System.out.println("[�纻 �迭�� �� ���� ��] ����testA�迭:"
				+Arrays.toString(testA));
		System.out.println("[�纻 �迭�� �� ���� ��] ����testB�迭:"
				+Arrays.toString(testB));
		System.out.println("[�纻 �迭�� �� ���� ��] ����folC�迭:"
				+Arrays.toString(folC));
		System.out.println("[�纻 �迭�� �� ���� ��] ����folD�迭:"
				+Arrays.toString(folD));
		
		
		//page30 -> �������ִ� ��� -> ���� -> �˻��Ҽ� �ִ� ����
		//�ڵ��׽�Ʈ�� �����ϸ� �ܿ����ϰ� �ǹ��� �˻�������
		//System.arraycopy �̰͵��� �˾Ƽ� ����غ��� �̷��� �ֱ��� ����
		//Arrays.copyOf
		//Arrays.copyRange
	}
	static void array() {
		
	}

}
