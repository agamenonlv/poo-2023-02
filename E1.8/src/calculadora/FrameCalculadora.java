package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.text.BadLocationException;

public class FrameCalculadora {

		private JTextField jtfNumero1;
		private JTextField jtfNumero2;
		private JTextField jtfResultado;
	
		public FrameCalculadora()
		{
			//Cria a janela da aplicação
			JFrame janela = new JFrame("Calculadora Simples");

			//Configura o layout da janela, posiciona e define o tamanho da janela
			GridLayout janelaLayout = new GridLayout(5,3);
			janelaLayout.setVgap(5);
			janela.getContentPane().setLayout(janelaLayout);
			janela.setLocationRelativeTo(null);
			janela.setPreferredSize(new Dimension(400,300));
			
			//Cria e configura os paineis
//			GridLayout painelEntrada1 = new GridLayout(1,2);
//			GridLayout painelEntrada2 = new GridLayout(1,2);
			GridLayout painelOperacao = new GridLayout(1,4);
//			GridLayout painelResultado = new GridLayout(1,2);
//			painelEntrada1.setVgap(10);
//			painelEntrada2.setVgap(10);
			painelOperacao.setVgap(10);
			painelOperacao.setHgap(5);
//			painelResultado.setHgap(10);
//			JPanel jplEntrada1 = new JPanel(painelEntrada1);
//			JPanel jplEntrada2 = new JPanel(painelEntrada2);
			JPanel jplOperacao = new JPanel(painelOperacao);
//			JPanel jplResultado = new JPanel(painelResultado);
			JPanel jplEntrada1 = new JPanel();
			JPanel jplEntrada2 = new JPanel();
			JPanel jplResultado = new JPanel();
			jplEntrada1.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
			jplEntrada2.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
			jplOperacao.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
			jplResultado.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
			
			//Cria e configura os rótulos
			JLabel lblTitulo = new JLabel("Calculadora", SwingConstants.CENTER);
			JLabel lblNumero1 = new JLabel("Número 1:");
			JLabel lblNumero2 = new JLabel("Número 2:");
			JLabel lblResultado = new JLabel("Resultado:");
			lblTitulo.setBorder(BorderFactory.createEmptyBorder(5,20,5,20));
			
			//Cria e configura as entradas
			jtfNumero1 = new JTextField(5);
			jtfNumero2 = new JTextField(5);
			jtfResultado = new JTextField(13);
			jtfResultado.setEnabled(false);
			jtfResultado.setFont(new Font("Arial", Font.BOLD, 24));
			KeyListener numeral =  new KeyListener()
			{
				@Override
				public void keyTyped(KeyEvent event) {
					char c = event.getKeyChar();
					JTextField jtf = (JTextField) event.getComponent();
					if (c == '.')
					{
						if (jtf.getText().contains("."))
						{
							event.consume();
						}
					}
					else if (c == '-')
					{
						if (jtf.getText().contains("-"))
						{
							try {
								jtf.getDocument().remove(0, 1);
							} catch (BadLocationException e) {
								e.printStackTrace();
							}
							event.consume();
						}
						else
						{
							if (!(jtf.getText().isEmpty()))
							{
								try {
									jtf.getDocument().insertString(0, "-", null);
								} catch (BadLocationException e) {
									e.printStackTrace();
								}
								event.consume();
							}
						}
					}
					else
					{
						if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
						{
							event.consume();
						}
					}
				}

				@Override
				public void keyPressed(KeyEvent event) {
				}

				@Override
				public void keyReleased(KeyEvent event) {
				}
			};
			jtfNumero1.addKeyListener(numeral);
			jtfNumero2.addKeyListener(numeral);

			//Cria e configura os botões
			JButton jbtSoma = new JButton("+");
			JButton jbtSubtracao = new JButton("-");
			JButton jbtMultiplicacao = new JButton("*");
			JButton jbtDivisao = new JButton("/");
			jbtSoma.setFont(new Font("Arial", Font.BOLD, 40));
			jbtSubtracao.setFont(new Font("Arial", Font.BOLD, 40));
			jbtMultiplicacao.setFont(new Font("Arial", Font.BOLD, 40));
			jbtDivisao.setFont(new Font("Arial", Font.BOLD, 40));
			jbtSoma.addActionListener(event -> adicao(event));
			jbtSubtracao.addActionListener(event -> subtracao(event));
			jbtMultiplicacao.addActionListener(event -> multiplicacao(event));
			jbtDivisao.addActionListener(event -> divisao(event));

			//Modifica o rótulo de título
			lblTitulo.setFont(new Font("Serif", Font.BOLD, 20));

			//Adiciona os elemento do painel de entrada
			jplEntrada1.add(lblNumero1);
			jplEntrada1.add(jtfNumero1);
			jplEntrada2.add(lblNumero2);
			jplEntrada2.add(jtfNumero2);
			
			//Adicona os elementos do painel de operações
			jplOperacao.add(jbtSoma);
			jplOperacao.add(jbtSubtracao);
			jplOperacao.add(jbtMultiplicacao);
			jplOperacao.add(jbtDivisao);
			
			//Adiciona os elementos do painel de resultado
			jplResultado.add(lblResultado);
			jplResultado.add(jtfResultado);

			//Adiciona os elementos na janela
			janela.add(lblTitulo);
			janela.add(jplEntrada1);
			janela.add(jplEntrada2);
			janela.add(jplOperacao);
			janela.add(jplResultado);

			//Exibe a janela, configura o comportamento de saída
			janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			janela.pack();
			janela.setVisible(true);
		}

