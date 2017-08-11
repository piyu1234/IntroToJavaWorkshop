import javax.swing.JOptionPane;

public class quizgame {
public static void main(String[] args) {
String harryPotter=JOptionPane.showInputDialog("What is the girl's name in Harry Potter?");
if(harryPotter.equals("Hermione Granger")){
JOptionPane.showMessageDialog(null, "Great Job!");
}

String ron=JOptionPane.showInputDialog("What is Ron's sister's name?");
if(ron.equals("Ginny")){
JOptionPane.showMessageDialog(null, "Awesome!");
}

String team=JOptionPane.showInputDialog("What is the name of the village that all of the kids got?");
if(team.equals("Griffindor")){
JOptionPane.showMessageDialog(null, "Amazing!");
}

String draco=JOptionPane.showInputDialog("Who is Draco Malfoy?");
if(draco.equals("He is Harry Potter's biggest rival")){
JOptionPane.showMessageDialog(null, "Wonderful!");	
}








}
}