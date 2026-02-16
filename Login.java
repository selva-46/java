import java.awt.*;

class Login
{
    public static void main(String[] args)
    {
        Frame f = new Frame();

        f.setTitle("Login Page");
        f.setSize(500, 300);
        f.setLayout(new GridLayout(4, 2));
        f.setVisible(true);

        Label l1 = new Label("User Name:");
        TextField t1 = new TextField(20);

        Label l2 = new Label("Password:");
        TextField t2 = new TextField(20);
        t2.setEchoChar('*');   // hides password

        Button b1 = new Button("Login");
        Button b2 = new Button("Logout");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
    }
}