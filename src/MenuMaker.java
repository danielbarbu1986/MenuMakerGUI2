import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuMaker extends JFrame {

private JMenuBar menuBar;
private JMenu fileMenu;
private JMenuItem openItem;
private JMenuItem saveItem;
private JMenuItem exitItem;
private JList listBox;
private DefaultListModel listModel;
private JScrollPane scrollPane;
private JPanel panel;
private JLabel label1;
private JLabel label2;
private JLabel label3;
private JButton button1;
private JButton button2;
private JButton button3;

public MenuMaker() {
setTitle("Example Frame");
setSize(800, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Initialize menu components
menuBar = new JMenuBar();

fileMenu = new JMenu("File");

openItem = new JMenuItem("Open");
saveItem = new JMenuItem("Save");
exitItem = new JMenuItem("Exit");

// Add menu items to file menu
fileMenu.add(openItem);
fileMenu.add(saveItem);
fileMenu.addSeparator();
fileMenu.add(exitItem);

// Add file menu to menu bar
menuBar.add(fileMenu);

// Add menu bar to frame
setJMenuBar(menuBar);

// Initialize list box and add to frame
listModel = new DefaultListModel<>();
listModel.addElement("Item 1");
listModel.addElement("Item 2");
listBox = new JList<>(listModel);
scrollPane = new JScrollPane(listBox);
add(scrollPane, BorderLayout.CENTER);

// Initialize panel and add to frame
panel = new JPanel();
panel.setLayout(new GridLayout(1, 3));

label1 = new JLabel("Label 1");
label2 = new JLabel("Label 2");
label3 = new JLabel("Label 3");

panel.add(label1);
panel.add(label2);
panel.add(label3);

// Initialize buttons and add to panel
button1 = new JButton("Button 1");
button2 = new JButton("Button 2");
button3 = new JButton("Button 3");

panel.add(button1);
panel.add(button2);
panel.add(button3);

add(panel, BorderLayout.NORTH);

// Initialize status bar and add to frame
JLabel statusLabel = new JLabel("Status Bar");
add(statusLabel, BorderLayout.SOUTH);

// Add action listeners to menu items
openItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "Open clicked");
}
});

saveItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "Save clicked");
}
});

exitItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
}

public static void main(String[] args) {
MenuMaker frame = new MenuMaker();
frame.setVisible(true);
}
}

