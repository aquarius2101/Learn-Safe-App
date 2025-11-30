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
public abstract class Quiz {
    protected String title, topic, length;

    public Quiz(String title, String topic, String length) {
        this.title = title;
        this.topic = topic;
        this.length = length;
    }

    public Quiz() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
    
    public abstract void showLesson();
}
