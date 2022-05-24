package src;

import java.util.*;

class Person {
   private static int numInfected = 0;
   private static int numDeaths = 0;
   private static int totalPeople = 0;
   private int age;
   private int ageInDays;
   private int preCondition; //1-20 subtracted from immunity lvl
   private int immunityValue; //out of 100
   private boolean infected;
   private boolean recovered;
   
   public Person(){
      ageInDays = (int) (Math.random() * 29199);
      age = ageInDays / 365;
      if(0.8 < Math.random()){  // 20% chance for someone to have precondition
         preCondition = (int) ((Math.random() * 19) + 1);
      }
      else{
         preCondition = 0;
      }
      infected = false;
      recovered = false;
      totalPeople++;
   }

   public Person(int age, int preCondition) {
      this.age = age;
      this.preCondition = preCondition;
      infected = false;
      totalPeople++;
   }

   public void generateAge() {
      int rand = (int) (Math.random() * 29199);
      this.ageInDays = rand;
      this.age = rand/365;
   }

   public void infect() {
      infected = true;
      numInfected++;
   }
   
   public void survive() {
      infected = false;
      numInfected--;
      recovered = true;
   }

   public void die() {
      infected = false;
      numDeaths++;
      numInfected--;
      totalPeople--;
   }
   
   public int getAge(){
      return age;
   }
   
   public int getAgeInDays(){
      return ageInDays;
   }
   
   public int getPreCondition(){
      return preCondition;
   }
   
   public boolean getInfected(){
      return infected;
   }
   
   public int getImmunityValue(){
      return immunityValue;
   }
   
   public boolean getRecovered(){
      return recovered;
   }
}
