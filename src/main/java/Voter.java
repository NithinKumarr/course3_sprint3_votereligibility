public class Voter {
    private String name;
    private int age;
    static final int Voter_Eligible_Age=18;

    public Voter(){
        this.name="nithin";
        this.age=20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    String getAgeCriteria(){
        if(getAge()>=Voter_Eligible_Age){
            System.out.println(getName()+ "    Is Eligible to Vote ");}
        else if (getAge()>=0 && getAge()<Voter_Eligible_Age){
            System.out.println(getName()+ "   Is not Eligible to Vote");}
        else if (getAge()<0){
            System.out.println("age can not be Negative");}
        return null;
    }
}
