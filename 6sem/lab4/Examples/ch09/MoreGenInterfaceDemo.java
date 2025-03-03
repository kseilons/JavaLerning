// ���������� ���������:
interface MyMethods<X>{
   X get();
   void set(X arg);
}
// �������� ������� ������ �� ������
// ����������� ����������:
class Alpha implements MyMethods<Integer>{
   // �������� ���� �������������� ����:
   private Integer value;
   // �������� ������� �� ����������:
   public Integer get(){
      return value;
   }
   public void set(Integer arg){
      value=arg;
   }
   // ����� ��� ����������� �������� ����:
   void show(){
      System.out.println("������������� ����: "+get());
   }
   // �����������:
   Alpha(Integer arg){
      value=arg;
   }
}
// �������� ������� ������ �� ������
// ����������� ����������:
class Bravo implements MyMethods<Character>{
   // �������� ���� ����������� ����:
   private Character value;
   // �������� ������� �� ����������:
   public Character get(){
      return value;
   }
   public void set(Character arg){
      value=arg;
   }
   // ����� ��� ����������� �������� ����:
   void show(){
      System.out.println("���������� ����: "+get());
   }
   // �����������:
   Bravo(Character arg){
      value=arg;
   }
}
// ������� �����:
class MoreGenInterfaceDemo{
   // ������� �����:
   public static void main(String[] args){
      // ������������ ����������:
      MyMethods ref;
      // �������� ��������:
      Alpha A=new Alpha(123);
      Bravo B=new Bravo('A');
      // ����� ������ �� ������� ������:
      A.show();
      // ������������ ���������� ������������� ��������:
      ref=A;
      // ����� ������ ����� ������������ ����������:
      ref.set(321);
      // ����� ������� �� �������� ������:
      A.show();
      B.show();
      // ������������ ���������� ������������� ��������:
      ref=B;
      // ����� ������ ����� ������������ ����������:
      ref.set('B');
      // ����� ������ �� ������� ������:
      B.show();
   }
}