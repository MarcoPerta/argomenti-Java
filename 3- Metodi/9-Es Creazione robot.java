public class Droid{
  double batteryLevel;
  String name;

 public Droid(String droidName){
   name = droidName;
   batteryLevel = 100;
 }

 public void performTask(String task){
   System.out.println(name + " is performing task: " + task);

   batteryLevel = batteryLevel - 10;
 }

 public static void main(String[] args) {
  
   Droid newDroid = new Droid("Codey");

   System.out.println(newDroid);

   newDroid.performTask("dancing");
  }

  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
}

//Hello, I'm the droid: Codey
//Codey is performing task: dancing