package src;

import java.util.*;

public class Person {
   private static int numCases = 0;
   private static int numDeaths = 0;
   private static int totalPeople = 0;
   private static int year = 0;
   private int age;
   private boolean preCondition;
   private boolean infected;

   public Person(int age, boolean preCondition) {
      this.age = age;
      this.preCondition = preCondition;
      infected = false;
      totalPeople++;
   }

   public void generateAge() {
      int rand = (int) ((Math.random() * 79) + 1);
      this.age = rand;
      if (year >= 1) {
         age += year;
      }
      if (age > 80) {
         die();
      }
   }

   public void infect() {
      int rand = (int) (Math.random() + 1);
      if (rand == 1) {
         this.infected = true;
      }
   }

   public void die() {
      this.age = 0;
      this.preCondition = false;
      this.infected = false;
      totalPeople--;
   }
}
