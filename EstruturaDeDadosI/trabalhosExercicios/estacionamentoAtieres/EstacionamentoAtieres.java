package estacionamentoAtieres;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EstacionamentoAtieres {

	static JFrame janela = new JFrame("Sistema de controle do estacionamento");
	static JFrame janelaAjuda = new JFrame("Informações");
	static JPanel telaAjuda = new JPanel();
	static JPanel tela = new JPanel();

	static ImageIcon ImageMapa2 = new ImageIcon("img\\estacionamento.jpg");
	static ImageIcon ImageMapa1 = new ImageIcon("img\\piso1.jpg");
	static ImageIcon carro1 = new ImageIcon("img\\carro.jpg");


	static JButton botaoEntrada = new JButton("Entrada");
	static JButton botaoSaida = new JButton("Saída");
	static JButton botaoAjuda = new JButton("Ajuda");

	static JPanel carro1_1 = new JPanel();
	static JPanel carro1_2 = new JPanel();
	static JPanel carro1_3 = new JPanel();
	static JPanel carro1_4 = new JPanel();
	static JPanel carro1_5 = new JPanel();
	static JPanel carro1_6 = new JPanel();
	static JPanel carro1_7 = new JPanel();
	static JPanel carro1_8 = new JPanel();
	static JPanel carro1_9 = new JPanel();
	static JPanel carro1_10 = new JPanel();
	static JPanel carro1_11 = new JPanel();
	static JPanel carro1_12 = new JPanel();
	static JPanel carro1_13 = new JPanel();
	static JPanel carro1_14 = new JPanel();

	static JPanel carro2_1 = new JPanel();
	static JPanel carro2_2 = new JPanel();
	static JPanel carro2_3 = new JPanel();
	static JPanel carro2_4 = new JPanel();
	static JPanel carro2_5 = new JPanel();
	static JPanel carro2_6 = new JPanel();
	static JPanel carro2_7 = new JPanel();
	static JPanel carro2_8 = new JPanel();
	static JPanel carro2_9 = new JPanel();
	static JPanel carro2_10 = new JPanel();
	static JPanel carro2_11 = new JPanel();
	static JPanel carro2_12 = new JPanel();
	static JPanel carro2_13 = new JPanel();
	static JPanel carro2_14 = new JPanel();
	
	static JPanel carro3_1 = new JPanel();
	static JPanel carro3_2 = new JPanel();
	static JPanel carro3_3 = new JPanel();

	static JLabel textPiso1 = new JLabel("1° Piso");
	static JLabel textPiso2 = new JLabel("2° Piso");
	static JLabel textPiso3 = new JLabel("3° Piso");
	static JLabel valorVagaLivre = new JLabel("9");
	static JLabel valorVagaOcup = new JLabel("0");

	static JLabel JLImagemMapa2 = new JLabel(ImageMapa2);
	static JLabel JLImagemMapa1 = new JLabel(ImageMapa1);
	static JLabel JLImagemMapa3 = new JLabel(ImageMapa2);
	

	static int vagaOcup = 0;
	static int vagaLivre = 9;
	static int vagaEspecial = 0;

	static boolean[][] e = new boolean[3][3];

	public static void main(String[] args) {
		exibirTela();
		acaoBotao();

	}

	static void inserirDados() {

		e[0][0] = false;
		e[0][1] = false;
		e[0][2] = false;
		e[1][0] = false;
		e[1][1] = false;
		e[1][2] = false;
		e[2][0] = false;
		e[2][1] = false;
		e[2][2] = false;
		exibirVaga();

	}

	static void exibirTela() {
		janela.setSize(945, 670);
		janela.setVisible(true);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.add(tela);
		tela.setBackground(Color.BLACK);
		tela.setLayout(null);
		criarComponentes();

	}

	static void criarComponentes() {
		JPanel fundoDados = new JPanel();
		JLabel textTitle = new JLabel("Estacionamento do Altieres");
		JLabel textVagaLivre = new JLabel("Vagas Livres: ");
		JLabel textVagaOcup = new JLabel("Vagas ocupadas: ");
		JLabel textQtdCarro = new JLabel("Quantidade de carros: ");
		JLabel textQdtMoto = new JLabel("Quantidade de motos: ");

		textTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textVagaLivre.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
		textVagaOcup.setFont(new Font("Arial", Font.BOLD, 16));
		textQtdCarro.setFont(new Font("Arial", Font.BOLD, 16));
		textQdtMoto.setFont(new Font("Arial", Font.BOLD, 16));

		textTitle.setForeground(Color.white);
		fundoDados.setBackground(Color.white);

		tela.add(textTitle).setBounds(300, -30, 500, 100);
		tela.add(fundoDados).setBounds(20, 60, 900, 70);
		tela.add(botaoEntrada).setBounds(360, 580, 100, 50);
		tela.add(botaoSaida).setBounds(500, 580, 100, 50);
		tela.add(botaoAjuda).setBounds(825, 595, 100, 30);
		tela.add(textPiso1).setBounds(100, 150, 100, 100);
		tela.add(textPiso2).setBounds(410, 150, 100, 100);
		tela.add(textPiso3).setBounds(720, 150, 100, 100);

		textPiso1.setForeground(Color.white);
		textPiso1.setFont(new Font("Arial", Font.BOLD, 30));
		textPiso2.setForeground(Color.white);
		textPiso2.setFont(new Font("Arial", Font.BOLD, 30));
		textPiso3.setForeground(Color.white);
		textPiso3.setFont(new Font("Arial", Font.BOLD, 30));

		fundoDados.setLayout(null);
		fundoDados.add(textVagaLivre).setBounds(10, -1, 150, 50);
		fundoDados.add(textVagaOcup).setBounds(10, 30, 150, 50);
		fundoDados.add(textQtdCarro).setBounds(330, -1, 200, 50);
		fundoDados.add(textQdtMoto).setBounds(330, 30, 200, 50);
		fundoDados.add(valorVagaOcup).setBounds(160, 30, 100, 50);
		fundoDados.add(valorVagaLivre).setBounds(130, -1, 100, 50);

		valorVagaOcup.setFont(new Font("Arial", Font.BOLD, 16));
		valorVagaOcup.setForeground(Color.red);
		valorVagaLivre.setFont(new Font("Arial", Font.BOLD, 16));
		valorVagaLivre.setForeground(Color.green);

		adicionarComponentes();

	}

	static void adicionarComponentes() {
		inserirDados();
		criarMapa1();
		criarMapa2();
		criarMapa3();
		exibirTelaInformacao();
	}

	static void criarMapa1() {
		JPanel mapa1 = new JPanel();
		mapa1.setLayout(null);

		JLabel numVaga1 = new JLabel("1");
		JLabel numVaga2 = new JLabel("2");
		JLabel numVaga3 = new JLabel("3");
		JLabel numVaga4 = new JLabel("4");
		JLabel numVaga5 = new JLabel("5");
		JLabel numVaga6 = new JLabel("6");
		JLabel numVaga7 = new JLabel("7");
		JLabel numVaga8 = new JLabel("8");
		JLabel numVaga9 = new JLabel("9");
		JLabel numVaga10 = new JLabel("10");
		JLabel numVaga11 = new JLabel("11");
		JLabel numVaga12 = new JLabel("12");
		JLabel numVaga13 = new JLabel("13");
		JLabel numVaga14 = new JLabel("14");

		numVaga1.setForeground(Color.white);
		numVaga2.setForeground(Color.white);
		numVaga3.setForeground(Color.white);
		numVaga4.setForeground(Color.white);
		numVaga5.setForeground(Color.white);
		numVaga6.setForeground(Color.white);
		numVaga7.setForeground(Color.white);
		numVaga8.setForeground(Color.white);
		numVaga9.setForeground(Color.white);
		numVaga10.setForeground(Color.white);
		numVaga11.setForeground(Color.white);
		numVaga12.setForeground(Color.white);
		numVaga13.setForeground(Color.white);
		numVaga14.setForeground(Color.white);

		tela.add(mapa1).setBounds(10, 220, 300, 300);
		mapa1.add(numVaga1).setBounds(25, 47, 17, 17);
		mapa1.add(numVaga2).setBounds(45, 47, 17, 17);
		mapa1.add(numVaga3).setBounds(65, 47, 17, 17);
		mapa1.add(numVaga4).setBounds(85, 47, 17, 17);
		mapa1.add(numVaga5).setBounds(105, 47, 17, 17);
		mapa1.add(numVaga6).setBounds(185, 47, 17, 17);
		mapa1.add(numVaga7).setBounds(205, 47, 17, 17);
		mapa1.add(numVaga8).setBounds(225, 47, 17, 17);
		mapa1.add(numVaga9).setBounds(245, 47, 17, 17);
		mapa1.add(numVaga10).setBounds(265, 47, 17, 17);
		mapa1.add(numVaga11).setBounds(285, 47, 17, 17);
		mapa1.add(numVaga12).setBounds(245, 47, 17, 17);
		mapa1.add(numVaga13).setBounds(265, 47, 17, 17);
		mapa1.add(numVaga14).setBounds(285, 47, 17, 17);

		mapa1.add(carro1_1).setBounds(20, 2, 17, 45);
		mapa1.add(carro1_2).setBounds(40, 2, 17, 45);
		mapa1.add(carro1_3).setBounds(60, 2, 17, 45);
		mapa1.add(carro1_4).setBounds(80, 2, 17, 45);
		mapa1.add(carro1_5).setBounds(100, 2, 17, 45);
		mapa1.add(carro1_6).setBounds(180, 2, 17, 45);
		mapa1.add(carro1_7).setBounds(200, 2, 17, 45);
		mapa1.add(carro1_8).setBounds(220, 2, 17, 45);
		mapa1.add(carro1_9).setBounds(240, 2, 17, 45);
		mapa1.add(carro1_10).setBounds(260, 2, 17, 45);
		mapa1.add(carro1_11).setBounds(220, 2, 17, 45);
		mapa1.add(carro1_12).setBounds(240, 2, 17, 45);
		mapa1.add(carro1_13).setBounds(260, 2, 17, 45);
		mapa1.add(carro1_14).setBounds(280, 2, 17, 45);
		mapa1.add(JLImagemMapa1).setBounds(0, 0, 300, 300);
	}

	static void criarMapa2() {
		JPanel mapa2 = new JPanel();
		mapa2.setLayout(null);
		
		JLabel numVaga1 = new JLabel("53");
		JLabel numVaga2 = new JLabel("54");
		JLabel numVaga3 = new JLabel("55");
		JLabel numVaga4 = new JLabel("56");
		JLabel numVaga5 = new JLabel("57");
		JLabel numVaga6 = new JLabel("58");
		JLabel numVaga7 = new JLabel("59");
		JLabel numVaga8 = new JLabel("60");
		JLabel numVaga9 = new JLabel("61");
		JLabel numVaga10 = new JLabel("62");
		JLabel numVaga11 = new JLabel("63");
		JLabel numVaga12 = new JLabel("64");
		JLabel numVaga13 = new JLabel("65");
		JLabel numVaga14 = new JLabel("66");

		numVaga1.setForeground(Color.white);
		numVaga2.setForeground(Color.white);
		numVaga3.setForeground(Color.white);
		numVaga4.setForeground(Color.white);
		numVaga5.setForeground(Color.white);
		numVaga6.setForeground(Color.white);
		numVaga7.setForeground(Color.white);
		numVaga8.setForeground(Color.white);
		numVaga9.setForeground(Color.white);
		numVaga10.setForeground(Color.white);
		numVaga11.setForeground(Color.white);
		numVaga12.setForeground(Color.white);
		numVaga13.setForeground(Color.white);
		numVaga14.setForeground(Color.white);
		
		tela.add(mapa2).setBounds(320, 220, 300, 300);
		mapa2.add(numVaga1).setBounds(22, 47, 17, 17);
		mapa2.add(numVaga2).setBounds(42, 47, 17, 17);
		mapa2.add(numVaga3).setBounds(62, 47, 17, 17);
		mapa2.add(numVaga4).setBounds(82, 47, 17, 17);
		mapa2.add(numVaga5).setBounds(102, 47, 17, 17);
		mapa2.add(numVaga6).setBounds(122, 47, 17, 17);
		mapa2.add(numVaga7).setBounds(142, 47, 17, 17);
		mapa2.add(numVaga8).setBounds(162, 47, 17, 17);
		mapa2.add(numVaga9).setBounds(182, 47, 17, 17);
		mapa2.add(numVaga10).setBounds(202, 47, 17, 17);
		mapa2.add(numVaga11).setBounds(222, 47, 17, 17);
		mapa2.add(numVaga12).setBounds(242, 47, 17, 17);
		mapa2.add(numVaga13).setBounds(262, 47, 17, 17);
		mapa2.add(numVaga14).setBounds(282, 47, 17, 17);
	

		mapa2.add(carro2_1).setBounds(20, 2, 17, 45);
		mapa2.add(carro2_2).setBounds(40, 2, 17, 45);
		mapa2.add(carro2_3).setBounds(60, 2, 17, 45);
		mapa2.add(carro2_4).setBounds(80, 2, 17, 45);
		mapa2.add(carro2_5).setBounds(100, 2, 17, 45);
		mapa2.add(carro2_6).setBounds(120, 2, 17, 45);
		mapa2.add(carro2_7).setBounds(140, 2, 17, 45);
		mapa2.add(carro2_8).setBounds(160, 2, 17, 45);
		mapa2.add(carro2_9).setBounds(180, 2, 17, 45);
		mapa2.add(carro2_10).setBounds(200, 2, 17, 45);
		mapa2.add(carro2_11).setBounds(220, 2, 17, 45);
		mapa2.add(carro2_12).setBounds(240, 2, 17, 45);
		mapa2.add(carro2_13).setBounds(260, 2, 17, 45);
		mapa2.add(carro2_14).setBounds(280, 2, 17, 45);
		mapa2.add(JLImagemMapa2).setBounds(0, 0, 300, 300);
	}

	static void criarMapa3() {
		JPanel mapa3 = new JPanel();
		mapa3.setLayout(null);
		mapa3.setBackground(Color.white);
		tela.add(mapa3).setBounds(630, 220, 300, 300);

		mapa3.add(carro3_1).setBounds(20, 2, 17, 45);
		mapa3.add(carro3_2).setBounds(40, 2, 17, 45);
		mapa3.add(carro3_3).setBounds(60, 2, 17, 45);
		mapa3.add(JLImagemMapa3).setBounds(0, 0, 300, 300);
	}

	static void exibirVaga() {

		if (e[0][0] == true) {
			carro1_1.setBackground(Color.red);

		} else {
			carro1_1.setBackground(Color.green);
		}
		if (e[0][1] == true) {
			carro1_2.setBackground(Color.red);

		} else {
			carro1_2.setBackground(Color.green);
		}
		if (e[0][2] == true) {
			carro1_3.setBackground(Color.red);

		} else {
			carro1_3.setBackground(Color.green);
		}
		if (e[1][0] == true) {
			carro2_1.setBackground(Color.red);

		} else {
			carro2_1.setBackground(Color.green);
		}
		if (e[1][1] == true) {
			carro2_2.setBackground(Color.red);

		} else {

			carro2_2.setBackground(Color.green);
		}
		if (e[1][2] == true) {
			carro2_3.setBackground(Color.red);

		} else {
			carro2_3.setBackground(Color.green);
		}
		if (e[2][0] == true) {
			carro3_1.setBackground(Color.red);

		} else {
			carro3_1.setBackground(Color.green);
		}
		if (e[2][1] == true) {
			carro3_2.setBackground(Color.red);

		} else {
			carro3_2.setBackground(Color.green);
		}
		if (e[2][2] == true) {
			carro3_3.setBackground(Color.red);

		} else {
			carro3_3.setBackground(Color.green);
		}

		
	}

	static void exibirTelaInformacao() {

		telaAjuda.setBackground(Color.white);

		janelaAjuda.add(telaAjuda);
		janelaAjuda.setSize(400, 600);
		janelaAjuda.setVisible(false);
		janelaAjuda.setLocationRelativeTo(null);

	}

	static void acaoBotao() {
		botaoAjuda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				janelaAjuda.setVisible(true);

			}
		});
		botaoEntrada.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				randomEntrada();
				exibirValorVagas();
				exibirVaga();

			}
		});
		botaoSaida.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				randomSaida();
				exibirValorVagas();
				exibirVaga();

			}
		});

	}

	  static void randomEntrada() {
		int a = (int) (Math.random() * 3);
		int b = (int) (Math.random() * 3);

		if (e[a][b] == false) {
			e[a][b] = true;
			if (vagaLivre > 0) {
				vagaLivre--;
				vagaOcup++;
			}

		} else if (e[a][b] == true && vagaLivre > 0) {
			randomEntrada();
		} else {
			JOptionPane.showMessageDialog(null, "Todas as vagas estão ocupdas. ");
		}

	}

	static void randomSaida() {
		int a = (int) (Math.random() * 3);
		int b = (int) (Math.random() * 3);

		if (e[a][b] == true) {
			e[a][b] = false;
			if (vagaOcup > 0) {
				vagaOcup--;
				vagaLivre++;
			}

		} else if (e[a][b] == false && vagaOcup > 0) {
			randomSaida();
		} else {
			JOptionPane.showMessageDialog(null, "Todas as vagas estão livres. ");
		}

	}

	static void exibirValorVagas() {
		valorVagaOcupada();
		valorVagaLivre();
	}

	 static void valorVagaOcupada() {
		switch (vagaOcup) {
		case 0:
			valorVagaOcup.setText("0");
			break;
		case 1:
			valorVagaOcup.setText("1");
			break;
		case 2:
			valorVagaOcup.setText("2");
			break;
		case 3:
			valorVagaOcup.setText("3");
			break;
		case 4:
			valorVagaOcup.setText("4");
			break;
		case 5:
			valorVagaOcup.setText("5");
			break;
		case 6:
			valorVagaOcup.setText("6");
			break;
		case 7:
			valorVagaOcup.setText("7");
			break;
		case 8:
			valorVagaOcup.setText("8");
			break;
		case 9:
			valorVagaOcup.setText("9");
			break;

		
		}

		
	}

	static void valorVagaLivre() {
		switch (vagaLivre) {
		case 0:
			valorVagaLivre.setText("0");
			break;
		case 1:
			valorVagaLivre.setText("1");
			break;
		case 2:
			valorVagaLivre.setText("2");
			break;
		case 3:
			valorVagaLivre.setText("3");
			break;
		case 4:
			valorVagaLivre.setText("4");
			break;
		case 5:
			valorVagaLivre.setText("5");
			break;
		case 6:
			valorVagaLivre.setText("6");
			break;
		case 7:
			valorVagaLivre.setText("7");
			break;
		case 8:
			valorVagaLivre.setText("8");
			break;
		case 9:
			valorVagaLivre.setText("9");
			break;
		

		}
	}
}
