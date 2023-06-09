import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Nguoi
{
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;
  
    public Nguoi()
    {
        this.ngaySinh=new Date();
    }
    public Nguoi(String hoTen,Date ngaySinh,String queQuan)
    {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.queQuan=queQuan;
    }
  
    public void nhapThongTin(Scanner sc)
    {
        System.out.print("Nhap ho ten: ");
        this.hoTen=sc.nextLine();
        System.out.println("Nhap ngay sinh(dd-MM-yyyy): ");
        String ns=sc.nextLine();
        this.ngaySinh=chuyenStringDate(ns);
        System.out.print("Nhap que quan: ");
        this.queQuan=sc.nextLine();
    }
    public Date chuyenStringDate(String str)
    {
        Date ns=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            ns=sdf.parse(str);
        }
        catch(Exception e)
        {
            System.out.println("Loi dinh dang ngay thang.!");
        }
        return ns;
    }
    public void hienThongTin()
    {
         System.out.println("Ho va ten: "+this.hoTen);
         System.out.println("Ngay Sinh: "+this.ngaySinh);
         System.out.println("Que quan: "+this.queQuan);
    }

}