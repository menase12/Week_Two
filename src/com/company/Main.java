package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
                // write your code here
                //basic information
                String yes="";
                Scanner keyboard = new Scanner(System.in);
                Scanner choice=new Scanner(System.in );
                ArrayList<Basic_info> thePersonInfo = new ArrayList<Basic_info>();
                Exper_iance newList;
                School newPerson;


                Basic_info person = new Basic_info();
                System.out.print("Please enter your First name: ");
                person.setFirstName(keyboard.nextLine());
                System.out.print("Enter you last name: ");
                person.setLastName(keyboard.nextLine());
                System.out.print("Provide your email address: ");
                person.setEmail(keyboard.nextLine());

                //School
                Scanner input = new Scanner(System.in);
                ArrayList<School> information = new ArrayList<School>();
                School ofPerson = new School();
                do {
                    ofPerson = new School();
                    System.out.print("Please enter your education below");
                    System.out.println("\n");
                    System.out.println("Please state your school: ");
                    ofPerson.setSchool(input.nextLine());
                    System.out.print("Please tell your major: ");
                    ofPerson.setMajor(input.nextLine());
                    System.out.print("Please tell your degree level (BS or MS): ");
                    ofPerson.setLevel(input.nextLine());
                    System.out.print("please tell your graduation year (yyyy) format: ");
                    ofPerson.setGraduatedYear(input.nextLine());
                    do {

                   System.out.print("Would you like to add more school? (Y/N)");
                    yes=keyboard.nextLine();
                    if(!yes.equalsIgnoreCase("y")&& !yes.equalsIgnoreCase("n"))
                    {
                        System.out.println("Invalid option. Please enter 'Y' or 'N' ");
                    }

                    }while(!yes.equalsIgnoreCase("y")&&!yes.equalsIgnoreCase("n"));
                    information.add(ofPerson);
                }while(yes.equalsIgnoreCase("y"));
        System.out.println("\n");
                //experience
                Scanner experience = new Scanner(System.in);
                ArrayList<Exper_iance> experienceList= new ArrayList<Exper_iance>();
                Exper_iance thePerson = new Exper_iance();
                System.out.print("\n");
                System.out.println("Experience");
                System.out.println("Please enter your experience below ");
                do {
                    thePerson = new Exper_iance();
                    //experienceList.add(thePerson);
                    System.out.println("Please tell where did you work before: ");
                    thePerson.setWhere(experience.nextLine());
                    //experienceList.add(thePerson);
                    System.out.print("Please tell your position: ");
                    thePerson.setPosition(experience.nextLine());
                    //experienceList.add(thePerson);
                    System.out.print("For how long you worked? (Please enter joined year and after your last year) ");
                    thePerson.setDate(experience.nextLine());
                    //experienceList.add(thePerson);
                    thePerson.setDate2(experience.nextLine());
                    //experienceList.add(thePerson);
                    System.out.print("please tell what was your duty: ");
                    thePerson.setDuty(experience.nextLine());
                    //experienceList.add(thePerson);
                    System.out.print("would you like to add more? (Y/N) ");
                    experienceList.add(thePerson);
                    yes=choice.nextLine();

                }while(yes.equalsIgnoreCase("y"));
        System.out.println("\n");
                //Skill
        Scanner skill = new Scanner(System.in);
        ArrayList<Skill>skillList=new ArrayList<Skill>();
        Skill theCandidate = new Skill();
        System.out.println("\n");
        System.out.println("Please enter your skill below");
        do{
            theCandidate = new Skill();
        theCandidate.setSkill_set1(skill.next());
        //theCandidate.setSkill_set2(skill.next());
            System.out.println("Would you like to add more skills (Y/N)");
            skillList.add(theCandidate);
        yes=choice.nextLine();
        }while(yes.equalsIgnoreCase("y"));



        System.out.println("==============================================================");
        System.out.println(person.getFirstName()+" "+person.getLastName()+"\n"+person.getEmail());
        System.out.print("\n");
        System.out.println("Education");
        System.out.println("==============================================================");
        for(School eachSchool: information)
        {
            System.out.println(eachSchool.getLevel()+ " in " + eachSchool.getMajor()+",\n"+eachSchool.getSchool()+", "+eachSchool.getGraduatedYear());
        }
        System.out.println("Experiance");
        System.out.println("==============================================================");
        for (Exper_iance eachDuty: experienceList) {
            System.out.println(eachDuty.getPosition() + "\n" + eachDuty.getWhere() + "," + eachDuty.getDate() + " - " + eachDuty.getDate2());
            System.out.println("- Duty: "+eachDuty.getDuty());
        }
        System.out.println("Skills");
        System.out.println("=============================================================");
        for(Skill eachSkill: skillList) {
            System.out.print(eachSkill.getSkill_set1() + "\n");
        }
            }
}


