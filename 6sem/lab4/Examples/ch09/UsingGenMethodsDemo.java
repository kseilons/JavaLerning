// ����� � ���������� �������:
class MyClass{
   // ��������� ����:
   String name;
   // ���������� �����:
   <X> void show(X arg){
      System.out.println(name+": "+arg);
   }
   // �����������:
   MyClass(String txt){
      name=txt;
   }
}
// ������� �����:
class UsingGenMethodsDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ��������:
      MyClass A=new MyClass("������ A");
      MyClass B=new MyClass("������ B");
      // ����� ���������� ������� �� ������ ��������:
      A.show(123);
      A.show("Alpha");
      A.show('A');
      B.show(123);
      B.show("Bravo");
      B.show('B');
   }
}