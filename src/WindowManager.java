import javax.swing.*;
import java.awt.*;

public class WindowManager extends JFrame {

    private JMenuBar menuBar =new JMenuBar();
    private JMenu file=new JMenu("Fichier");
    private JMenu Edition =new JMenu("Edition");
    private JMenu About=new JMenu ("About");

    private JMenuItem Open = new JMenuItem("Ouvrir");
    private JMenuItem close = new JMenuItem("Fermer");






    public WindowManager(){
        //caracteristiques de la fenetre
        this.setTitle("Gestion Livre");
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.initComponent();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public void initComponent(){
        //implementation du menu a completer
        file.add(Open);
        file.add(close);

        menuBar.add(file);
        this.setJMenuBar(menuBar);

        //affichage tableau
        JPanel panTable=new JPanel();
        JTable tableau = new JTable(new ModelOfTable());
        panTable.add(tableau, BorderLayout.CENTER);



        JPanel content = new JPanel();
        content.setBackground(Color.white);
        content.add(panTable);


        this.getContentPane().add(content, BorderLayout.WEST);

    }


}
