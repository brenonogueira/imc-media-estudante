
package poo;

public class Student extends Person {
    private String SR;
    private double note1, note2;
    private int frequency;

    
    
    public String getSR() {
        return SR;
    }

    public void setSR(String SR) {
        this.SR = SR;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    
    private double Average(){
        return (note1 + note2)/2;
    }
    
    
    public boolean isApproved(){
        if (Average() >= 7 && frequency >= 75) {
            return true;
        } else{ 
            return false;
        }
    }
    
    public String getInfoStudent() {
        return getInfo()+ "\n Average: "+Average()+ "\n Frequency: "+frequency + "\n Approved: "+isApproved() + "\n"+ "\n";
    }
    
}
