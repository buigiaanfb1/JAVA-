package data;

import java.util.Scanner;
import java.util.ArrayList;

/*
 Author
		name nickname old birthday;
		tạo phễu hàm ko đối số
		tạo phễu có đối số
		tạo phễu có đối số là nickname
		tạo getter ko tạo setter
		tạo hàm nhập thông tin tác giả
		nhưng nếu tác giả đã tồn tạo trong ds thì ko ho ép nhập lại
		tạo hàm showInfor
*/
public class Author {
	protected String name;
	protected String nickname;
	protected int old;
	protected String birthday;

	public Author() {
		super();
	}

	public Author(String nickname) {
		super();
		this.nickname = nickname;
	}

	public Author(String name, String nickname, int old, String birthday) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.old = old;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getNickname() {
		return nickname;
	}

	public int getOld() {
		return old;
	}

	public String getBirthday() {
		return birthday;
	}

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
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter author's nickname: ");
			nickname = sc.nextLine();
			boolean findId = false;
			for (int i = 0; i <= authorList.size() - 1; i++) {
				if (nickname.equalsIgnoreCase(authorList.get(i).getNickname())) findId = true;
			}
			if (!findId) break;
			else System.out.println("Nickname conflicted");
		}
	}

	public void showInfor() {
		System.out.format("|%-20s|%-20s|%-20s|-3d\n", name, nickname, birthday, old);
	}
}
