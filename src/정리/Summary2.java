package ����;

public class Summary2 {

	public static void main(String[] args) {
		/*���
		 * ���ǹ�, �ݺ���
		 * ���ǹ� - if, switch
		 * 
		 * ���ǽ�-> true -> 1�����ڵ� �����ϰ� ������ ����(�������)
		 * -> false -> 1�����ڵ� ���� X -> ���ǽ�2 ������ üũ
		 * 
		 * ���ǽ�2 -> true ->2�����ڵ� �����ϰ� ����(������ ���� ����)
		 * -> false -> 2�����ڵ� ���� X -> �������� �ִٸ� (else) -> 3�����ڵ� ����
		 * 
		 * if(���ǽ�){
		 * 		1 �����ڵ�
		 * }else if(���ǽ�2){ //�ʿ信 ���� �������� ��������
		 * 		2 �����ڵ�
		 * }else{			//�ʿ信 ���� �������� ��������
		 * 		3 �����ڵ�
		 * }
		 * 
		 * int num = 3;
		 * if(num==3) { // ==����, !=�����ʴ� num==3 -> true
		 * System.out.println("num�� 3�̴�"); 
		 * }
		 * 
		 * num =1;
		 * if(num==3) { // ==����, !=�����ʴ� num==3 -> true
		 * System.out.println("num�� 3�̴�"); 
		 * }else if(num==2) {
		 * System.out.println("num�� 2�̴�");
		 * }else{
		 * System.out.println("������ ����");
		 * 
		 *������ ���� ���� �����ڵ尡 �޶����� ����
		 *���� ��1�϶� -> 1�����ڵ�
		 *���� ��2�϶� -> 2�����ڵ�
		 *������ ���� �������� �������� -> default 3�����ڵ� ����
		 *break; ������ �ؿ� �����ڵ嵵 �����
		 *
		 * switch(����) {
		 * case ��: 1�����ڵ�; break;
		 * case ��: 2�����ڵ�; break;
		 * default: 3�����ڵ�; break;
		 * }
		 * num = 2;
		 * switch(num) {
		 * case 1: System.out.println("1"); break;
		 * case 2: System.out.println("2"); break;
		 * case 3: System.out.println("3"); break; //����ġ�� �극��ũ �ְ� ���� �߿�
		 * default:System.out.println("������");
		 * }
		 * 
		 * �ݺ��� for, while, do while
		 * for(�ʱⰪ ; ���ǽ� ; ������){
		 * 			�ݺ����� �ڵ�
		 * }
		 * �ʱⰪ -> ������ ����
		 * ���ǽ� -> ���̸� -> �ݺ��ڵ� ���� -> ������ ���� �� ����
		 * -> ���ǽ� -> ���̸� -> �ݺ��ڵ���� -> ������ ������ ����
		 * -> ���ǽ� -> �����̸� -> �ݺ���(���̻� ����X)
		 * ���ǽ� -> ������ �ݺ�����
		 * ������ -> ��� �ֱ�
		 * ���� i 0 -> 9	 //�ʱⰪ, ���� -> ���۰� ��
		 * ������ -> �ֱ�    0 ~9 	 1���� 9���ݺ�
		 * i = i+2	0 2 4 8    4�� �ݺ�
		 * for(int i = 0; i<10; i= i+2) {
		 * 	System.out.print(i+"Ȧ��");
		 *  System.out.print(i+1)+"¦��");
		 * if(i%2==0) {
		 * System.out.println(i+"¦��");
		 * }else {
		 * System.out.println(i+"Ȧ��");
		 * }
		 * 
		 * 
		 * 
		 * while - �Ϲ������� ���� ���� ����, ������ �����ڵ�
		 *���ǽ��� �� -> �����ڵ� ���� -> ������ -> ���ǽ� -> �� ->�����ڵ�
		 *������ -> ���ǽ� -> ����false -> �ݺ���
		 * while(���ǽ�) {
		 * 		�����ڵ�
		 * }
		 * System.out.print("while");
		 * int cnt = 5;
		 * while(cnt>0) {
		 * 		System.out.println(cnt);
		 * 		cnt--;
		 * }
		 * 
		 * �����ҹ��� �־�� �ݺ����� ���
		 * boolean isrun = true;
		 * while(isrun) {
		 * 		System.out.println("�ݺ�");
		 * 		cnt++;
		 * 		if(cnt==10) {
		 * 			break;
		 * }
		 * }
		 * 
		 *  
		 * do while -> while ���Ǻ��
		 * ������ -> �����ڵ尡 ������ ����
		 * do{
		 * 		�����ڵ�
		 * }while(���ǽ�);
		 * 
		 * do{
		 * 		System.out.println("do��� ����");
		 * }while(false);
		 * }
		 */

	}

}
