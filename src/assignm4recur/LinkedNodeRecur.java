package assignm4recur;

public class LinkedNodeRecur<T> {

	
		T data;
		LinkedNodeRecur<T> next=null;
		T getData(){
			return data;
		}

		void setData(T data){
			this.data=data;
		}

		LinkedNodeRecur<T> getNext(){
			return next;
		}

		void setNext(LinkedNodeRecur<T> next){
			this.next=next;
		}
	}




