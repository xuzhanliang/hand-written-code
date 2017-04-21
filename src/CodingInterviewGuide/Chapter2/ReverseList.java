package CodingInterviewGuide.Chapter2;

public class ReverseList {

	public Node reverserList(Node head){
		Node pre = null;
		Node next = null;
		while(head!=null){
			next = head.next;
			//����next����head����һ�ڵ����Ϣ����֤����������Ϊʧȥhead�ڵ��ԭnext�ڵ���ʹ˶���
			head.next = pre;
			//��headָ��pre
			pre = head;
			//preָ��head�����ں���һ��
			head = next;
			//��ǰ�汣���head��next�ڵ���Ϊ�´�ѭ����head
		}
		return pre;
	}
}
