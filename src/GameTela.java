import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameTela  extends JFrame{
    private JComboBox comboOpcao;
    private JTextField textRival;
    private JButton btnJogar;
    public JPanel panelGame;
public GameTela() {
    btnJogar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            Integer selecionadoAdversario = random.nextInt(3);

            if(comboOpcao.getSelectedIndex()  == 0){
                if (selecionadoAdversario == 0){
                    textRival.setText("Pedra");
                    JOptionPane.showMessageDialog(null,"Empatou");

                }
                else if (selecionadoAdversario == 1){
                    textRival.setText("Papel");
                    JOptionPane.showMessageDialog(null,"Você Perdeu");

                }else {
                    textRival.setText("Tesoura");
                    JOptionPane.showMessageDialog(null," Você Venceu");
                }}


            else if(comboOpcao.getSelectedIndex()  == 1){
                if (selecionadoAdversario == 0){
                    textRival.setText("Pedra");
                    JOptionPane.showMessageDialog(null,"Você Ganhou");
                }
                else if (selecionadoAdversario == 1){
                    textRival.setText("Papel");
                    JOptionPane.showMessageDialog(null,"Empatou");
                }else {
                    textRival.setText("Tesoura");
                    JOptionPane.showMessageDialog(null,"Você Perdeu");
                }}

            else if(comboOpcao.getSelectedIndex()  == 2){
                if (selecionadoAdversario == 0){
                    textRival.setText("Pedra");
                    JOptionPane.showMessageDialog(null,"Você Perdeu");
                }
                else if (selecionadoAdversario == 1){
                    JOptionPane.showMessageDialog(null,"Você ganhou");
                    textRival.setText("Papel");
                }else {
                    JOptionPane.showMessageDialog(null,"Empatou");
                    textRival.setText("Tesoura");
                }
            }
        }
    });
}
}
