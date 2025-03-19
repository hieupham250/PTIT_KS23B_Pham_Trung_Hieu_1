package ra.presentation;

import ra.bussiness.StudentBusiness;
import ra.entity.Student;

import java.util.Scanner;

public class StudentApplication {
    public static int countStudent = 0;
    public static void main(String[] args) {
        Student[] students = new Student[100];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------------------------Student Menu----------------------------");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Sắp xếp ");
            System.out.println("0. Thoát chương trình");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    StudentBusiness.studentList(students);
                    break;
                case 2:
                    StudentBusiness.studentAdd(students);
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần chỉnh sửa: ");
                    String studentUpdateId = sc.nextLine();
                    StudentBusiness.studentUpdate(students, studentUpdateId);
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String studentDeleteId = sc.nextLine();
                    StudentBusiness.studentDelete(students, studentDeleteId);
                    break;
                case 5:
                    StudentBusiness.findStudent(students);
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 0-6!");
                    break;
            }
        } while (true);
    }
}
