

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
	
public class Output {
	public byte[] templateUsage(byte[] data, char[] pwd) throws GeneralSecurityException  {
		KeyDeriv kd = new KeyDeriv();
		SecretKey key = kd.getKey(pwd); 		
		
		Enc enc = new Enc();
		return enc.encrypt(data, key);
	}
}

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
	
public class Output {
	public byte[] templateUsage(byte[] data, char[] pwd) throws GeneralSecurityException{
		KeyDeriv kd = new KeyDeriv();
		SecretKey key = kd.getKey(pwd); 	
		Enc enc = new Enc();
		
        byte[] ciphertext = enc.encrypt(data, key);
        return ciphertext;
        
	}
}
