package daily_dose;
import java.util.ArrayList;

public class BookingSystem {

	public static void main(String[] args) {
		Passengers obj =new Passengers();
		obj.setList();
		BookingSystem bs=new BookingSystem();
		bs.ticketAvailable(obj.list);
		
	}
	void ticketAvailable(ArrayList<Integer> list) {
		int seat=list.size();
		System.out.println(seat);
	}

}
