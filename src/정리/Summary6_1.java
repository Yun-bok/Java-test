package ����;

public class Summary6_1 {
	public static void main(String[] args) {
		//new ������(); -> Ŭ���� ��ü�� �����ϰ� �ּҰ��� ��ȯ
		Pet2 pet1 = new Pet2();
		Cat2 cat1 = new cat2();
		
		System.out.println("����Ÿ�Ժ�ȯ");
		static void printSound(Pet2 pet) {
			pet.Sound();
		}
	}

	class Pet2 {
		void Sound() {
			System.out.println("�ֿϵ��� �����Ҹ�");
		}
	}

	class Dog extends Pet2 {
		// �������̵�
		@Override
		void Sound() {
			System.out.println("�۸�");
		}

		void bite() {
			System.out.println("������");
		}
	}

	class Cat2 extends Pet2 {
		@Override
		void Sound() {
			System.out.println("�Ŀ�");
		}

		void scratch() {
			System.out.println("������");
		}
	}
}