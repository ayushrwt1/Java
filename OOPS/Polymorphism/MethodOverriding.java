class parent {
    void show()
    {
        System.out.println("Parent class method");
    }
}

 class child extends parent {
    void show()
    {
        System.out.println("Child class method");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        parent pa = new parent();
        pa.show();
        parent p = new child();
        p.show();
        child c = new child();
        c.show();
    }
}
