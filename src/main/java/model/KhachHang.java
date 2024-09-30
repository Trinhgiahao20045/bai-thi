package model;

/**
 *
 * Họ tên sinh viên: trịnh gia hào
 */
public class KhachHang {
    private String maso;
    private String hoten;
    private int sonhankhau;
    private double chisocu;
    private double chisomoi;            

    //constructor
    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int sonhankhau, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sonhankhau = sonhankhau;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    //setter và getter

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSonhankhau() {
        return sonhankhau;
    }

    public void setSonhankhau(int sonhankhau) {
        this.sonhankhau = sonhankhau;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

     
    
    //phương thức tính toán    

    public double getTieuThu()
    {
      //chisomoi-chisocu
      return chisomoi-chisocu;
    }
    
    public double getDinhMuc()
    {
        //sonhankhau*4
       return sonhankhau*4;
    }
    
    
    public double tinhTienTra()
    {
        //giaban+thue GTGT(5% gia ban) + TDVTN(25% gia ban)+ thua TDVTN(8% TDVTN)
        double tieuthu=getTieuThu();
        double gianuoc=0;
        double dinhmuc=getDinhMuc();
        
        double LuongNuocTieuThu=getTieuThu();
        double tientra=0;
        if(tieuthu<=dinhmuc){
            gianuoc=tieuthu*6700;   
        }else if(tieuthu<=dinhmuc +2 *sonhankhau){
            gianuoc=tieuthu*6700 +(tieuthu-dinhmuc)*12900;
        }else{
            gianuoc=tieuthu*6700 +2 * sonhankhau * 12900 +(tieuthu-dinhmuc - 2* sonhankhau)*14400;
        }
        //tinh thue
        gianuoc +=gianuoc*0.05+gianuoc*0.25+gianuoc*0.25*0.08;
       return gianuoc;
//        return 0;
     }         

}
