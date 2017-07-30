package ��ָOffer;

public class ReverseList_16 {

	public ListNode ReverseList(ListNode head) {
		if(head==null){
			return null;
		}
		//headΪ��ǰ�ڵ㣬�����ǰ�ڵ�Ϊ�յĻ����Ǿ�ֱ�ӷ���
		ListNode next = null;
		ListNode pre = null;
		//��ǰ�ڵ���head��preΪ��ǰ�ڵ��ǰһ�ڵ㣬nextΪ��ǰ�ڵ����һ�ڵ�
		//��Ҫpre��next��Ŀ�����õ�ǰ�ڵ��pre->head->next1->next2���pre<-head next1->next2
		//��pre�ýڵ���Է�ת��ָ���򣬵���ת֮���������next�ڵ㱣��next1�ڵ�Ļ����˵�����ʹ˶Ͽ���
		//������Ҫ�õ�pre��next�����ڵ�
		//1->2->3->4->5
		//1<-2<-3 4->5
		while(head!=null){
			//����next����head����һ���ڵ����Ϣ����֤����������Ϊʧȥhead�ڵ��ԭnext�ڵ���ʹ˶���
			next = head.next;
			//������next���Ϳ�����head��ָ��next���ָ��pre�ˣ���������
			head.next=pre;
			//headָ��pre�󣬾ͼ������η�ת��һ���ڵ�
            //��pre��head��next��������ƶ�һ���ڵ㣬������һ�ε�ָ�뷴ת
			pre=head;
			head=next;
		}
		//���headΪnull��ʱ��pre��Ϊ���һ���ڵ��ˣ����������Ѿ���ת��ϣ�pre���Ƿ�ת������ĵ�һ���ڵ�
        //ֱ�����pre����������Ҫ�õ��ķ�ת�������
		return pre;
    }
	/**
	 * �ݹ鷽ʽʵ������ת
	 * @param head
	 * @return
	 */
	public ListNode ReverseList2(ListNode head) {

		if (head == null || head.next == null)
			return head;
    	ListNode rehead = ReverseList(head.next);
    	head.next.next = head;// ��ͷ�ڵ�����ĩ��
    	head.next = null;// ��ֹ����ѭ��
    	return rehead;
    }
}
