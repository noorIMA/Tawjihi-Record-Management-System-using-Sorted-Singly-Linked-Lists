package application;

public class LinkedListSingle {
		
		 static  Node header;
	 
		 
		 public void insertAtFirst( String seat_number,String branch,String average) {
				Node current = new Node(seat_number, branch, average);
				if (header == null) {
					header  = current;
				} else {
					current.next = header;
					header = current;
				}
			}
		public static void insertSorted(int index,Node data) {
			Node current = header;
			if(current== null || current.getAverage().equals(data.getAverage()) ){
				data.next = current;
				current=data;
			}
			else {
				while(current.next != null && current.next.getAverage().equals(data.getAverage())) {
					current=current.next;
					data.next=current.next;
					current.next=data;
				}
			}
			
		 }
		
		
		public static void sortList() {
			Node current =header;
			Node ptr=null;
			String temp;
			if(current==null)
				System.out.println("Error : List is empty !!!");
			else {
				while(current !=null) {
					ptr=current.next;
					while(ptr !=null) {
						if(current.getAverage().equals(ptr.getAverage())) {
							temp=current.getAverage();
							current.setAverage(ptr.getAverage());
							ptr.setAverage(temp);
						}
						ptr =ptr.next;
					}
					current=current.next;
				}
			}
		}
		
		
		
		public static void delete(int seat_number ) {
			Node current = header;
			Node prev =null;
			if(current==null) {
				System.out.println("Error: the List is Empty !!!");
			}
			if(current!= null && current.getSeat_number().equals(seat_number) ) {
				current =current.next;
			}
			while(current!= null && current.getSeat_number().equals(seat_number)) {
				prev=current;
				current=current.next;
			}
			prev.next=current.next;
		}
		
		public int SearchList(int seat_number) {
			int count = 1;
			Node current = header;

			if (current == null) {
				return -1;
			}
			while (current != null) {
				if (current.getSeat_number().equals(seat_number))
					return count;
				current = current.next;
				count++;
			}
			return count;
		}
		public static void top10student(String average) {
			double avergeD = Double.parseDouble(average);
		}
		
		public static double mean(LinkedListSingle list ) {
			 Node current = header;
			 int count = 0; 
			 int sum = 0;
			 double mean = 0;
			if (current == null)
		        return -1;
		    while (current != null){
		        count++;
		        double getAverage= Double.parseDouble(current.getAverage());
		        sum += getAverage;
		        current = current.next;
		    }
		    mean = (double)sum / count;
		 
		    return mean;
			
		}
		
		public static double mode(int index,LinkedListSingle list) 
	    {
			Node current= header;
			Node ptr=current.next;
	        double modevalue = 0;
	        int maxcount = 0;
	        int count = 0;
	        double avr=Double.parseDouble(current.getAverage());
	        double avr1=Double.parseDouble(ptr.getAverage());
	        while(current !=null) {
	        	while(ptr!=null) {
	           
	                if (avr == avr1)
	                    ++count;
	            }
	            if (count > maxcount) {
	            	maxcount = count;
	                modevalue = avr1;
	            }
	        }
	 
	        return modevalue;
	    }
		
		//public static 
}


