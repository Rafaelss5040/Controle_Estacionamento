package estacionamentoAtieres;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EstacionamentoAtieres {

	public static void main(String[] args) {
		exibirTela();
		acaoBotao();

	}

	static JFrame janela = new JFrame("Sistema de controle do estacionamento");
	static JFrame janelaAjuda = new JFrame("Informações");
	static JPanel telaAjuda = new JPanel();
	static JPanel tela = new JPanel();

	static ImageIcon ImageMapa1 = new ImageIcon("EstacionamnetoAltieres\\estacionamento.jpg");

	static JButton botaoEntrada = new JButton("Entrada");
	static JButton botaoSaida = new JButton("Saída");
	static JButton botaoAjuda = new JButton("Ajuda");

	static JPanel carro1_1 = new JPanel();
	static JPanel carro1_2 = new JPanel();
	static JPanel carro1_3 = new JPanel();

	static JPanel carro2_1 = new JPanel();
	static JPanel carro2_2 = new JPanel();
	static JPanel carro2_3 = new JPanel();

	static JPanel carro3_1 = new JPanel();
	static JPanel carro3_2 = new JPanel();
	static JPanel carro3_3 = new JPanel();
	
	static int vagaOcup = 0;
	static int vagaLivre = 9;

	static boolean[][] e = new boolean[3][3];

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
		janela.setSize(945, 600);
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
		tela.add(fundoDados).setBounds(20, 90, 900, 70);
		tela.add(botaoEntrada).setBounds(360, 500, 100, 50);
		tela.add(botaoSaida).setBounds(500, 500, 100, 50);
		tela.add(botaoAjuda).setBounds(825, 525, 100, 30);

		fundoDados.setLayout(null);
		fundoDados.add(textVagaLivre).setBounds(10, -1, 150, 50);
		fundoDados.add(textVagaOcup).setBounds(10, 30, 150, 50);
		fundoDados.add(textQtdCarro).setBounds(250, -1, 200, 50);
		fundoDados.add(textQdtMoto).setBounds(250, 30, 200, 50);

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

		tela.add(mapa1).setBounds(10, 170, 300, 300);

		mapa1.add(carro1_1).setBounds(2, 2, 10, 20);
		mapa1.add(carro1_2).setBounds(17, 2, 10, 20);
		mapa1.add(carro1_3).setBounds(32, 2, 10, 20);

	}

	static void criarMapa2() {
		JPanel mapa2 = new JPanel();
		mapa2.setLayout(null);
		mapa2.setBackground(Color.white);
		tela.add(mapa2).setBounds(320, 170, 300, 300);

		mapa2.add(carro2_1).setBounds(2, 2, 10, 20);
		mapa2.add(carro2_2).setBounds(17, 2, 10, 20);
		mapa2.add(carro2_3).setBounds(32, 2, 10, 20);

	}

	static void criarMapa3() {
		JPanel mapa3 = new JPanel();
		mapa3.setLayout(null);
		mapa3.setBackground(Color.white);
		tela.add(mapa3).setBounds(630, 170, 300, 300);

		mapa3.add(carro3_1).setBounds(2, 2, 10, 20);
		mapa3.add(carro3_2).setBounds(17, 2, 10, 20);
		mapa3.add(carro3_3).setBounds(32, 2, 10, 20);

	}

	static void exibirVaga() {
		

		if (e[0][0] == true) {
			carro1_1.setBackground(Color.red);
			vagaOcup++;

		} else {
			carro1_1.setBackground(Color.green);
		}
		if (e[0][1] == true) {
			carro1_2.setBackground(Color.red);
			vagaOcup++;
		} else {
			carro1_2.setBackground(Color.green);
		}
		if (e[0][2] == true) {
			carro1_3.setBackground(Color.red);
			vagaOcup++;
		} else {
			carro1_3.setBackground(Color.green);
		}
		if (e[1][0] == true) {
			carro2_1.setBackground(Color.red);
			vagaOcup++;

		} else {
			carro2_1.setBackground(Color.green);
		}
		if (e[1][1] == true) {
			carro2_2.setBackground(Color.red);
			vagaOcup++;
		} else {

			carro2_2.setBackground(Color.green);
		}
		if (e[1][2] == true) {
			carro2_3.setBackground(Color.red);
			vagaOcup++;
		} else {
			carro2_3.setBackground(Color.green);
		}
		if (e[2][0] == true) {
			carro3_1.setBackground(Color.red);
			vagaOcup++;
		} else {
			carro3_1.setBackground(Color.green);
		}
		if (e[2][1] == true) {
			carro3_2.setBackground(Color.red);
			vagaOcup++;
		} else {
			carro3_2.setBackground(Color.green);
		}
		if (e[2][2] == true) {
			carro3_3.setBackground(Color.red);
			vagaOcup++;
		} else {
			carro3_3.setBackground(Color.green);
		}

		vagaLivre -= vagaOcup;
		
		// System.out.println("vagas ocupadas: " + vagaOcup + "\n" + "vaga livres: " + vagaLivre);
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
				exibirVaga();
			}
		});
		botaoSaida.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				randomSaida();
				exibirVaga();
			}
		});

	}

	static void randomEntrada() {
		int a = (int) (Math.random() * 3);
		int b = (int) (Math.random() * 3);
		

		if (e[a][b] == true) {
			randomEntrada();
					
		
		} else {
			e[a][b] = true;
		}
		//System.out.println(e[a][b] + " posicoes " + a + "-" + b);

	}

	static void randomSaida() {
		int a = (int) (Math.random() * 3);
		int b = (int) (Math.random() * 3);

		if (e[a][b] == true) {
			e[a][b] = false;
			
		} else {
			randomSaida();
			}
			//System.out.println(e[a][b] + " posicoes " + a + "-" + b);
		}
	}

