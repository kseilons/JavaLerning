// ����������:
class Base{
   // ��������� ����:
   String name;
   // �����������:
   Base(String txt){
      name=txt;
   }
   // ����� ��� ����������� �������� ����:
   void show(){
      System.out.println("��������� ����: "+name);
   }
}
// �������� ����������� Base:
class Alpha extends Base{
   // ������������� ����:
   int number;
   // �����������:
   Alpha(String txt,int n){
      // ����� ������������ �����������:
      super(txt);
      // ������������ �������� �������������� ����:
      number=n;
   }
   // ��������������� ������:
   void show(){
      // ����� ������ ������ �� �����������:
      super.show();
      // ����������� �������� �������������� ����:
      System.out.println("������������� ����: "+number);
   }
}
// �������� ����������� Alpha:
class Bravo extends Alpha{
   // ���������� ����:
   char symbol;
   // �����������:
   Bravo(String txt,int n,char s){
      // ����� ������������ �����������:
      super(txt,n);
      // ������������ �������� ����������� ����:
      symbol=s;
   }
   // ��������������� ������:
   void show(){
      // ����� ������ ������ �� �����������:
      super.show();
      // ����������� �������� ����������� ����:
      System.out.println("���������� ����: "+symbol);
   }
}
// ���������� �����:
class MyClass<X extends Base>{
   // ���� ����������� ����:
   X obj;
   // �����������:
   MyClass(X obj){
      // �������� ����:
      this.obj=obj;
   }
   // ����� ����������� ������:
   void show(){
      System.out.println("������ ������ MyClass");
      // ����� ������ �� ���� ����������� ����:
      obj.show();
   }
}
// ������� �����:
class GenTypeExtendingDemo{
   // ������� �����:
   public static void main(String[] args){
      // ������� ��������� �� ������ ����������� ������:
      MyClass<Alpha> A=new MyClass<>(new Alpha("Alpha",123));
      MyClass<Bravo> B=new MyClass<>(new Bravo("Bravo",321,'B'));
      // ����� ������ show() �� ��������:
      A.show();
      B.show();
   }
}