$(document).ready(function(){
	
//	$.post(url,..,function(data){
//		
//		
//	});
	
	let json_msg={data:[{subject:'자바',price:10,img:'java.png'},{subject:'DB',price:100,img:'db.png'},{subject:'파이썬',price:1000,img:'db.png'},{subject:'스크립트',price:10000,img:'db.png'},{subject:'웹',price:100000,img:'db.png'}]};
	//let js_msg=JSON.parse(json_msg);//{data:[{1:'a'}....
	let my_array=json_msg.data;
	console.log(my_array);
	let sumMsg='';
	var i;
	for (i = 0; i < my_array.length; i++) {
		sumMsg +="<img src='../img/"+my_array[i].img+"'>"+my_array[i].subject+" : "+ my_array[i].price+"<br>";
	}
	$('#here').html(sumMsg);
	
	
});