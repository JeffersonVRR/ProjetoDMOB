package Projeto;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Projeto {
	
	public static void main(String[] args) {
		//Declarando a variável que faz a selação da opção do menu
		int i;
		//Criando a classe scanner
		Scanner sc = new Scanner(System.in);
		//Laço de repetição do menu
		do {
			//Menu
			System.out.println("1.Soma");
			System.out.println("2.Subtração");
			System.out.println("3.Divisão");
			System.out.println("4.Faixa etária");
			System.out.println("5.Número primos");
			System.out.println("6.Mudança de Base");
			System.out.println("7.Sair");
			//Variável de seleção do menu.
			i = sc.nextInt();
			//Funcionalidades de cada opção do menu
			switch (i) {
			case 1: // Soma dos numeros digitados pelo usuário
				//Variáveis para a soma
				int n1,n2;
				//Pedindo para o usuário digitar os numeros
				System.out.println("Digite o primeiro número: ");
				n1 = sc.nextInt();
				System.out.println("Digite o segundo número: ");
				n2 = sc.nextInt();
				//Calculando e mostrando a soma
				n1 = n1+n2;
				System.out.println("A soma dos números digitados é: " + n1);
				break;
			case 2:// Subtrai os numeros digitados pelo usuário
				//Variáveis para a subtração
				int n3,n4;
				//Pedindo para o usuário digitar os numeros
				System.out.println("Digite o primeiro número: ");
				n3 = sc.nextInt();
				System.out.println("Digite o segundo número: ");
				n4 = sc.nextInt();
				//Calculando e mostrando a subtração
				n3 = n3-n4;
				System.out.println("A subtração dos números digitados é: " + n3);
				break;
			case 3:// Faz a divisão dos numeros digitados pelo usuário
				//Variáveis para a divisão
				int n5,n6,div;
				//Pedindo para o usuário 
				System.out.println("Digite o número do dividendo: ");
				n5 = sc.nextInt();
				System.out.println("Digite o número do divisor: ");
				n6 = sc.nextInt();
				//Verificar se o divisor é igual a 0
				do {
					System.out.println("Digite um valor diferente de 0!");
					n6 = sc.nextInt();
				} while (n6 == 0);
				//Calculando e mostrando a divisão
				div = n5/n6;
				System.out.println("O resultado é: " + div);
				break;
			case 4:// Faz a média de idade e idade por sexo de pessoas digitadas  pelo usuário
				//Variáveis para fazer a média
				int n7,idade, c = 0, c1 = 0, c2 = 0;
				double m1 = 0 ,m2 = 0,m3 = 0;
				String sexo;
				//Pedindo a quantidade de pessoas que irão ser pedidos
				System.out.println("São quantas pessoas?");
				n7 = sc.nextInt();
				while (c2 != n7){
					//Pedindo a idade e o sexo da pessoa
					System.out.println("Qual a idade? ");
					idade = sc.nextInt();
					System.out.println("Qual o sexo? (Masculino/Feminino)");
					sexo = sc.next();
					//Seleção do sexo escolhido pelo usuário
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
					c2++;//Contador de verificação de quantidade de pessoas
					m1 = idade + m1;//Colentando a idade de todas as pessoas
				}
				m1 = m1 / n7;//Calculando a média de todas as pessoas
				m2 = m2 / c;//Calculando a média masculina
				m3 = m3 / c1;//Calculando a média feminina
				//Mostrando todas as médias 
				System.out.printf("A média das idades são: %.2f\n",m1);
				System.out.printf("A média de idade do sexo masculino: %.2f\n", m2);
				System.out.printf("A média de idade do sexo feminino: %.2f\n", m3);
				break;
			case 5:// Faz o cálculo de soma dos números primos de um número digitado pelo usuário até o 0
				//Variáveis para fazer os cálculos
				int n8, c3 = 0, soma1 = 0;
				//Laço para verificcar se o número é maior que zero
				do {
					n8 = sc.nextInt();
					//Verificar se o número é maior que zero
					if (n8 <= 0) {
						System.out.println("Digite novamente um número maior que 0");
					}else {
						//Laço para zerar o contador e para deduzir 1 do número digitado
						while (n8 != 0) {
							//Laço para verificar se o número digitado é divisível por 1 até o número digitado
							for (int j = 1; j <= n8; j++) {
								//Verificar se o número é primo 
								if (n8 % j == 0) {
									c3++;//Contador verificador
								}
							}
							//Verifica o contador
							if (c3 == 2) {
								soma1 = n8 + soma1;//Pega o número primo e soma
							}
							c3 = 0;//Zera o contador
							n8--;//Deduz 1 do número digitado
						}
						//Demonstra o resultado
						System.out.println("A soma dos valores primos são: " + soma1);
						break;
					}
				} while (n8 <= 0);
				break;
			case 6:// Faz a ánalise de um número digitado pelo usuário, verificando se é decimal ou binário
				//Variáveis para fazer os cálculos
				int n9, x, con = 0, d = 0;
				ArrayList l = new ArrayList();
 				String y, s;
 				//Pedindo a quantidade de números que irão ser pedidos
				System.out.println("Quantos números? ");
				n9 = sc.nextInt();
				//Laço para repetir a quantidade desejada
				for (int j = 0; j < n9; j++) {
					do {
						//Pedindo o número que vai ser verificado
						System.out.println("Digite um número");
						x = sc.nextInt();
						//Verificar se ele é maior que 0
						if (x > 0) {
							l.clear();//Limpando o arraylist
							//Pedindo o formato do número
							System.out.println("Qual formato? (D/B)");
							y = sc.next();
							//Selecionando o formato escolhido
							switch (y) {
							case "D"://
								//Laço de repetição para pegar o resto da divisão do número digitado
								//Desse modo pegando o número binário
								while (x > 1) {
									con = x % 2;
									l.add(con);;
									x = x/2;  				
								}
								//Adicionando o 1 necessário
								l.add(1);
								//Invertendo a ordem do número binário
								Collections.reverse(l);
								//Imprimindo o número em binário
								System.out.println(l);
								break;
							case "B":
								int pot = 0;//Potência para a transformação do número
								s = Integer.toString(x);//Convertendo o número digitado em string
								
								for (int j2 = s.length()-1; j2 >= 0; j2--) {
									//Coletando o número de acordo com o index na string e efetuando o calculo para decimal
									d +=  (Character.getNumericValue(s.charAt(j2)) *(Math.pow(2, pot)));
									pot ++;//Adicionando +1 na potência 
								}
								//Imprimindo o número em decimal
								System.out.println(d);
								break;
							default:
								break;
							}
						}else {
							System.out.println("Digite um número maior que 0");
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

