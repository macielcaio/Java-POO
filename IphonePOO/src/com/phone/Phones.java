package com.phone;

import java.util.Scanner;

import com.phone.types.IphoneX;
import com.phone.types.IphoneXR;
import com.phone.types.IphoneXS;

public class Phones {
	
	public static void main(String[] args) throws Exception{
		
		IphoneXS iphoneXS = new IphoneXS() {
			
			public void procuraRede() {
				System.out.println("Seu iphone XS está com rede");
			}
			
			public void ligar() {
				System.out.println("Seu iphone XS está ligado");
			}
			
			public void refresh() {
				System.out.println("Seu iphone XS está com rede");
			}
		};	
		
		IphoneXR iphoneXR = new IphoneXR() {
			
			public void procuraRede() {
				System.out.println("Seu IphoneXR está com rede");
			}
			
			public void ligar() {
				System.out.println("Seu IphoneXR está ligado");
			}
			
			public void refresh() {
				System.out.println("Seu IphoneXR está com rede");
			}
		};	
		
		IphoneX iphoneX = new IphoneX() {
			
			public void procuraRede() {
				System.out.println("Seu iphoneX está com rede");
			}
			
			public void ligar() {
				System.out.println("Seu iphoneX está ligado");
			}
			
			public void refresh() {
				System.out.println("Seu iphoneX está com rede");
			}
		};	
		
		//Implementar condicional para escolha de modelo celular
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha um modelo de Iphone: 1. Iphone X, 2. Iphone XR, 3. Iphone XS");
		int opcao = scanner.nextInt(); 
			switch (opcao) {
	        case 1:
	        	iphoneX.ligar();
	        	iphoneX.procuraRede();
	        	iphoneX.refresh();
	            break;
	        case 2:
	        	iphoneXR.ligar();
	        	iphoneXR.procuraRede();
	        	iphoneXR.refresh();
	            break;
	        case 3:  
	        	iphoneXS.ligar();
	        	iphoneXS.procuraRede();
	        	iphoneXS.refresh();
	            break;
	        case 0:  
	            System.out.println("Escolha uma opção válida."); 
	            scanner.close(); // Fechar o scanner antes de encerrar o programa
	            return;
	        default:
	            System.out.println("Opção inválida."); 
	      }
		
		
	}
	
}
