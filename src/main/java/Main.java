
import javax.swing.*;
import java.lang.*;

public class Main  {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        JLabel l = new JLabel();

        JTextField textNazwa = new JTextField();
        JLabel labelNazwa = new JLabel();
        labelNazwa.setText("Nazwa gwiazdy: ");
        textNazwa.setBounds(150, 20, 100, 20);
        labelNazwa.setBounds(20, 20, 100, 20);
        f.add(labelNazwa);
        f.add(textNazwa);



        JTextField textNazwaKatalogowa = new JTextField();
        JLabel labelNazwaKatalogowa = new JLabel();
        labelNazwaKatalogowa.setText("Nazwa katalogowa: ");
        textNazwaKatalogowa.setBounds(150, 50, 100, 20);
        labelNazwaKatalogowa.setBounds(20, 50, 100, 20);
        f.add(textNazwaKatalogowa);
        f.add(labelNazwaKatalogowa);



        JTextField textDeklinacja = new JTextField();
        JLabel labelDeklinacja = new JLabel();
        labelDeklinacja.setText("Deklinacja: ");
        textDeklinacja.setBounds(150, 80, 100, 20);
        labelDeklinacja.setBounds(20, 80, 100, 20);
        f.add(textDeklinacja);
        f.add(labelDeklinacja);



        JTextField textRektensja = new JTextField();
        JLabel labelRektensja = new JLabel();
        labelRektensja.setText("Rektensja");
        textRektensja.setBounds(150, 110, 100, 20);
        labelRektensja.setBounds(20,110, 100, 20);
        f.add(textRektensja);
        f.add(labelRektensja);



        JTextField textObserwowanaWielkosc = new JTextField();
        JLabel labelObserwowanaWielkosc = new JLabel();
        labelObserwowanaWielkosc.setText("Obserwowana wielkosc: ");
        textObserwowanaWielkosc.setBounds(150, 140, 100,20);
        labelObserwowanaWielkosc.setBounds(20, 140, 100, 20);
        f.add(textObserwowanaWielkosc);
        f.add(labelObserwowanaWielkosc);



        JTextField textAbsolutnaWielkosc = new JTextField();
        JLabel labelAbsolutnaWielkosc = new JLabel();
        labelAbsolutnaWielkosc.setText("Absolutna wielkosc: ");
        textAbsolutnaWielkosc.setBounds(150, 170, 100,20);
        labelAbsolutnaWielkosc.setBounds(20,170, 100, 20);
        f.add(textAbsolutnaWielkosc);
        f.add(labelAbsolutnaWielkosc);



        JTextField textOdleglosc = new JTextField();
        JLabel labelOdleglosc = new JLabel();
        labelOdleglosc.setText("Odleglosc: ");
        textOdleglosc.setBounds(150,200,100,20);
        labelOdleglosc.setBounds(20, 200, 100,20);
        f.add(textOdleglosc);
        f.add(labelOdleglosc);



        JTextField textGwiazdozbior = new JTextField();
        JLabel labelGwiazdozbior = new JLabel();
        labelGwiazdozbior.setText("Gwiazdozbior");
        textGwiazdozbior.setBounds(150,230,100,20);
        labelGwiazdozbior.setBounds(20,230,100,20);
        f.add(textGwiazdozbior);
        f.add(labelGwiazdozbior);



        String[] polkula = {"PN", "PD"};
        JComboBox comboPolkula = new JComboBox(polkula);
        JLabel labelPolkula = new JLabel();
        labelPolkula.setText("Polkula: ");
        comboPolkula.setBounds(150, 260, 100,20);
        labelPolkula.setBounds(20, 260, 100,20);
        f.add(comboPolkula);
        f.add(labelPolkula);



        JTextField textTemperatura = new JTextField();
        JLabel labelTemperatura = new JLabel();
        labelTemperatura.setText("Temperatura: ");
        textTemperatura.setBounds(150,290, 100,20);
        labelTemperatura.setBounds(20, 290, 100,20);
        f.add(textTemperatura);
        f.add(labelTemperatura);



        JTextField textMasa = new JTextField();
        JLabel labelMasa = new JLabel();
        labelMasa.setText("Masa: ");
        textMasa.setBounds(150,320, 100,20);
        labelMasa.setBounds(20, 320, 100, 20);
        f.add(textMasa);
        f.add(labelMasa);



        JButton addButton = new JButton();
        addButton.setText("Dodaj gwiazde");
        addButton.setBounds(150, 350, 100, 40);
        f.add(addButton);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);

    }



}
