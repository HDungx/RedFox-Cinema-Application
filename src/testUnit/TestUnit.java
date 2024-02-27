package testUnit;

import DAO.NhanVienDao;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nguyen Dung
 */
public class TestUnit {
    @Test
    public void testInsertNV(){
        String manv = "PS111";
        String tennv = "Nguyễn ABC";
        String sdt = "0902321231";
        String namsinh = "1999";
        String chucvu = "Nhân viên";
        String email="nguyenabc@gmail.com";
        NhanVienDao nvdao= new NhanVienDao();
        boolean expectResult=true;
        boolean result= nvdao.validate(manv, tennv, sdt, namsinh, email, chucvu);
        Assert.assertEquals(expectResult,result);
    }
    
}
