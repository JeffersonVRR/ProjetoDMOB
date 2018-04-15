package Projeto;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Projeto {
	
	public static void main(String[] args) {
		//Declarando a vari�vel que faz a sela��o da op��o do menu
		int i;
		//Criando a classe scanner
		Scanner sc = new Scanner(System.in);
		//La�o de repeti��o do menu
		do {
			//Menu
			System.out.println("1.Soma");
			System.out.println("2.Subtra��o");
			System.out.println("3.Divis�o");
			System.out.println("4.Faixa et�ria");
			System.out.println("5.N�mero primos");
			System.out.println("6.Mudan�a de Base");
			System.out.println("7.Sair");
			//Vari�vel de sele��o do menu.
			i = sc.nextInt();
			//Funcionalidades de cada op��o do menu
			switch (i) {
			case 1: // Soma dos numeros digitados pelo usu�rio
				//Vari�veis para a soma
				int n1,n2;
				//Pedindo para o usu�rio digitar os numeros
				System.out.println("Digite o primeiro n�mero: ");
				n1 = sc.nextInt();
				System.out.println("Digite o segundo n�mero: ");
				n2 = sc.nextInt();
				//Calculando e mostrando a soma
				n1 = n1+n2;
				System.out.println("A soma dos n�meros digitados �: " + n1);
				break;
			case 2:// Subtrai os numeros digitados pelo usu�rio
				//Vari�veis para a subtra��o
				int n3,n4;
				//Pedindo para o usu�rio digitar os numeros
				System.out.println("Digite o primeiro n�mero: ");
				n3 = sc.nextInt();
				System.out.println("Digite o segundo n�mero: ");
				n4 = sc.nextInt();
				//Calculando e mostrando a subtra��o
				n3 = n3-n4;
				System.out.println("A subtra��o dos n�meros digitados �: " + n3);
				break;
			case 3:// Faz a divis�o dos numeros digitados pelo usu�rio
				//Vari�veis para a divis�o
				int n5,n6,div;
				//Pedindo para o usu�rio 
				System.out.println("Digite o n�mero do dividendo: ");
				n5 = sc.nextInt();
				System.out.println("Digite o n�mero do divisor: ");
				n6 = sc.nextInt();
				//Verificar se o divisor � igual a 0
				do {
					System.out.println("Digite um valor diferente de 0!");
					n6 = sc.nextInt();
				} while (n6 == 0);
				//Calculando e mostrando a divis�o
				div = n5/n6;
				System.out.println("O resultado �: " + div);
				break;
			case 4:// Faz a m�dia de idade e idade por sexo de pessoas digitadas  pelo usu�rio
				//Vari�veis para fazer a m�dia
				int n7,idade, c = 0, c1 = 0, c2 = 0;
				double m1 = 0 ,m2 = 0,m3 = 0;
				String sexo;
				//Pedindo a quantidade de pessoas que ir�o ser pedidos
				System.out.println("S�o quantas pessoas?");
				n7 = sc.nextInt();
				while (c2 != n7){
					//Pedindo a idade e o sexo da pessoa
					System.out.println("Qual a idade? ");
					idade = sc.nextInt();
					System.out.println("Qual o sexo? (Masculino/Feminino)");
					sexo = sc.next();
					//Sele��o do sexo escolhido pelo usu�rio
					switch (sexo) {
					case "Masculino":
						//Colentando a idade do sexo masculino
						m2 = idade + m2;
						c++;
						break;
					case "Feminino":
						//Colentando a idade do sexo feminino
						m3 = idade + m3;
						c1++;
						break;
					default:
						break;
					}
					c2++;//Contador de verifica��o de quantidade de pessoas
					m1 = idade + m1;//Colentando a idade de todas as pessoas
				}
				m1 = m1 / n7;//Calculando a m�dia de todas as pessoas
				m2 = m2 / c;//Calculando a m�dia masculina
				m3 = m3 / c1;//Calculando a m�dia feminina
				//Mostrando todas as m�dias 
				System.out.printf("A m�dia das idades s�o: %.2f\n",m1);
				System.out.printf("A m�dia de idade do sexo masculino: %.2f\n", m2);
				System.out.printf("A m�dia de idade do sexo feminino: %.2f\n", m3);
				break;
			case 5:// Faz o c�lculo de soma dos n�meros primos de um n�mero digitado pelo usu�rio at� o 0
				//Vari�veis para fazer os c�lculos
				int n8, c3 = 0, soma1 = 0;
				//La�o para verificcar se o n�mero � maior que zero
				do {
					n8 = sc.nextInt();
					//Verificar se o n�mero � maior que zero
					if (n8 <= 0) {
						System.out.println("Digite novamente um n�mero maior que 0");
					}else {
						//La�o para zerar o contador e para deduzir 1 do n�mero digitado
						while (n8 != 0) {
							//La�o para verificar se o n�mero digitado � divis�vel por 1 at� o n�mero digitado
							for (int j = 1; j <= n8; j++) {
								//Verificar se o n�mero � primo 
								if (n8 % j == 0) {
									c3++;//Contador verificador
								}
							}
							//Verifica o contador
							if (c3 == 2) {
								soma1 = n8 + soma1;//Pega o n�mero primo e soma
							}
							c3 = 0;//Zera o contador
							n8--;//Deduz 1 do n�mero digitado
						}
						//Demonstra o resultado
						System.out.println("A soma dos valores primos s�o: " + soma1);
						break;
					}
				} while (n8 <= 0);
				break;
			case 6:// Faz a �nalise de um n�mero digitado pelo usu�rio, verificando se � decimal ou bin�rio
				//Vari�veis para fazer os c�lculos
				int n9, x, con = 0, d = 0;
				ArrayList l = new ArrayList();
 				String y, s;
 				//Pedindo a quantidade de n�meros que ir�o ser pedidos
				System.out.println("Quantos n�meros? ");
				n9 = sc.nextInt();
				//La�o para repetir a quantidade desejada
				for (int j = 0; j < n9; j++) {
					do {
						//Pedindo o n�mero que vai ser verificado
						System.out.println("Digite um n�mero");
						x = sc.nextInt();
						//Verificar se ele � maior que 0
						if (x > 0) {
							l.clear();//Limpando o arraylist
							//Pedindo o formato do n�mero
							System.out.println("Qual formato? (D/B)");
							y = sc.next();
							//Selecionando o formato escolhido
							switch (y) {
							case "D"://
								//La�o de repeti��o para pegar o resto da divis�o do n�mero digitado
								//Desse modo pegando o n�mero bin�rio
								while (x > 1) {
									con = x % 2;
									l.add(con);;
									x = x/2;  				
								}
								//Adicionando o 1 necess�rio
								l.add(1);
								//Invertendo a ordem do n�mero bin�rio
								Collections.reverse(l);
								//Imprimindo o n�mero em bin�rio
								System.out.println(l);
								break;
							case "B":
								int pot = 0;//Pot�ncia para a transforma��o do n�mero
								s = Integer.toString(x);//Convertendo o n�mero digitado em string
								
								for (int j2 = s.length()-1; j2 >= 0; j2--) {
									//Coletando o n�mero de acordo com o index na string e efetuando o calculo para decimal
									d +=  (Character.getNumericValue(s.charAt(j2)) *(Math.pow(2, pot)));
									pot ++;//Adicionando +1 na pot�ncia 
								}
								//Imprimindo o n�mero em decimal
								System.out.println(d);
								break;
							default:
								break;
							}
						}else {
							System.out.println("Digite um n�mero maior que 0");
						}
					} while (x <= 0);	
				}
				break;
			default:
				break;
			}
		} while (i != 7);
	}	
}

