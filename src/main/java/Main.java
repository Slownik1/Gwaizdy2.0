
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class Main implements ActionListener {

    JTextField textMasa = new JTextField();
    JTextField textTemperatura = new JTextField();
    JTextField textNazwa = new JTextField();
    JTextField textNazwaKatalogowa = new JTextField();
    JTextField textDeklinacjaStopnie = new JTextField();
    JTextField textDeklinacjaMinuty = new JTextField();
    JTextField textDeklinacjaSekundy = new JTextField();
    JTextField textDeklinacjaCzesciSekundy = new JTextField();
    JTextField textRektensjaGodzina = new JTextField();
    JTextField textRektensjaMinuta = new JTextField();
    JTextField textRektensjaSekunda = new JTextField();
    JTextField textObserwowanaWielkosc = new JTextField();
    JTextField textObserwowanaWielkoscCzesc = new JTextField();
    JTextField textAbsolutnaWielkosc = new JTextField();
    JTextField textOdleglosc = new JTextField();
    JTextField textGwiazdozbior = new JTextField();
    String[] polkula = {"PN", "PD"};
    JComboBox comboPolkula = new JComboBox(polkula);
    JLabel uwagaLabel = new JLabel();

    public Main() {

        JFrame f = new JFrame();
        JLabel l = new JLabel();

        JLabel labelNazwa = new JLabel();
        labelNazwa.setText("Nazwa gwiazdy: ");
        textNazwa.setBounds(150, 20, 100, 20);
        labelNazwa.setBounds(20, 20, 100, 20);
        f.add(labelNazwa);
        f.add(textNazwa);



        JLabel labelNazwaKatalogowa = new JLabel();
        labelNazwaKatalogowa.setText("Nazwa katalogowa: ");
        textNazwaKatalogowa.setBounds(150, 50, 100, 20);
        labelNazwaKatalogowa.setBounds(20, 50, 100, 20);
        f.add(textNazwaKatalogowa);
        f.add(labelNazwaKatalogowa);



        JLabel labelDeklinacja = new JLabel();
        labelDeklinacja.setText("Deklinacja: ");
        textDeklinacjaStopnie.setBounds(150, 80, 30, 20);
        textDeklinacjaMinuty.setBounds(185, 80, 30, 20);
        textDeklinacjaSekundy.setBounds(220, 80, 30, 20);
        textDeklinacjaCzesciSekundy.setBounds(255,80, 30, 20);
        labelDeklinacja.setBounds(20, 80, 100, 20);
        f.add(textDeklinacjaCzesciSekundy);
        f.add(textDeklinacjaStopnie);
        f.add(textDeklinacjaMinuty);
        f.add(textDeklinacjaSekundy);
        f.add(labelDeklinacja);



        JLabel labelRektensja = new JLabel();
        labelRektensja.setText("Rektensja");
        textRektensjaGodzina.setBounds(150, 110, 30, 20);
        textRektensjaMinuta.setBounds(185, 110, 30, 20);
        textRektensjaSekunda.setBounds(220, 110, 30, 20);
        labelRektensja.setBounds(20,110, 100, 20);
        f.add(textRektensjaGodzina);
        f.add(textRektensjaMinuta);
        f.add(textRektensjaSekunda);
        f.add(labelRektensja);



        JLabel labelObserwowanaWielkosc = new JLabel();
        labelObserwowanaWielkosc.setText("Obserwowana wielkosc: ");
        textObserwowanaWielkosc.setBounds(150, 140, 30,20);
        textObserwowanaWielkoscCzesc.setBounds(185, 140, 30,20);
        labelObserwowanaWielkosc.setBounds(20, 140, 100, 20);
        f.add(textObserwowanaWielkosc);
        f.add(textObserwowanaWielkoscCzesc);
        f.add(labelObserwowanaWielkosc);



        JLabel labelAbsolutnaWielkosc = new JLabel();
        labelAbsolutnaWielkosc.setText("Absolutna wielkosc: ");
        textAbsolutnaWielkosc.setBounds(150, 170, 100,20);
        labelAbsolutnaWielkosc.setBounds(20,170, 100, 20);
        f.add(textAbsolutnaWielkosc);
        f.add(labelAbsolutnaWielkosc);



        JLabel labelOdleglosc = new JLabel();
        labelOdleglosc.setText("Odleglosc: ");
        textOdleglosc.setBounds(150,200,100,20);
        labelOdleglosc.setBounds(20, 200, 100,20);
        f.add(textOdleglosc);
        f.add(labelOdleglosc);



        JLabel labelGwiazdozbior = new JLabel();
        labelGwiazdozbior.setText("Gwiazdozbior");
        textGwiazdozbior.setBounds(150,230,100,20);
        labelGwiazdozbior.setBounds(20,230,100,20);
        f.add(textGwiazdozbior);
        f.add(labelGwiazdozbior);



        JLabel labelPolkula = new JLabel();
        labelPolkula.setText("Polkula: ");
        comboPolkula.setBounds(150, 260, 100,20);
        labelPolkula.setBounds(20, 260, 100,20);
        f.add(comboPolkula);
        f.add(labelPolkula);



        JLabel labelTemperatura = new JLabel();
        labelTemperatura.setText("Temperatura: ");
        textTemperatura.setBounds(150,290, 100,20);
        labelTemperatura.setBounds(20, 290, 100,20);
        f.add(textTemperatura);
        f.add(labelTemperatura);



        JLabel labelMasa = new JLabel();
        labelMasa.setText("Masa: ");
        textMasa.setBounds(150,320, 100,20);
        labelMasa.setBounds(20, 320, 100, 20);
        f.add(textMasa);
        f.add(labelMasa);



        JButton addButton = new JButton();
        addButton.setText("Dodaj gwiazde");
        addButton.setBounds(150, 350, 100, 40);
        addButton.addActionListener(this);
        f.add(addButton);



        uwagaLabel.setBounds(140, 380, 200, 50);
        f.add(uwagaLabel);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String stringNazwa="";
        String stringStopnie="";
        String stringRektensja="";

        if(!(textNazwa.getText()).matches("[A-Z]{3}\\d{3}"))
            uwagaLabel.setText("BLEDNA NAZWA");
        else
            stringNazwa = textNazwa.getText();

        if((Integer.parseInt(textDeklinacjaStopnie.getText())>90)||(Integer.parseInt(textDeklinacjaStopnie.getText())<0)) {
            uwagaLabel.setText("POPRAW STOPNIE");
        }else {
            stringStopnie += textDeklinacjaStopnie.getText();

            if ((Integer.parseInt(textDeklinacjaMinuty.getText()) > 60) || (Integer.parseInt(textDeklinacjaMinuty.getText()) < 0)) {
                uwagaLabel.setText("POPRAW STOPNIE");
            } else {
                stringStopnie += ":" + textDeklinacjaStopnie.getText();

                if ((Integer.parseInt(textDeklinacjaSekundy.getText()) > 60) || (Integer.parseInt(textDeklinacjaSekundy.getText()) < 0)) {
                    uwagaLabel.setText("POPRAW STOPNIE");
                } else {
                    stringStopnie += ":" + textDeklinacjaStopnie.getText();

                    if ((Integer.parseInt(textDeklinacjaCzesciSekundy.getText()) > 60) || (Integer.parseInt(textDeklinacjaCzesciSekundy.getText()) < 0)) {
                        uwagaLabel.setText("POPRAW STOPNIE");
                    } else {
                        stringStopnie += "," + textDeklinacjaStopnie.getText();
                    }
                }
            }
        }

        if((Integer.parseInt(textRektensjaGodzina.getText())>24)&&(Integer.parseInt(textRektensjaGodzina.getText())<0)){
            uwagaLabel.setText("POPRAW REKTENSJE");
        }else{
            stringRektensja+=textRektensjaGodzina;
            if((Integer.parseInt(textRektensjaMinuta.getText())>24)&&(Integer.parseInt(textRektensjaMinuta.getText())<0)){
                uwagaLabel.setText("POPRAW REKTENSJE");
            }else {
                stringRektensja += textRektensjaMinuta;
                if ((Integer.parseInt(textRektensjaSekunda.getText()) > 24) && (Integer.parseInt(textRektensjaSekunda.getText()) < 0)) {
                    uwagaLabel.setText("POPRAW REKTENSJE");
                } else {
                    stringRektensja += textRektensjaSekunda;
                }
            }
        }

    }

    public static void main(String[] args) {
        new Main();
    }

}
