import java.awt.*;

class ApplicationForm 
{
    public static void main(String args[]) {

        Frame f = new Frame();

        f.setTitle("Application Form");
        f.setSize(500, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        Label l1 = new Label("Enrollment Number");
        TextField t1 = new TextField(20);

        Label l2 = new Label("Student Name");
        TextField t2 = new TextField(20);

        Label l3 = new Label("Programme");
        TextField t3 = new TextField(20);

        Label l4 = new Label("Batch");
        TextField t4 = new TextField(20);

        Button b1 = new Button("Save");
        Button b2 = new Button("Cancel");

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(t4);
        f.add(b1); f.add(b2);
    }
}