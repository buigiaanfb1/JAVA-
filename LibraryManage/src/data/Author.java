package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Author {
	private String name;
	private String nickName;
	private int old;
	private String birthday;

	public Author() {
		super();
	}

	public Author(String nickName) {
		super();
		this.nickName = nickName;
	}

	public Author(String name, String nickName, int old, String birthday) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.old = old;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public int getOld() {
		return old;
	}

	public String getBirthday() {
		return birthday;
	}

	// khong gan nickName
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter author's name: ");
		name = sc.nextLine();
		System.out.println("Enter author's age: ");
		old = Integer.parseInt(sc.nextLine());
		System.out.println("Enter author's birthday: ");
		birthday = sc.nextLine();
	}

	public void input(ArrayList<Author> authorList) {
		input();
		while (true) {
			System.out.println("Enter author's nickname: ");
			Scanner sc = new Scanner(System.in);
			this.nickName = sc.nextLine();
			boolean isFind = false;
			for (int i = 0; i <= authorList.size() - 1; i++) {
				if (this.nickName.equalsIgnoreCase(authorList.get(i).getNickName())) {
					isFind = true;
				}
			}
			if (!isFind) {
				break;
			} else {
				System.err.println("Nickname conflicted");
			}
		}
	}
	
	public void showInfor() {
		System.out.format("|%-20s|%-20s|%-20s|-3d\n", name, nickName, birthday, old);
	}

}
