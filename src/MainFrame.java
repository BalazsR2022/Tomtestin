import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame {
    InputPanel tomegPanel;
    InputPanel magassagPanel;
    InputPanel indexPanel;
    JPanel buttonPanel;

    public MainFrame() { // itt állítunk semmit, csak meghívjuk
        this.initComponent();
        this.addComponent();
        this.setFrame();
    }
    private void initComponent(){
        this.tomegPanel = new InputPanel("Tömeg");
        this.magassagPanel = new InputPanel("Magasság");
        this.buttonPanel = new JPanel();
        this.indexPanel = new InputPanel("Testtömeg index");
    }

    private void addComponent(){
        this.add(this.tomegPanel);
        this.add(this.magassagPanel);
        this.add(this.buttonPanel);
        this.add(this.indexPanel);
    
    }
    private void setFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // itt állítjuk be a részleteket
        this.setSize(400, 300);
        this.setVisible(true);
    }
}
