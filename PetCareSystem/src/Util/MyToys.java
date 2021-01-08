package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/bmag.vn
 * version 18.03
 */
//class chứa các hàm đồ chơi, dùng cho việc nhập xuất dữ liệu
public class MyToys {

    private static Scanner sc = new Scanner(System.in);
    private static final String emailValid = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
    private static final String phoneValid = "^0\\d{9}\\d*$";

    // hàm nhập vào số nguyên đích thực
    // - mọi sự nhập cà chớn bị chửi, ví dụ nhập chuỗi thay vì nhập số
    // - chống trôi lệnh, tức là ko để lại rác Enter hay kí tự nào đó
    // trong buffer cho thằng sau hốt
    // - có thể kiểm tra số nguyên trong 1 range/khoảng cho trước
    // - có câu thông báo động, tùy ngữ cảnh
    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound, int upperBound) {
        int n, tmp;
        //nếu đầu vào lower > upper thì đổi chỗ
        //lấy 1 số nguyên trong khoảng nếu sai bắt nhập lại

        if (lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < lowerBound || n > upperBound) {
                    throw new Exception();
                }
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    //nhập vào 1 số thực, chặn hết các trường hợp cà chớn 
    //lấy số thực từ Scanner nếu nhập ngoài Double bắt nhập lại
    public static double getADouble(String inputMsg, String errorMsg) {
        double n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static double getADouble(String inputMsg, String errorMsg, double lowerBound, double upperBound) {
        double n, tmp;
        //nếu đầu vào lower > upper thì đổi chỗ
        if (lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                if (n < lowerBound || n > upperBound) {
                    throw new Exception();
                }
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    //nhập vào một chuỗi kí tự, theo định dạng đc đưa vào
    //định dạng xài Regular Expression
    public static String getID(String inputMsg, String errorMsg, String format) {
        String id;
        boolean match;
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            match = id.matches(format);
            if (id.length() == 0 || id.isEmpty() || match == false) {
                System.out.println(errorMsg);
            } else {
                return id;
            }
        }
    }

    //nhập vào một chuỗi kí tự, khác rỗng
    //nếu rỗng bắt nhập lại;
    public static String getString(String inputMsg, String errorMsg) {
        String id;
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim();
            if (id.length() == 0 || id.isEmpty()) {
                System.out.println(errorMsg);
            } else {
                return id;
            }
        }
    }
    //hàm lấy date theo format dd/MM/yyyy nếu sai bắt nhập lại;
    public static String getDate(String inputMsg, String errorMsg) {
        String date;
        while (true) {
            System.out.println(inputMsg);
            date = sc.nextLine().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            try {
                sdf.parse(date);
                return date;
            } catch (ParseException e) {
                System.out.println(errorMsg);
            }
        }
    }
    //Phone để dạng String sai nhập lại
    public static String getPhone(String inputMsg, String errorMsg) {
        String phone;
        boolean check;
        while (true) {
            try {
                System.out.print(inputMsg);
                phone = sc.nextLine().trim();
                check = phone.matches("^0\\d{9}\\d*$");
                if (check == false) {
                    throw new Exception();
                } else {
                    return phone;
                }
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    //hàm check rank 
    public static String getRank(String inputMsg, String errorMsg) {
        String rank;
        while (true) {
            try {
                System.out.print(inputMsg);
                rank = sc.nextLine().trim();
                if (rank.equalsIgnoreCase("Excellence")
                        || rank.equalsIgnoreCase("Good")
                        || rank.equalsIgnoreCase("Fair")
                        || rank.equalsIgnoreCase("Poor")) {
                    return rank;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static String getEmail(String inputMsg, String errorMsg) {
        String email;
        boolean check;
        while (true) {
            try {
                System.out.print(inputMsg);
                email = sc.nextLine().trim();
                check = email.matches("^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$");
                if (check == false) {
                    throw new Exception();
                } else {
                    return email;
                }
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static boolean checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }

    //check number is odd or not
    public static boolean checkOdd(double n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    //check number is even or not
    public static boolean checkEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = MyToys.getString("Do you want to continue (Y/N)? ", "Please input y/Y or n/N.");
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    //main() để test thử yêu cầu nhập mã số theo định dạng cho
    //trước: D và 5 con số đi kèm
    //Nhấn Shift-F6 để chạy thử
    public static void main(String[] args) {
        String id = getID("Input ID(DXXXXX): ", "Your input must be under "
                + "the format of DXXXXX, X stands for a digit",
                "^[D|d]\\d{5}$");
        System.out.println("Your ID: " + id);
    }
}

