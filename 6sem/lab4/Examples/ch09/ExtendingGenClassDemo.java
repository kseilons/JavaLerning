// ���������� �����:
class Base<X>{
   // ���������� ����:
   X data;
   // �����������:
   Base(X data){
      this.data=data;
   }
   // ����� ��� ����������� �������� ����:
   void show(){
      System.out.println(data);
   }
}
// �������� �� ������ ����������� ������ � �������������
// ����� ������ �����������:
class Alpha extends Base<Integer>{
   // �����������:
   Alpha(Integer n){
      // ����� ������������ �����������:
      super(n);
   }
   // ��������������� ������:
   void show(){
      System.out.print("������������� ����: ");
      // ����� ������ ������ �� �����������:
      super.show();
   }
}
// �������� �� ������ ����������� ������ � ���������
// ����� ������ �����������:
class Bravo extends Base<String>{
   // �����������:
   Bravo(String txt){
      // ����� ������������ �����������:
      super(txt);
   }
   // ��������������� ������:
   void show(){
      System.out.print("��������� ����: ");
      // ����� ������ ������ �� �����������:
      super.show();
   }
}
// �������� �� ������ ����������� ������ � ����������
// ����� ������ �����������:
class Charlie extends Base<Character>{
   // �����������:
   Charlie(Character s){
      // ����� ������������ �����������:
      super(s);
   }
   // ��������������� ������:
   void show(){
      System.out.print("���������� ����: ");
      // ����� ������ ������ �� �����������:
      super.show();
   }
}
// ������� �����:
class ExtendingGenClassDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ��������:
      Alpha A=new Alpha(123);
      Bravo B=new Bravo("������ B");
      Charlie C=new Charlie('C');
      // ����� ������ show() �� ������ ��������:
      A.show();
      B.show();
      C.show();
   }
}