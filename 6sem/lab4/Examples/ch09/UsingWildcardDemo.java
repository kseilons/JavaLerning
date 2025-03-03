// ���������� �����:
class MyClass<T>{
   // ���� ����������� ����:
   T value;
   // �����������:
   MyClass(T val){
      value=val;
   }
}
// ������� �����:
class UsingWildcardDemo{
   // ����������� ���������� �����
   // (������������ �������� ����������� ����):
   static <T> void show(MyClass<T> obj){
      System.out.println("����� ������ show():");
      // ����������� �������� ����:
      System.out.println(obj.value);
   }
   // ����������� �����, � ������� ������������
   // ���������� �����������:
   static void display(MyClass<?> obj){
      System.out.println("����� ������ display():");
      // ����������� �������� ����:
      System.out.println(obj.value);
   }
   // ������� �����:
   public static void main(String[] args){
      // ��� �������� ������� ���� ������� ��������
      // ��� ����������� ����:
      MyClass<Integer> A=new MyClass<>(100);
      // ��� �������� ������� �� ������� ��������
      // ��� ����������� ����:
      MyClass B=new MyClass<>('B');
      // ��� �������� ������� ������������
      // ���������� �����������:
      MyClass<?> C=new MyClass<>("������ �");
      // ������� ������ ������� show() � display()
      // � ������� �����������:
      show(A);
      display(A);
      show(B);
      display(B);
      show(C);
      display(C);
   }
}