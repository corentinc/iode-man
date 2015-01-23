package fr.istic.iodeman;

import java.util.List;

import javax.naming.directory.SearchControls;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.istic.iodeman.service.LDAPServ;
import fr.istic.iodeman.service.LDAPServiceImpl;

public class TestConnection extends SpringUnitTest {
	
	@Autowired
	private LDAPServ ldapserv;
	
	
	public void testLdaP(){
		
		List<String> list = ldapserv.getAllPersonNames();
		
		String listString = "List : ";

		for (String s : list)
		{
		    listString += s + "\t";
		}

		System.out.println(listString);
	}
	
	
	public void testldap2(){
		
		System.out.println(ldapserv.lookupPerson("11008880"));
		
	}
}
