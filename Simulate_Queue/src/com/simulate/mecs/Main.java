package com.simulate.mecs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    float[] arrival=new float[]{0.4f,1.2f,0.5f,1.7f,0.2f,1.6f,0.2f,1.4f,1.9f};
    float[] service=new float[]{2.0f,0.7f,0.2f,1.1f,3.7f,1.2f,0.2f,0.5f,0.6f};
    
   // float[] arrival=new float[]{1.73f,1.35f,0.71f,0.62f,14.28f,0.70f,15.52f,3.15f,17.76f,1.00f};
	float sum=0,sum_service=0;
	float time=0,time_service=0;
	int arrival_pos=0;
	int service_pos=0;
	int counter=0,counter_service=0;
	boolean isServicing=false;
	float service_time_elapsed=0;
	float time_elapsed=0;
	float wait=0;
	

	service_time_elapsed=arrival[0];
	
		while (arrival_pos<=arrival.length-1)
		{
		
			if (sum==arrival[arrival_pos])
			{
				time=time+sum;
				
				System.out.println("---------------");
				
				System.out.println("Time Arrival W"+(arrival_pos+1)+" : "+ String.format("%.1f",time) );
				
		
					while(service_time_elapsed<=time && service_pos<=arrival_pos )
					{
				  				
				      System.out.println("service time elaspsed: "+service_time_elapsed);
				   
				      for(int j=0;j<=service_pos;j++)
				      {
				    	  time_elapsed=time_elapsed+arrival[j];
				      }
				      wait=service_time_elapsed-time_elapsed;
				      
				      if (wait<0)
				      {
				    	  wait=0;
				      }
				     				 
				       System.out.println("total time to w"+service_pos+" : "+time_elapsed);
				       System.out.println("waited to service W"+(service_pos+1)+" : "+ String.format("%.1f",wait));
				     
				       service_time_elapsed=service_time_elapsed+service[service_pos];
								      
				      service_pos++;
				      time_elapsed=0;
					}
				    		
			   			    
				arrival_pos++;
				sum=0;
				counter=0;
						
			}
			
			sum=counter/10.0f;
			counter++;

		}
		
			

	}

}
