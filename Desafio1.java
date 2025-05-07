import javax.swing.JOptionPane;

public class Xp {

    public static void main(String[] args) {
        String Nome;
        double XP;
        String Mensagem = "";
		
		Nome = JOptionPane.showInputDialog("Entre com o nome do jogador");
		XP = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da XP"));
		
		
		if (XP <= 1000) {
			Mensagem = "O jogador " + Nome + " é Ferro";
		}
		else if (XP >= 1001 && XP <= 2000) {
			Mensagem = "O jogador " + Nome + Nome + " é Bronze";
		}
		else if (XP >= 2001 && XP <= 5000) {
			Mensagem = "O jogador " + Nome + " é Prata";
		}
		else if (XP >= 5001 && XP <= 6000) {
			Mensagem = "O jogador " + Nome + " é Ouro";
		}
		else if (XP >= 6001 && XP <= 7000) {
			Mensagem = "O jogador " + Nome + " é Platina";
		}
		else if (XP >= 7001 && XP <= 8000) {
			Mensagem = "O jogador " + Nome + " é Diamante";
		}
		else if (XP >= 8001 && XP <= 9000) {
			Mensagem = "O jogador " + Nome + " é Ascendent";
		}
		else if (XP >= 9001 && XP <= 10000) {
			Mensagem = "O jogador " + Nome + " é Imortal";
		}
		else if (XP >= 10001) {
			Mensagem = "O jogador " + Nome + " é Radiante";
		} else {
			Mensagem = "Valor invalido";
	}	
		
    JOptionPane.showMessageDialog(null, Mensagem);
    }
}
