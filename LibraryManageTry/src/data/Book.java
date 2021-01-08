package data;

import java.util.Scanner;
/*
  Book
        bookname createat nickName
        tạo có đối số và ko có đối số
        tạo getter and setter
        tạo hàm input//nếu mà danh sách này có tác giả mà có tên trong danh sách tách giả thì bỏ qua
        Nếu tác giả của cuốn sách mà chưa có tồn tại trong ds thì thêm mới
 */

public class Book {
	String bookName;
	String createAt;
	String nickName;

	public Book(String bookName, String createAt, String nickName) {
		super();
		this.bookName = bookName;
		this.createAt = createAt;
		this.nickName = nickName;
	}

	public Book() {
		super();
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book's name: ");
		bookName = sc.nextLine();

		System.out.println("Enter date create book: ");
		createAt = sc.nextLine();

		System.out.println("Enter author's nickname: ");
		nickName = sc.nextLine();
	}

	public void showInfo() {
		System.out.format("|%-20s|%-20s|%-20s\n", bookName, nickName, createAt);
	}

}
