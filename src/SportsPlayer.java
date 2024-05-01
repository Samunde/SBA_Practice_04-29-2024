import java.util.Arrays;

public class SportsPlayer {
    String firstName;
    String lastName;
    String position;
    int age;
    double height;
    int weight;
    int experience;
    String college;
    int salary;
    String team;



    public SportsPlayer(String firstName, String lastName, String position, int age, double height, int weight, int experience, String college, int salary, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.experience = experience;
        this.college = college;
        this.salary = salary;
        this.team = team;
    }

    public SportsPlayer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", experience=" + experience +
                ", college='" + college + '\'' +
                ", salary=" + salary +
                ", team='" + team + '\'' +
                '}';
    }




    public String firstAndLast(){


        return getFirstName() + " " + getLastName();
    }
    public String firstLastAndPosition(){

        return firstAndLast()+" "+getPosition();
    }
    public String firstLastAndSalary(){

        return firstAndLast()+ " "+getSalary();
    }

    public String firstLastAndTeam(){

        return firstLastAndPosition() +" "+getTeam();
    }
    public String[] lastNameThatStartWith(String Letter) {

        if (lastName.startsWith(Letter)) {
            return new String[]{lastName};
        }
        return new String[]{firstName, lastName};
    }
    public int getTotalPlayersFromCollege(String college){
        int count=0;
        if (getCollege().equals(college)) {
            count+=1;
        }

        return count;
    }

    public int getTotalPlayersWithAge(int age){
        int count=0;
        if (getAge() == age) {
            count+=1;
        }

        return count;
    }
    public int getTotalPlayersWithPosition(String position){
        int count=0;
        if (getPosition().equals(position)) {
            count+=1;
        }
        return count;
    }
    public int getTotalPlayersWithHeight(double height){
        int count=0;
        if (getHeight() == height) {
            count+=1;
        }
        return count;
    }
    public double getTotalPlayersWithWeight(double weight){
        int count=0;
        if (getWeight() == weight) {
            count+=1;
        }
        return count;
    }
    public int getTotalPlayersWithExperience(int experience){
        int count=0;
        if(getExperience()==experience) {
            count+=1;
        }
        return count;
    }

    public int[] getPlayersFromCollege(String college){
        int index=0;
        if(getCollege().equals(college)) {
            index++;
        }
        return new int[]{index};
    }

    public int[] getPlayersWithAge(int age){
        int index=0;
        if(getAge()==age) {
            index++;
        }
        return new int[]{index};
    }
    public int[] getPlayersWithPosition(String position){
        int index=0;
        if(getPosition().equals(position)) {
            index++;
        }
        return new int[]{index};
    }
    public double[] getPlayersWithHeight(double height){
        int index=0;
        if(getHeight()==height) {
            index++;
        }
        return new double[]{index};
    }
    public int[] getPlayersWithWeight(int weight){
        int index=0;
        if(getWeight()==weight) {
            index++;
        }
        return new int[]{index};
    }
    public int[] getPlayersWithExperience(int experience){
            int index=0;
            if(getExperience()==experience){
                index++;
            }
        return new int[]{index};
    }

    public int[] getPlayersWhoMake(int salary){
        int index=0;
        if(getSalary()==salary) {
            index++;
        }
        return new int[]{index};
    }

    public int convertPlayerHeightToCm(int height){
        int cm=0;
        if(getHeight()==height) {
            cm=height*30;
        }
        return cm;
    }
    public int convertPlayerWeightToKg(int weight){
        double kg=0.0;
        if(getWeight()==weight) {
            kg=weight*0.45;
        }

        return (int)kg;
    }

    public int[] teamsWithHighestSalary(){
        int index=0;
        for(int i=0;i<10;i++){
            Math.max(getSalary(),index);
            index++;
        }
        return  new  int[]{index};
    }
    public int[] teamsWithHighestAverageAge(){
        int index=0;
        for(int i=0;i<10;i++){
            Math.max(getAge(),index);
            index++;
        }
        return  new  int[]{index};
    }

    public int[] teamsWithMinimumAverageAge(){
        int index=0;
        for(int i=0;i<10;i++){
            Math.max(getAge(),index);
            index++;
        }
        return  new  int[]{index};
    }

    public int[] teamsWithMinimumAverageExperience(){
        int index=0;
        for(int i=0;i<10;i++){
            Math.min(getExperience(),index);
            index++;
        }
        return  new  int[]{index};
    }
    public int[] teamsWithHighestAverageExperience(){
        int index=0;
        for(int i=0;i<10;i++){
            Math.max(getExperience(),index);
            index++;
        }
        return  new  int[]{index};
    }
}
