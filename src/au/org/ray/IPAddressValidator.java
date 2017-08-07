/*
 * IP Address Validation
 * Status  : Accepted
 * Problem : https://www.hackerrank.com/challenges/ip-address-validation
 */

package au.org.ray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class IPAddressValidator {

    public static final String REGEX = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static boolean check(String ip)
    {
        if(Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE | Pattern.DOTALL).matcher(ip).matches())
            return true;
        else
            return false;
    }

    public static void main(String args[]) throws IOException
    {
    	File f = new File("resources/data.txt");
    	
        BufferedReader b = new BufferedReader(new FileReader(f));

        String readLine = "";

        System.out.println("Reading file using Buffered Reader");

        while ((readLine = b.readLine()) != null) {
        	System.out.println(readLine + " " + check(readLine));
        }
        
    }
}