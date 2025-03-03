// ���������� ���������:
interface MyMethods<X>{
   X get();
   void set(X arg);
}
// �������� ����������� ������ �� ������
// ����������� ����������:
class MyClass<X> implements MyMethods<X>{
   // �������� ���� ����������� ����:
   private X value;
   // �������� ������� �� ����������:
   public X get(){
      return value;
   }
   public void set(X arg){
      value=arg;
   }
   // ����� ��� ����������� �������� ����:
   void show(){
      System.out.println("�������� ����: "+get());
   }
   // �����������:
   MyClass(X arg){
      value=arg;
   }
}
// ������� �����:
class GenInterfaceDemo{
   // ������� �����:
   public static void main(String[] args){
      // ������������ ����������:
      MyMethods ref;
      // �������� �������� �� ������ ����������� ������:
      MyClass<Integer> A=new MyClass<>(123);
      MyClass<Character> B=new MyClass<>('A');
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