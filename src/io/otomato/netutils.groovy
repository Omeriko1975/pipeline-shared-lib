package io.otomato

def nslookup(address)
{
	return sh script : "nslookup ${address} | grep 'name =' | awk -F' ' '{print \$4;}'", returnStdout : true
}
