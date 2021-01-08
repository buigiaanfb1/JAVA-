/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ClockList extends ArrayList implements I_List {
    Scanner sc= new Scanner(System.in);
    ArrayList<Clock> clockList = new ArrayList<>();
	@Override
	public int find(String code) {
		int pos = -1;
		for (int i = 0; i <= clockList.size()-1; i++) {
			if(clockList.get(i).getCode().equalsIgnoreCase(code)) return i;
		}
		return -1;
	}

	@Override
	public void add() {
		Clock clock = new Clock();
		clock.input();
		clockList.add(clock);
		
	}

	@Override
	public void remove() {
		String key;
		System.out.println("Vui long chon clock muon xoa: ");
		key = sc.nextLine();
		int pos = find(key);
		if (pos == -1) System.out.println("nothing to remove");
		else {
			clockList.remove(pos);
			System.out.println("Remove sucessfully");
		}
	}

	@Override
	public void update() {
		String key;
		System.out.println("Vui long nhap code muon update: ");
		key = sc.nextLine();
		int pos = find(key);
		if (pos == -1) System.out.println("nothing to update");
		else {
			clockList.remove(pos);
			System.out.println("Clock truoc khi update");
			clockList.get(pos);
			System.out.println("update price");
			clockList.get(pos).setPrice(Integer.parseInt(sc.nextLine()));
			System.out.println("Clock sau khi update");
			clockList.get(pos).showInfo();
		}
		
	}

	@Override
	public void sort() {
		if(clockList.isEmpty()) {
			System.out.println("nothing to print");
			return;
		}
		Collections.sort(clockList, new Comparator<Clock>() {

			@Override
			public int compare(Clock o1, Clock o2) {
				// TODO Auto-generated method stub
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		});
		for (Clock o: clockList) {
			o.showInfo();
		
	}
}


	public void output() {
		for (Clock o: clockList) {
			o.showInfo();
		}
		
	}

}
