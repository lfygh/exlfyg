package com.lfyg.hex;

/**
 * 实现16进制转字符串，字节数组转16进制，16进制转字节数组等多种写法
 * 
 * @author lfyg
 * 
 */
public class HexUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 字节数组转化为16进制表示的字符串、 注意:一个字节可以表示为两个16进制字符
	 * 注意：&是对整型操作
	 * @param bytes
	 *            字节数组
	 * @return
	 */
	public static String bytesToHexStr(byte[] bytes) {
		final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
				'9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] hexChars = new char[bytes.length * 2];

		for (int i = 0; i < bytes.length; i++) {
			int v = bytes[i] & 0xFF;
			hexChars[i * 2] = hexArray[v >>> 4]; // 无符号右移4位，即取得字节的高4位
			hexChars[i * 2 + 1] = hexArray[v & 0x0F]; // 获得低4位
		}

		return new String(hexChars);
	}

	/**
	 * 
	 * @param bytes
	 * @return
	 */
	public static String byte2HexString(byte[] bytes) {
		String ret = "";
		if (bytes != null) {
			byte[] arrayOfByte = bytes;
			int j = bytes.length;
			for (int i = 0; i < j; i++) {
				Byte b = Byte.valueOf(arrayOfByte[i]);
				ret = ret
						+ String.format("%02X", new Object[] { Integer
								.valueOf(b.intValue() & 0xFF) });
			}
		}
		return ret;
	}
	
	
	/**
	 * String.format实际上调用的是java.util.Formatter的format方法。
	 * java.lang.
	 * 
	 * 
	 * 
	 */
}
