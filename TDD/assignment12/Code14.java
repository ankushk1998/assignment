package assignment12;

public class Code14 implements Cloneable { int id ;
String name;
public Code14(int id, String name) {
    super();
    this.id = id;
    this.name = name;
}
public Object clone ()throws CloneNotSupportedException
{
    return super.clone();
}
public static boolean checkClone(Code14 s1,Code14 s2)
{
    if (s1.id==s2.id &&s1.name==s2.name) {
        return true;
    } else 
    return false;


}

}


