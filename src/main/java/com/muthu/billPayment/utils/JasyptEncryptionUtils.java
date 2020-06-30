package com.muthu.billPayment.utils;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptEncryptionUtils {

	private static final String JASYPT_PASSPHRASE = "jasypt-passphrase";

	public static String decrypt(String encryptedText) {
		final BasicTextEncryptor encryptor = new BasicTextEncryptor();
		encryptor.setPasswordCharArray(JASYPT_PASSPHRASE.toCharArray());
		final String decryptedText = encryptor.decrypt(encryptedText);
		return decryptedText;
	}

	public static String encrypt(String text) {
		final BasicTextEncryptor encryptor = new BasicTextEncryptor();
		encryptor.setPasswordCharArray(JASYPT_PASSPHRASE.toCharArray());
		final String encryptedText = encryptor.encrypt(text);
		return encryptedText;
	}
}
