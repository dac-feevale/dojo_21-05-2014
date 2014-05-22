package br.feevale.dojo;

import org.junit.Assert;
import org.junit.Test;

public class NumeroFelizTest {

	@Test
	public void quatroNaoEFelizTest() {
		NumeroFeliz numero = new NumeroFeliz(4);
		Assert.assertFalse(numero.eFeliz());
		
		
	}
	
	@Test
	public void doisNaoEFelizTest() {
		NumeroFeliz numero = new NumeroFeliz(2);
		Assert.assertFalse(numero.eFeliz());
	}
	
	@Test
	public void o103EFelizTest() {
		NumeroFeliz numero = new NumeroFeliz(103);
		Assert.assertTrue(numero.eFeliz());
	}
	
	
}
