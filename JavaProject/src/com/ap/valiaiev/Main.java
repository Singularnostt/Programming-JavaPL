package com.ap.valiaiev;

import java.io.*;

public class Main {

	public static void main(String[] args)
	throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
        Zegar zegar = new Zegar();

        zegar.oblicz(a,b,c,d);
        System.out.println(zegar);

        
        StringBuffer stringbuffer = new StringBuffer("Kowalski");
        Obywateli obywateli = new Obywateli();
        obywateli.symbols(stringbuffer);
        System.out.println(obywateli);
	}

}
