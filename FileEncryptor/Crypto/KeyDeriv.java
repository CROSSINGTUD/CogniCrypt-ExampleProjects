
package Crypto; 

import java.security.InvalidAlgorithmParameterException;

import java.security.InvalidKeyException;

import java.security.NoSuchAlgorithmException;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

import javax.crypto.BadPaddingException;

import javax.crypto.Cipher;

import javax.crypto.IllegalBlockSizeException;

import javax.crypto.NoSuchPaddingException;

import java.security.SecureRandom;

import javax.crypto.spec.IvParameterSpec;

import javax.crypto.spec.SecretKeySpec;

import java.security.spec.InvalidKeySpecException;

import java.util.List;

import java.util.Base64;

import java.io.InputStream;

import java.io.OutputStream;


public class KeyDeriv {
	
	public SecretKey getKey(char[] pwd) throws GeneralSecurityException {
		byte[] salt = new byte[16];
		SecureRandom.getInstanceStrong().nextBytes(salt);
		
		PBEKeySpec spec = new PBEKeySpec(pwd, salt, 65536, 128);
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		SecretKeySpec ret = new SecretKeySpec(skf.generateSecret(spec).getEncoded(), "AES" );
		spec.clearPassword();
		return ret;
	}
}
