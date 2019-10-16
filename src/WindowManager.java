import javax.swing.*;
import java.awt.*;

public class WindowManager extends JFrame {

    private JMenuBar menuBar =new JMenuBar();
    private JMenu file=new JMenu("Fichier");
    private JMenu Edition =new JMenu("Edition");
    private JMenu About=new JMenu ("About");

    private JMenuItem Open = new JMenuItem("Ouvrir");
    private JMenuItem close = new JMenuItem("Fermer");
    private JMenuItem  Sauvegarder = new JMenuItem("Sauvegarder");
    private JMenuItem SauvegarderSous = new JMenuItem("Sauvegarder Sous");
    private JMenuItem Info = new JMenuItem("informations");

    private JButton ajouterBouton, supprimerBouton;
    private JLabel livreLabel,auteurLabel, anneeLabel,rangeeLabel;
    private JTextField livre,auteur, annee,rangee;





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

        Edition.add(Sauvegarder);
        Edition.add(SauvegarderSous);

        About.add(Info);



        menuBar.add(file);
        menuBar.add(Edition);
        menuBar.add(About);
        this.setJMenuBar(menuBar);

        //affichage tableau
        JPanel panTable=new JPanel();
        panTable.setBorder((BorderFactory.createTitledBorder("Tableau des livres")));
        JTable tableau = new JTable(new ModelOfTable());
        panTable.add(tableau, BorderLayout.CENTER);




        //affichage formulaire
        JPanel panForm=new JPanel();



        panForm.setPreferredSize(new Dimension(400,400));
        panForm.setBackground(Color.white);

        panForm.setBorder((BorderFactory.createTitledBorder("Formulaire d'interaction")));

        livreLabel=new JLabel("Livre : ");
        anneeLabel=new JLabel("Année : ");
        auteurLabel=new JLabel("Auteur: ");
        rangeeLabel=new JLabel("rangée : ");
        livre=new JTextField();

        annee=new JTextField();
        auteur=new JTextField();
        rangee=new JTextField();



        Box BLivre=Box.createHorizontalBox();
        BLivre.setPreferredSize(new Dimension(200,25));
        BLivre.add(livreLabel/*,RIGHT_ALIGNMENT*/);

        BLivre.add(livre);


        Box BAuteur=Box.createHorizontalBox();
        BAuteur.setPreferredSize(new Dimension(100,25));
        BAuteur.add(auteurLabel);
        BAuteur.add(auteur);


        Box BAnnee= Box.createHorizontalBox();
        BAnnee.setPreferredSize(new Dimension(100,25));
        BAnnee.add(anneeLabel);
        BAnnee.add(annee);

        Box BRangee= Box.createHorizontalBox();
        BRangee.setPreferredSize(new Dimension(100,25));
        BRangee.add(rangeeLabel);
        BRangee.add(rangee);

        Box haut =Box.createVerticalBox();

        haut.setAlignmentX(Component.CENTER_ALIGNMENT);

        haut.add(BLivre);
        haut.add(BAuteur);
        haut.add(BAnnee);
        haut.add(BRangee);

        panForm.add(haut);

        JPanel control = new JPanel();
        control.setBackground(Color.white);
        ajouterBouton=new JButton("<html><font color='green'>+</font></html>");
        supprimerBouton=new JButton("<html><font color='red'>-</font></html>");
        control.add(ajouterBouton);
        control.add(supprimerBouton);


        /*
        panForm.add(livreLabel);
        panForm.add(livre);
        panForm.add(anneeLabel);
        panForm.add(annee);
        panForm.add(auteurLabel);
        panForm.add(auteur);
        panForm.add(rangeeLabel);
        panForm.add(rangee);*/





        JPanel content = new JPanel();
        content.setBackground(Color.white);
        content.add(panTable);

        JPanel Form=new JPanel();
        Form.add(panForm);

        this.getContentPane().add(control,BorderLayout.SOUTH);
        this.getContentPane().add(content, BorderLayout.WEST);
        this.getContentPane().add(Form,BorderLayout.EAST);
        pack();
    }


}
