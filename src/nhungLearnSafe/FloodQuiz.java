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
public class FloodQuiz extends Quiz implements Summarizable{
    private int questions;

    public FloodQuiz(int questions, String title, String topic, String length) {
        super(title, topic, length);
        this.questions = questions;
    }

    public FloodQuiz() {
        title = "Flood Safety Training";
        length = "15 minutes";
        topic = "Natural disaster";
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
        JOptionPane.showMessageDialog(null, """
                                            As part of planning and preparedness for a potential flooding event, you should
                                            
                                            1. Identify and stay informed via resources that provide regular updates and information on the weather and flooding risk.
                                            2. Create a flood kit that can be easily found if needed.
                                            3. Develop and maintain a plan for evacuation of your home or business.
                                            4. Write a list of your most valuable possessions and where they are stored.
                                            5. Consider how to communicate with loved ones or staff in your business in the event of a flood.
                                            """);
        JOptionPane.showMessageDialog(null, """
                                            Extra preparation for flooding is important if you are an elderly person, particularly if you are living alone.
                                            
                                            1. Plan an evacuation route and destination.
                                            2. Keep an up to date list of important and useful contact numbers e.g. family, neighbours, local health services, and emergency services.
                                            """);
        JOptionPane.showMessageDialog(null,"""
                                           Potential health threats associated with flooding:
                                           1. Drowning and Injury
                                           2. Infection from Food and Water Biological Contamination
                                           3. Electrical Hazards
                                           4. Chemical Contamination
                                           5. Carbon Monoxide Poisoning
                                           """);
        JOptionPane.showMessageDialog(null,"""
                                           How to protect your health against drowning and injury:
                                           - Do not underestimate the power and force of floodwater
                                           - Always remember to wear appropriate clothing/footwear and stay visible, especially in the dark.
                                           - Be extremely careful when walking, or if driving on flooded roads.
                                           - Children should never play near floodwater or around pumps or sandbags.
                                           """);
        JOptionPane.showMessageDialog(null,"""
                                           How to protect your health against infection and biological contamination:
                                           - Avoid contact with obviously contaminated water
                                           - Wash your hands before preparing or eating food
                                           - Clean all utensils, pots, crockery etc before food preparation
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
