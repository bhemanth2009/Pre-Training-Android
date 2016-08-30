// ---------------PersonalInformation.java-----------------

import java.lang.*;
class Person
{	private String name;
	private String address;
	Person( String name, String address)
	{	this.name=name; this.address=address;
	}
	public String getName(){ return name;}
	public String getAddress(){ return address;}
	public void setAddress(String address)
	{ this.address=address;}
	public String toString()
	{ return "Person[name="+name+",address="+address+"]"; 	}
}
class Student extends Person
{	private String program; private int year;private double fee;
	Student(String name,String address,String program, int year, double fee)
	{ super(name,address);
	  this.year=year; this.program=program;   this.fee=fee;
	}
	public String getProgram(){ return program;}
	public void setProgram(String program)
	{ this.program=program; }
	public int getYear(){ return year;}
	public void setYear(int year)
	{ this.year=year; }
	public double getFee(){ return fee; }
	public void setFee(double fee)
	{ this.fee=fee; }
       public String toString()
	{  return "Student[Person[name="+getName()+",address="+getAddress()+"],program="+program+",year="+year+",fee="+fee+"]";
	}
}

class Staff extends Person
{	private String school; 	private double pay;
	Staff(String name,String address,String school, double pay)
	{ super(name,address);
	  this.school=school;  this.pay=pay;
	}
	public String getSchool(){ return school;}
	public void setSchool(String school )
	{ this.school=school; }
	
	public double getPay(){ return pay; }
	public void setPay(double pay)
	{ this.pay=pay; }
       public String toString()
	{  return "Staff[Person[name="+getName()+",address="+getAddress()+"],school="+school+",pay="+pay+"]";}
}
public class PersonalInformation
{
	public static void main(String a[])
	{ Staff stf=new Staff("HEMANTH","GUNTUR","IT",70000);
	  System.out.println(" --------Staff Information using Constructor----");
        System.out.println(" --------Initialized values of Staff using constructor------"); 
	System.out.println(""+stf);
	 System.out.println(" --------seting and geting values of Staff using set and get methods-------");
	stf.setAddress("HYD");
	stf.setSchool("COMPUTER SCIENCES");
	stf.setPay(60000);
System.out.println(" --------Staff Information using set and get methods------------");
	System.out.println("NAME :"+stf.getName()+"\nADDRESS : "+stf.getAddress()+"\nSCHOOL :"+stf.getSchool()+"\nPAY  :"+stf.getPay()); 
           Student std=new Student("XYZ","RVRJC","B.TECH",2,35000);
	System.out.println(" --------Initialized values of Student using constructor-------"); 

	   System.out.println(""+stf);

	 System.out.println(" --------seting and geting values of Student using set and get methods-------");

	std.setAddress("BZA");
	std.setProgram("M.Tech");
	std.setYear(1);
	std.setFee(50000);
	System.out.println(" --------STUDENT Information using set and get methods----------");
	System.out.println("NAME :"+std.getName()+"\nADDRESS : "+std.getAddress()+"\nPROGRAM :"+std.getProgram()+"\nYEAR :"+std.getYear()+"\nFEES  :"+std.getFee()); 
	}
}


/* Execution and Output
E:\ANDROID\ASSIGNMENT-1>javac PersonalInformation.java
E:\ANDROID\ASSIGNMENT-1>java PersonalInformation
 --------Staff Information using Constructor------------
 --------Initialized values of Staff using constructor------------
Staff[Person[name=HEMANTH,address=GUNTUR],school=IT,pay=70000.0]
 --------seting and geting values of Staff using set and get methods------------

 --------Staff Information using set and get methods------------
NAME :HEMANTH
ADDRESS : HYD
SCHOOL :COMPUTER SCIENCES
PAY  :60000.0
 --------Initialized values of Student using constructor------------
Staff[Person[name=HEMANTH,address=HYD],school=COMPUTER SCIENCES,pay=60000.0]
 --------seting and geting values of Student using set and get methods----------
 --------STUDENT Information using set and get methods------------
NAME :XYZ
ADDRESS : BZA
PROGRAM :M.Tech
YEAR :1
FEES  :50000.0
E:\ANDROID\ASSIGNMENT-1>   */