		private Object adicao(ActionEvent event) {
			Double num1;
			Double num2;
			try
			{
				num1 = new Double(this.jtfNumero1.getText()).doubleValue();
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(jtfNumero1, "Insira um valor numérico no campo Número 1!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			try
			{
				num2 = new Double(this.jtfNumero2.getText()).doubleValue();
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(jtfNumero2, "Insira um valor numérico no campo Número 2!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			double resultado = num1 + num2;
			this.jtfResultado.setText(String.valueOf(resultado));
			return null;
		}

		private Object subtracao(ActionEvent event) {
			Double num1;
			Double num2;
			try
			{
				num1 = new Double(this.jtfNumero1.getText()).doubleValue();
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(jtfNumero1, "Insira um valor numérico no campo Número 1!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			try
			{
				num2 = new Double(this.jtfNumero2.getText()).doubleValue();
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(jtfNumero2, "Insira um valor numérico no campo Número 2!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			double resultado = num1 - num2;
			this.jtfResultado.setText(String.valueOf(resultado));
			return null;
		}

		private Object multiplicacao(ActionEvent event) {
			Double num1;
			Double num2;
			try
			{
				num1 = new Double(this.jtfNumero1.getText()).doubleValue();
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(jtfNumero1, "Insira um valor numérico no campo Número 1!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			try
			{
				num2 = new Double(this.jtfNumero2.getText()).doubleValue();
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(jtfNumero2, "Insira um valor numérico no campo Número 2!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			double resultado = num1 * num2;
			this.jtfResultado.setText(String.valueOf(resultado));
			return null;
		}

		private Object divisao(ActionEvent event) {
			Double num1;
			Double num2;
			this.jtfResultado.setText(null);
			try
			{
				num1 = new Double(this.jtfNumero1.getText()).doubleValue();
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(jtfNumero1, "Insira um valor numérico no campo Número 1!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			try
			{
				num2 = new Double(this.jtfNumero2.getText()).doubleValue();
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(jtfNumero2, "Insira um valor numérico no campo Número 2!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			if (num2 == 0)
			{
				JOptionPane.showMessageDialog(jtfNumero2, "Insira um valor diferente de zero (0) no campo Número 2!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
				return null;
			}
			double resultado = num1 / num2;
			this.jtfResultado.setText(String.valueOf(resultado));
			return null;
		}
}
