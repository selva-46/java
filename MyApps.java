import java.awt.*;

class MyApps
{
    public static void main(String args[])
    {
Frame f = new Frame();
f.setTitle("My Apps");
f.setSize(400, 400);
f.setVisible(true);
f.setLayout(null);

Label l1 = new Label("Takshashila University");
f.add(l1);

l1.setBounds(150, 20, 250, 30);
Label l2 = new Label("TN");
f.add(l2);

l2.setBounds(408, 50, 30, 30);

Label l3 = new Label("Application form 2027");
f.add(l3);

l3.setBounds(150, 120, 250, 30);

Label l4 = new Label("Application no");
f.add(l4);

TextField t1 = new TextField(20);
f.add(t1);

l4.setBounds(100, 200, 250, 30);
t1.setBounds(200, 200, 250, 30);

Label l5 = new Label("Student name");
TextField t2 = new TextField(20);

f.add(l5);
f.add(t2);

l5.setBounds(100, 250, 250, 30);
t2.setBounds(200, 250, 250, 30);

Label l6 = new Label("Programme");
TextField t3 = new TextField(20);

f.add(l6);
f.add(t3);

l6.setBounds(100, 300, 250, 30);
t3.setBounds(200, 300, 250, 30);

Button b1 = new Button("Save");
f.add(b1);
b1.setBounds(200, 350, 250, 30);
    }
}