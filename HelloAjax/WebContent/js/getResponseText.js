function showHello(str)
{ 
    var xmlHttp;
    if (window.XMLHttpRequest) { // Mozilla, Safari, ...
        xmlHttp = new XMLHttpRequest();
    }
        else if (window.ActiveXObject) { // IE
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    
    
 xmlHttp.onreadystatechange =function() {
    	if (this.readyState == 4 && this.status == 200) {
       	console.log(xmlHttp.responseText);
      	stateChanged(this);
    	}
	};
 xmlHttp.open("GET","getInfo?user="+str,true);
 xmlHttp.send();
}

function stateChanged(resp)
{ 
    var val=resp.responseText;
    document.getElementById("ServerResponse").innerHtml=val;
}

