package io.otomato

def nslookup(address)
{
	name =  sh script : "nslookup ${address} | grep 'name =' | awk -F' ' '{print \$4;}'", returnStdout : true
        return name
}
return this
