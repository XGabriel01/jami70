function showHello(str)
{
	var request = new XMLHttpRequest()//creo oggetto xmlhttprequest
	 
	request.onreadystatechange = function()
	{
		if(this.readyState==4 && this.status==200) //quando la risposta è caricata (4) e con successo (200)
		{
			console.log(request.responseText)
			document.getElementById("ServerResponse").innerHTML=request.responseText;
		}
	}
	
	request.open("GET", "saluto?user="+str, true)
	//setto la richiesta alla servlet saluto con il parametro user 
	//true serve per mandare la richiesta asincrona che mi fa continuare ad usare la pagina nela frattempo
	
	request.send(); //invio la richiesta 
}