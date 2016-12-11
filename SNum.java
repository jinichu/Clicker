package fedoraclicker;

import java.util.ArrayList;
public class SNum {
	public ArrayList<Integer> tipsList= new ArrayList<Integer>();
   
   SNum(int tips){
	   tipsList.add(tips);
	   for(int i=0; i<10;i++)
		   tipsList.add(0);
	   
	   for(int i=0;i<tipsList.size()-1;i++)
	   {
		   if(tipsList.get(i) > 999){
			   tipsList.set(i+1, tipsList.get(i+1)+tipsList.get(i));
			   tipsList.set(i, 0);
			   
		   }
	   }
   }
   
   public void onClick(int val, int loc){
      
       
   }
   
   
   public void SNumAdd(int val, int loc){
	   tipsList.set(loc, tipsList.get(loc)+val);
	   
	   for(int i=0;i<tipsList.size()-2;i++)
	   {
		   if(tipsList.get(i) > 999){
			   tipsList.set(i+1, (tipsList.get(i+1)+tipsList.get(i))/1000);
			   tipsList.set(i, tipsList.get(i)%1000);
			   
		   }
	   }
	   
   }
   
   public void SNumSub(int val, int loc){
	   tipsList.set(loc, tipsList.get(loc)-val);
	   
	   for(int i=1;i<tipsList.size()-2;i++)
	   {
		   if(tipsList.get(i) < 0){
                       int j=tipsList.get(i)/-1000;
                         if(tipsList.get(i)%-1000!=0) j++;
                            tipsList.set(i+1, (tipsList.get(i+1)-1*j));
                            tipsList.set(i, (tipsList.get(i)+1000*j));
			 
			   
		   }
	   }
	   
   }
   
   public String toString(){
	   String str = "";
	   for(int i=tipsList.size()-1;i>=0;i--)
	   {
		   if(tipsList.get(i)!=0)
		   	str=str+tipsList.get(i)+"";
		   if(i==11&&tipsList.get(i)!=0)
			   str=str+"decillion ";
		   if(i==10&&tipsList.get(i)!=0)
			   str=str+"nonillion ";
		   if(i==9&&tipsList.get(i)!=0)
			   str=str+"octillion ";
		   if(i==8&&tipsList.get(i)!=0)
			   str=str+"sextillion ";
		   if(i==7&&tipsList.get(i)!=0)
			   str=str+"septillion ";
		   if(i==6&&tipsList.get(i)!=0)
			   str=str+"quintillion ";
		   if(i==5&&tipsList.get(i)!=0)
			   str=str+"quadrillion ";
		   if(i==4&&tipsList.get(i)!=0)
			   str=str+"trillion ";
		   if(i==3&&tipsList.get(i)!=0)
			   str=str+"billion ";
		   if(i==2&&tipsList.get(i)!=0)
			   str=str+"m ";
		   if(i==1&&tipsList.get(i)!=0)
			   str=str+"k ";

	   }
	   return str;
   }
   
   public boolean checkVal(long n){
	   boolean flag = false;
	   long total = 0;
	   
		   for(int i=tipsList.size()-1;i>=0;i--)
		   {
			   total=total+tipsList.get(i);
			   if(total>n){
				   flag = true;
				   i=-1;
			   }  
		   }
	   return flag;
   }
   

   
   
   
}