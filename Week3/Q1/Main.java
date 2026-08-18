/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Mother m= new Mother();
	    Child c1= new Child();
	    c1.setName("A");
	    Child c2= new Child();
	    c2.setName("B");
	    Child c3= new Child();
	    c3.setName("C");
	    Child c4= new Child();
	    c4.setName("D");
	    Child c5= new Child();
	    c5.setName("E");
	    
	    m.c[0]=c1;
	    m.c[1]=c2;
	    m.c[2]=c3;
	    m.c[3]=c4;
	    m.c[4]=c5;
	    m.show();
	}
}
