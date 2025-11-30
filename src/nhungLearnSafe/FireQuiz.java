/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhungLearnSafe;

import javax.swing.JOptionPane;

/**
 *
 * @author hong-nhung-nguyen
 */
public class FireQuiz extends Quiz implements Summarizable{
    private int questions;

    public FireQuiz(int questions, String title, String topic, String length) {
        super(title, topic, length);
        this.questions = questions;
    }

    public FireQuiz() {
        title = "Fire Safety Training";
        length = "12 minutes";
        topic = "Urban disaster";
        questions = 5;
    }

    public int getQuestions() {
        return questions;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }
    
    @Override
    public void showLesson(){
        JOptionPane.showMessageDialog(null,"""
                           If you or your child catch fire, do the 'stop, drop and roll' drill.
                           
                           You should:
                           
                           stop what you're doing
                           get on the ground and roll
                           
                           Use the ground and not a person's hands to suffocate the fire.
                           
                           If there is a fire blanket, this can also be used to place over you before doing the 'stop, drop and roll'.
                           """);
        JOptionPane.showMessageDialog(null,"IMPORTANT: Call 112 or 999 immediately in an emergency");
        JOptionPane.showMessageDialog(null, """
                                            Your fire escape plan should include:
                                            
                                            1. Keep corridors, halls, doors and windows clear at all times.
                                            2. Raise the alarm. Wake everyone up and get everyone out the quickest way.
                                            3. Check doors with the back of your hand – do not open them if they are warm. This means the fire is on the other side.
                                            4. Only open the doors that you need to get out of the house.
                                            5. If there is smoke, crawl along near to the floor where the air will be cleaner.
                                            6. Do not look for the cause of the fire.
                                            7. Meet at an assembly point outside your home and make sure everyone is out.
                                            8. Call the fire brigade on 112 or 999 from a mobile phone or neighbour's home.
                                            9. Do not go back into your home until the fire brigade tells you it is safe.
                                            """);
        JOptionPane.showMessageDialog(null, """
                                            Fire extinguishers and fire blankets can be useful if fire breaks out in your home.
                                            
                                            If you have them, make sure:
                                            
                                            - you know how to use them
                                            - they are easy to get at
                                            """);
        JOptionPane.showMessageDialog(null, """
                                            Children do not understand danger, so supervise them at all times.
                                            Do not expect them to be able to look after themselves around fires.
                                            Supervise children around fire hazards such as:
                                            
                                            - candles
                                            - stoves
                                            - open fires
                                            - heaters
                                            - barbecues
                                            - chip pans
                                            - electrical equipment
                                            """);
    }
    
    @Override
    public void summarize(){
        JOptionPane.showMessageDialog(null,"Title: "+title+"\n"+
                "Length: "+ length + "\n"+
                "Topic: "+ topic + "\n"+
                "Number of questions: "+ questions);
    }
}
