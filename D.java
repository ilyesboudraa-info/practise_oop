class D {
public int x;
D() {
x=3;
};
 D( int a){
this();
x=x+a;
};
D( int a, int b) {
this(b);
x= x-a;
} }
class DD {
public static void main (String[] args) {
D a=new D(5,6);
D b=a;
System.out.println(a.x);
} }

//resulta est 4
//le meme parceque private est accissible a subclasss
//