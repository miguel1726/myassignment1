package ca.ualberta.cs.miguel1_travel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;

/**
 * @author  miguel1
 * 
 * based on Abraham Hindle student picker saga:https://www.youtube.com/watch?v=5PPD0ncJU1g&list=PL240uJOh_Vb4PtMZ0f7N8ACYkCLv0673O
 * accessed from 1/9/15 to 1/31/15
 * 
 * Class ClaimListManager, which helps save and load the claim list inputed by client
 */
public class ClaimListManager {
	
	static final String prefFile="ClaimList";
	static final String slKey="claimlist";
	protected Context context;
	/**
	 * @uml.property  name="claimlistmanager"
	 * @uml.associationEnd  
	 */
	private static ClaimListManager claimlistmanager=null;
	
	
	public static void initManager(Context context){
		if (claimlistmanager==null){
			if(context==null){
				throw new RuntimeException("Missing context for claim ");
			}
			claimlistmanager=new ClaimListManager(context);
		}
		
	}
	
	public static ClaimListManager getManager(){
		if (claimlistmanager==null){
			
				throw new RuntimeException("Did not initialize the manager ");
			}
		return claimlistmanager;
	}
	
	public ClaimListManager(Context context){
		this.context = context;
	}
	
	
	public Claim_List loadClaimList() throws ClassNotFoundException, IOException{
		SharedPreferences settings= context.getSharedPreferences(prefFile,Context.MODE_PRIVATE);
		String claimListData= settings.getString("claimList", "");
		if (claimListData.equals("")){
			return new Claim_List();
		}else{
			return claimListFromString(claimListData);
		}
	}
	
	static public Claim_List claimListFromString(String claimListData) throws ClassNotFoundException, IOException {
		ByteArrayInputStream bi= new ByteArrayInputStream(Base64.decode(claimListData, Base64.DEFAULT));
		ObjectInputStream oi= new ObjectInputStream(bi);
		return (Claim_List)oi.readObject();
		
		
	}
	
	static public String studentListToString(Claim_List claimlist) throws IOException {
		ByteArrayOutputStream bo=new ByteArrayOutputStream(); 
		ObjectOutputStream oo= new ObjectOutputStream(bo);
		oo.writeObject(claimlist);
		oo.close();
		byte bytes[]=bo.toByteArray();
		return Base64.encodeToString(bytes,Base64.DEFAULT);
		
		
	}


	public void saveClaimList(Claim_List claimlist) throws IOException{
		SharedPreferences settings= context.getSharedPreferences(prefFile,Context.MODE_PRIVATE);
		Editor editor=settings.edit();
		editor.putString(slKey,studentListToString(claimlist));
		editor.commit();
		
	}


	
}
