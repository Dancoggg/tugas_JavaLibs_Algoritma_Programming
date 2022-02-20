import javax.swing.*;
import java.util.*;

public class JavaLibs5026211178 {

    public static void main(String[] args){

        // greetings
        JOptionPane.showMessageDialog(null, "Hello there!!!");
        String greetings = JOptionPane.showInputDialog("How are you ?");
        JOptionPane.showMessageDialog(null, "you good huh? thank god!");

        // first question
        String userName = JOptionPane.showInputDialog("By the way..., What's your name buddy?");
        JOptionPane.showMessageDialog(null,"Hy, nice to meet you"+" "+userName+ ", such a cool name tho!");

        // first in a half question
        String gender = JOptionPane.showInputDialog("And...are you male or female ?");

        // sec question
        String userAge = JOptionPane.showInputDialog("How old are you "+ userName+" ?");
        int  userAgeInt = Integer.parseInt(userAge);

        if (userAgeInt < 30 && userAgeInt > 0){
            JOptionPane.showMessageDialog(null, "ahh, i see..");
        } else if (userAgeInt >= 30 && userAgeInt <= 100){
            if(gender.equals("male")){
                JOptionPane.showMessageDialog(null, "You are "+userAgeInt+" years old ?, Alright, maybe i should call you Mr."+userName);
            } else if (gender.equals("female")) {
                JOptionPane.showMessageDialog(null, "You are " + userAgeInt + " years old ?, Alright, maybe i should call you Mrs." + userName);
            } else {
                JOptionPane.showMessageDialog(null, "You are " + userAgeInt + " years old ?, Alright, maybe i should call you Mr/Mrs." + userName);
            }
        } else if (userAgeInt > 100){
                JOptionPane.showMessageDialog(null, "WOW, " + userAgeInt + " years old ?, you are joking right ? ");
        } else {
            JOptionPane.showMessageDialog(null,".....");
        }

        String askingMathQuestion = JOptionPane.showInputDialog("Are you smart ? (yes or no)");
        if (askingMathQuestion.equalsIgnoreCase("yes")){
            JOptionPane.showMessageDialog(null, "ahh i see..prove it!");
        } else {
            JOptionPane.showMessageDialog(null, "dont lie to me!");
        }
        JOptionPane.showMessageDialog(null, "i will give you the hardest math!");
        JOptionPane.showMessageDialog(null, "let see if you can beat this up!");
        String mathQuestion =  JOptionPane.showInputDialog("Miley buys an assorted box of chocolates that contains 18.05 ounces of dark chocolate and 30.02\n" +
                "ounces of milk chocolate. How much do the chocolates weigh in total? (use dot (.) instead of comma (,))");
        double mathQuestion2 = Double.parseDouble(mathQuestion);
        if (mathQuestion2 == 48.7){
            JOptionPane.showMessageDialog(null, "damnnn, Nikola Tesla must be very proud of you!!");
        } else {
            JOptionPane.showMessageDialog(null,"the answear is 48.7 buddy, its alright, its just chocolates box...dont take it personal");
        }


        // third question
        JOptionPane.showMessageDialog(null, "Do me a favor");
        JOptionPane.showMessageDialog(null, "I will tell you a funny story, but before i tell you the story...");
        String askingAboutAgreement = JOptionPane.showInputDialog("Do you mind if i ask you some questions "+userName+" ?"+" yes or no");

        if (askingAboutAgreement.equalsIgnoreCase("yes")){
            JOptionPane.showMessageDialog(null, "just answear all the question with just one word only okay");
            JOptionPane.showMessageDialog(null, "Lets begin!!!");
        } else{
            JOptionPane.showMessageDialog(null, "Woopss, you can't run buddy! mwehehehe");
            JOptionPane.showMessageDialog(null, "just answear all the question with just one word only okay");
            JOptionPane.showMessageDialog(null, "Lets begin!!!");
        }

        // Final question
        String one = JOptionPane.showInputDialog("what is your favorite place ?");
        String two = JOptionPane.showInputDialog("What is your favorite planet ?");
        String three = JOptionPane.showInputDialog("What did you do when you are in free time ?");
        String four = JOptionPane.showInputDialog("When you were a child, what is your biggest wishes from birthday gift ?");
        String five  = JOptionPane.showInputDialog("What is your favorite drink ?");
        String six = JOptionPane.showInputDialog("If you are the richest man alive and you also have intrest in technology , what a thing do you want to invent? (rocket, robot, etc)");

        JOptionPane.showMessageDialog(null, "first, i wanted to say thanks for your time to answear all my question...");
        JOptionPane.showMessageDialog(null, "but before we end this up, i promise you that i will tell a funny story..");
        JOptionPane.showMessageDialog(null, "last but not least..goodbye " + userName +", and please enjoy the story..");
        JOptionPane.showMessageDialog(null, "hope you like it :)");

        // the story
        JOptionPane.showMessageDialog(null,"The one person in the world that will give you equal love and devotion like your parents and lovers \nis your best friend. My best friend is "+userName+". His favorite 		place is "+one+". "+userName+" also helps me in my \nstudies. We also live in the same planet called "+two+". My best friend "+userName+" and I spend most of the time together \ndoing "+three+". We enjoy our life according to our needs and wishes."+
                "My best friend is the person on whom I can truly count \non all through my life. Whenever I need "+four+" or  "+five+", my best friend is always there for me.\nWe have lived moments together and have \ncreated a "+six+" that will remain throughout my life.");
    }
}