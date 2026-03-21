class person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        person p = new person();
        p.setName("John");
        p.setAge(30);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}