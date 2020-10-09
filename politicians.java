import java.util.*;
import java.util.Scanner;
import java.io.*;
class politicians{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
politician p=new politician();
System.out.println("enetr the politician name");
String name=in.nextLine();
p.set_name(name);
System.out.println(p.get_name());
}
    
}
class politician{
    String name,country,state,district,party,politician_type;
    public void set_name(String name){
    this.name=name;
    }
    public String get_name()
    {
        return this.name;
    }
}