package org.system;

public class Desktop extends Computer {

	public void desktopsize() {
		System.out.println(" My desktop size is 22 inches");
		
	}
	
	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		
		desktop.computerModel();
		desktop.desktopsize();
		
	}
}
