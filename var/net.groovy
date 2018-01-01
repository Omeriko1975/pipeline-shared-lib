def ping(address,times)
{
   count = 10  
   if (times < 10)
   { 
     count = times
   }
  
   sh "ping -c ${times} ${address}"
}
