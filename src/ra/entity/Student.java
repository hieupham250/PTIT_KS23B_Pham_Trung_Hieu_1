package ra.entity;

import java.util.Scanner;

public class Student implements IApp {
    private String studentId;
    private String studentName;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private String email;
    private String major;
    private String className;
    private float gpa;
    private byte status;

    public Student() {}

    public Student(String studentId, String studentName, String birthday, String phoneNumber, Boolean sex, String email, String major, String className, float gpa, byte status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.email = email;
        this.major = major;
        this.className = className;
        this.gpa = gpa;
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getClassName() {
        return className;
    }

    public String getMajor() {
        return major;
    }

    public float getGpa() {
        return gpa;
    }

    public byte getStatus() {
        return status;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập mã sinh viên: ");
        studentId = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        studentName = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        birthday = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        phoneNumber = sc.nextLine();
        System.out.print("Nhập giới tính (true - Nam , false - Nữ): ");
        sex = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập email: ");
        email = sc.nextLine();
        System.out.print("Nhập ngành học: ");
        major = sc.nextLine();
        System.out.print("Nhập tên lớp học: ");
        className = sc.nextLine();
        System.out.print("Nhập điểm tích lũy trung bình: ");
        gpa = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập trạng thái (1- đang theo học, 2 - bảo lưu, 3 - đã nghỉ học): ");
        status = Byte.parseByte(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("---------------------------------------");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Ngày sinh: " + birthday);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Giới tính: " + sex);
        System.out.println("Email: " + email);
        System.out.println("Ngành học: " + major);
        System.out.println("Tên lớp học: " + className);
        System.out.println("Điểm tích lũy trung bình: " + gpa);
        System.out.println("Trạng thái: " + status);
        System.out.println("---------------------------------------");
    }
}
