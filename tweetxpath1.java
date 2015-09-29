package topsy;

public class tweetxpath1 {
	String arg1;
	String arg2;
	String arg3;
	String arg4;
	String arg5;
	String arg6;
	

	String xpath1;
	String xpath2;
	String xpath3;
	
	
	public tweetxpath1(int n){
		if(n==1)
		{
		arg1=".//*[@id='body']/div[4]/div[2]/div/div[1]/div/div[";
		arg2="]/div/div[1]/div/a";
		 arg3=".//*[@id='body']/div[4]/div[2]/div/div[1]/div/div[";
		 arg4="]/div/div[1]/div/span";
		 arg5=".//*[@id='body']/div[4]/div[2]/div/div[1]/div/div[";
		 arg6="]/div/div[1]/span";
		
		
			
		}
		else{
			
		arg1=".//*[@id='body']/div[4]/div[2]/div/div[1]/div/div[";
			 arg2="]/div/div[1]/div/a";
			 arg3=".//*[@id='body']/div[4]/div[2]/div/div[1]/div/div[";
			 arg4="]/div/div[1]/div/span";
			 arg5=".//*[@id='body']/div[4]/div[2]/div/div[1]/div/div[";
			 arg6="]/div/div[1]/span";
			 
			 
		}

		 xpath1="";
		 xpath2="";
		 xpath3="";
		
		 
	}
	public String getXpath1() {
		return xpath1;
	}
	public void setXpath1(String xpath1) {
		try{}catch(NullPointerException ne){ne.printStackTrace();}this.xpath1 = arg1+xpath1+arg2;
	}
	public String getXpath2() {
		return xpath2;
	}
	public void setXpath2(String xpath2) {
		try{}catch(NullPointerException ne){ne.printStackTrace();}this.xpath2 = arg3+xpath2+arg4;
	}
	public String getXpath3() {
		return xpath3;
	}
	public void setXpath3(String xpath3) {
		try{}catch(NullPointerException ne){ne.printStackTrace();}this.xpath3 =arg5+xpath3+arg6;
	}

	
}
