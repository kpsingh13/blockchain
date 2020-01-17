package noobchain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

public class hibermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Userdetail.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Userdetail user = new Userdetail();
		//desigmast desig = new desigmast();
		desgchildmast desgc = new desgchildmast();
		
		Userdetail mydetail = session.get(Userdetail.class, user.getEmpcode());
		//desigmast mydesig = session.get(desigmast.class, desig.getDesggroup());
		//desgchildmast mydesgc = session.get(desgchildmast.class, desgc.getEmpcode());
		
	    Gson json1= new Gson();
	    String st = json1.toJson(mydetail);
	    //Gson json2= new Gson();
	    //String st2 = json2.toJson(mydesig);
	   // Gson json3 = new Gson();
	   // String st3=json3.toJson(mydesgc);
	    
		//String tot =st+st3;
	    NoobChain nb= new NoobChain();
		nb.addBlock(new Block (st,"0"));
		
		
		
		
		//session.save();
		session.getTransaction();
        session.close();
	}

}
