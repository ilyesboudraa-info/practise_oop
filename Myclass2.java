class Myclass2 {
static int n ;
void print() {
System.out.println(n);
} 


    public static void main(String[] args){
Myclass2 my1 = new Myclass2() ;
Myclass2 my2 = new Myclass2() ;/*
my1.print();//0

my2.print();//0*/
my2.n=3;
my1.print();//3

my2.print();//3

//System.out.println(my1 + " "+ my2);  //Myclass2@6d06d69c Myclass2@7852e922
Myclass2.n=10;
//Myclass2.print();// non-static method print() cannot be referenced from a static context
my2.print();
    }




}