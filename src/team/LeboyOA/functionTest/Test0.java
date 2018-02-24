package team.LeboyOA.functionTest;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;

public class Test0 {
	
	//create uuid
	private static String getUuid16(){
	    UUID uuid=UUID.randomUUID();
	    String str = uuid.toString(); 
	    String[] uuidArray=str.split("-");
	    return uuidArray[0]+uuidArray[1]+uuidArray[2];
	}
	
	private static String getUuid8(){
	    UUID uuid=UUID.randomUUID();
	    String str = uuid.toString(); 
	    String[] uuidArray=str.split("-");
	    return uuidArray[1]+uuidArray[3];
	}
	
	private static String getUuid32(){
	    UUID uuid=UUID.randomUUID();
	    String str = uuid.toString(); 
	    String uuidStr=str.replace("-","");
	    return uuidStr;
	}
	
	//password
	private static String createPassword(String rawPass, String saltPass) throws UnsupportedEncodingException {
		//String rawPass = "81dc9bdb52d04dc20036dbd8313ed055";
		//String saltPass = "2d0540d1599244389a600393f0aab65b";
		String resultPass = rawPass + saltPass;
		MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }

        byte[] byteArray = resultPass.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		//System.out.println("test ok");
		
		//System.out.println(getUuid16());
		System.out.println(createPassword("81dc9bdb52d04dc20036dbd8313ed055",
				"2d0540d1599244389a600393f0aab65b"));
	}

}
