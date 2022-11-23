// app12_6.java,���ɮ׸m��pack6��Ƨ���
package pack6.subpack1.subsubpack;  // �Napp12_6���O�ǤJpackage pack6��
import pack6.subpack1.CCircle;   // 匯入其他檔案
import pack6.subpack2.CRectangle;   // ���Jpack6.subpack2�̪�CRectangle���O

class CStyle{
	public int style;
	public CStyle(int n) {
		style = n;
		//將style設為n
		System.out.println("style"+style);
		//輸出style
	}
}
public class app12_6
{
   public static void main(String args[])
   {
	  CStyle cs = new CStyle(1);//設置style為1
      CCircle cir=new CCircle();
      CRectangle rect=new CRectangle();
      cir.show();
      rect.show();
   }
}
