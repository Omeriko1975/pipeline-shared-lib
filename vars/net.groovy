def hostname = ""
def ping(address,times)
{
   count = 10  
   if (times < 10)
   { 
     count = times
   }
  
   sh "ping -c ${times} ${address}"
}
def sethostname(name = "")
{
     if ( name != "" )
     {
        hostname = name
     }
     else
     {
        hostname = sh script:'hostname', returnStdout:true
     }
}

