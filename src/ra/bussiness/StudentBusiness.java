package ra.bussiness;

import ra.entity.Student;

import java.util.Scanner;

import static ra.presentation.StudentApplication.countStudent;

public class StudentBusiness {
    static Scanner sc = new Scanner(System.in);

    public static void studentList(Student[] students) {
        if (countStudent == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (int i = 0; i < countStudent; i++) {
            students[i].displayData();
        }
    }

    public static void studentAdd(Student[] students) {
        if (countStudent < 100) {
            students[countStudent] = new Student();
            students[countStudent].inputData(sc);
            countStudent++;
        } else {
            System.out.println("Danh sách đã đầy!");
        }
    }

    public static void studentUpdate(Student[] students, String studentUpdateId) {
        boolean flag = false;
        for (int i = 0; i < countStudent; i++) {
            if (students[i].getStudentId().equals(studentUpdateId)) {
                flag = true;
                students[i].displayData();
                System.out.println("------------MENU chỉnh sửa-----------");
                System.out.println("1. Tên sinh viên");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Số điện thoại");
                System.out.println("4. Giới tính");
                System.out.println("5. Email");
                System.out.println("6. Ngành học");
                System.out.println("7. Lớp học");
                System.out.println("8. Điểm tích lũy trung bình");
                System.out.println("9. Trạng thái");
                System.out.println("10. Thoát");
                int choice = sc.nextInt();
                System.out.print("Lựa chọn của bạn: ");
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Nhập tên sinh viên mới: ");
                        students[i].setStudentName(sc.nextLine());
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 2:
                        System.out.print("Nhập tên ngày sinh mới: ");
                        students[i].setBirthday(sc.nextLine());
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 3:
                        System.out.print("Nhập số điện thoại mới: ");
                        students[i].setPhoneNumber(sc.nextLine());
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 4:
                        System.out.print("Nhập giới tính mới: ");
                        students[i].setSex(Boolean.parseBoolean(sc.nextLine()));
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 5:
                        System.out.print("Nhập email viên mới: ");
                        students[i].setEmail(sc.nextLine());
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 6:
                        System.out.print("Nhập tên ngành học mới: ");
                        students[i].setMajor(sc.nextLine());
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 7:
                        System.out.print("Nhập lớp học mới mới: ");
                        students[i].setClassName(sc.nextLine());
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 8:
                        System.out.print("Nhập điểm tích lũy trung bình mới: ");
                        students[i].setGpa(Float.parseFloat(sc.nextLine()));
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 9:
                        System.out.print("Nhập trạng thái mới (1- đang theo học, 2 - bảo lưu, 3 - đã nghỉ học): ");
                        students[i].setStatus(Byte.parseByte(sc.nextLine()));
                        System.out.println("Đã sửa thành công!");
                        break;
                    case 10:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            }
        }
        if(!flag) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public static void studentDelete(Student[] students, String studentDeleteId) {
        boolean checkStudent = false;
        for (int i = 0; i < countStudent; i++) {
            if (students[i].getStudentId().equals(studentDeleteId)) {
                students[i] = students[countStudent - 1];
                countStudent--;
                checkStudent = true;
                System.out.println("Đã xóa thành công!");
            }
        }
        if (!checkStudent) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public static void findStudent(Student[] students) {
        boolean checkStudent = false;
        System.out.println("---------Lựa chọn tìm kiếm-------------");
        System.out.println("1. Theo tên");
        System.out.println("2. Theo lớp học");
        System.out.println("3. Theo điểm tích lũy");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Nhập tên sinh cần tìm: ");
                String findStudentName = sc.nextLine();
                for (int i = 0; i < countStudent; i++) {
                    if (students[i].getStudentName().equals(findStudentName)) {
                        students[i].displayData();
                        checkStudent = true;
                    }
                }
                if (!checkStudent) {
                    System.out.println("Không tìm thấy kết quả phù hợp");
                }
                break;
            case 2:
                System.out.print("Nhập tên lớp cần tìm: ");
                String findClassName = sc.nextLine();
                for (int i = 0; i < countStudent; i++) {
                    if (students[i].getClassName().equals(findClassName)) {
                        students[i].displayData();
                        checkStudent = true;
                    }
                }
                if (!checkStudent) {
                    System.out.println("Không tìm thấy kết quả phù hợp");
                }
                break;
            case 3:
                break;
            case 4:
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }

    }
}
