package ����;

public class star {
	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		//for���� ������ �����ְ� , ���۰� ���� ��ŭ �����ϸ鼭 �ݺ�
		int num = 4;
		
		//���� ��Ÿ���� for i : 0~num-1 -> num �ݺ� 1�����ϸ�
		//i
		//0      ���� 3   �� 1    j   4  3  2  1    i 0   j 4 3 2   1
		//1      ���� 2   �� 2    j   4  3  2  1    i 1   j 4 3   2 1
		//2      ���� 1   �� 3    j   4  3  2  1    i 2   j 4   3 2 1
		//3      ���� 0   �� 4    j   4  3  2  1     
		
		//i   ��	j��
		//0      ���� 3   �� 1    j   3  2  1  0    i 0   j 3 2 1   0
		//1      ���� 2   �� 2    j   3  2  1  0    i 1   j 3 2   1 0
		//2      ���� 1   �� 3    j   3  2  1  0    i 2   j 3   2 1 0    
		//3      ���� 0   �� 4    j   3  2  1  0 
		
		
		//��Ģ�� ���巯����
		// ���� num-(i+1)   �� i+1 ����
		for(int i=0; i<num; i++) {
			//���� ��Ÿ���� for
			for(int j=0; j<num; j--) {
				if(j>i+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
	}
}
