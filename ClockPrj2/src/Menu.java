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
import java.util.Scanner;
public class Menu extends ArrayList<String> implements I_Menu{
	ArrayList<String> option = new ArrayList<>();
	int maxOption = option.size();
	Scanner sc = new Scanner(System.in);
    public Menu(){
        super();
    }

	@Override
	public void addItem(String s) {
		// TODO Auto-generated method stub
		option.add(s);
	}

	@Override
	public int getChoice() {
		// TODO Auto-generated method stub
		System.out.println("Please input from 1 to" + maxOption);
		return Integer.parseInt(sc.nextLine());
	}
    
}
