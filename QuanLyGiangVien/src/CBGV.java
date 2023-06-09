import java.util.Scanner;
import java.util.Date;
public class CBGV extends Nguoi
{
    private double luongCung;
    private double thuong;
    private double lThuclinh;
    private double phat;
    
    public CBGV()
    {
        
    }
    public  CBGV(String hoTen,Date ngaySinh,String queQuan,double luongCung,double thuong,double phat)
    {
        super( hoTen,ngaySinh, queQuan);
        this.luongCung=luongCung;
        this.thuong=thuong;
        this.phat=phat;
        this.lThuclinh=this.luongCung+this.thuong-this.phat;
    }
    
    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.print("Nhap luong cung: ");
        this.luongCung=sc.nextDouble();
        System.out.print("Nhap thuong: ");
        this.thuong=sc.nextDouble();
        System.out.print("Nhap phat: ");
        this.phat=sc.nextDouble();sc.nextLine();
        this.lThuclinh=this.luongCung+this.thuong-this.phat;
    }
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Luong cung: "+this.luongCung);
        System.out.println("Thuong: "+this.thuong);
        System.out.println("Phat: "+this.phat);
        System.out.println("Luong thuc linh: "+this.lThuclinh);
    }
    
    public double getLuongThucLinh()
    {
       return this.lThuclinh;
    }
    public static void main(String[] args)
    {
        CBGV dsCB[];
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong can bo :");
        int n=sc.nextInt();sc.nextLine();
        dsCB=new CBGV[n];
        for(int i=0;i < n;i++)
        {
            System.out.println("Nhap can bo thu "+(i+1)+": ");
            dsCB[i]=new CBGV();
            dsCB[i].nhapThongTin(sc);
        }
        
        System.out.println("Can bo co luong thuc linh >=8trieu:");
        for(int i=0;i < n;i++)
        {
            if(dsCB[i].getLuongThucLinh()>=8000000)
                dsCB[i].hienThongTin();
        }
    }
}
