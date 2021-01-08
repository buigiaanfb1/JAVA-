package runtime;

import java.util.ArrayList;
import java.util.Scanner;

import data.Author;

import data.Book;

/*Tạo chương trình quản lý thư viện gồm 2 class sau
Author
        name nickname old birthday;
        tạo phễu hàm ko đối số
        tạo phễu có đối số
        tạo phễu có đối số là nickname
        tạo getter ko tạo setter
        tạo hàm nhập thông tin tác giả
        nhưng nếu tác giả đã tồn tạo trong ds thì ko ho ép nhập lại
        tạo hàm showInfor
Book
        bookname createat nickName
        tạo có đối số và ko có đối số
        tạo getter and setter
        tạo hàm input//nếu mà danh sách này có tác giả mà có tên trong danh sách tách giả thì bỏ qua
        Nếu tác giả của cuốn sách mà chưa có tồn tại trong ds thì thêm mới
Program:
        menu\
        1.Nhập thông tin sách in ra màn hình
        2.hiển thị thông tin sach và in ra màn hình
        3.nhập thông tin tác giả
        4.Tìm kiếm sach theo bút danh
        5.Thoát
*/

public class Program {
	public static void main(String[] args) {
		ArrayList<Author> authorList = new ArrayList<>();
		ArrayList<Book> bookList = new ArrayList<>();

		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			showMenu();
			System.out.print("Please enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Book book = new Book();
				book.input();
				boolean isFind = false;
				for (int i = 0; i <= authorList.size() - 1; i++) {
					if (authorList.get(i).getNickname().equalsIgnoreCase(bookList.get(i).getNickName()))
						isFind = true;
				}
				if (!isFind) {
					System.out.println("Please enter info of Author");
					Author ath = new Author();
					ath.input();
					authorList.add(ath);
				}
				break;

			case 2:
				for (Book o : bookList) {
					o.showInfo();
				}
				break;

			case 3:
				Author ath = new Author();
				ath.input();
				break;

			case 4:
				String findName = sc.nextLine();
				for (Book o : bookList) { 
					if (o.getNickName().equalsIgnoreCase(findName)) o.showInfo();
				}
				break;

			case 5:
				System.out.println("See you again");
				break;

			default:
				System.out.println("In range 1 -> 5");
				break;
			}
		} while (choice != 5);
	}

	public static void showMenu() {
		System.out.println("1. Nhập thông tin sách in ra màn hình");
		System.out.println("2. Hiển thị thông tin sách ra màn hình");
		System.out.println("3. Nhập thông tin tác giả");
		System.out.println("4. Tìm kiếm sách theo NickName");
		System.out.println("5. Thoát");
	}
}
