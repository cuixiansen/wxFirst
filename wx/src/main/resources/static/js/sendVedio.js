function up () {
	var formdata=new FormData();
	
$.ajax({ url: "addVedio", 
	     //dataType: 'json',
	   //context: document.body,
	
	     type:"post",
         data:{
        	 vedioTitle:$("#title").val() ,
        	 vedioAuthor:$("#author").val(),
        	vedio:$("#vedio").get(0).files[0],
        	vedioImg: $('#vedioImg').get(0).files[0],
        	vedioPrice:$("#price").val(),
        	VedioNominate:$("#nominate").val(),
        	VedioText:$("#text").val(),
        	VedioDesc:$("#desc").val(),
        	VedioNum:0
         },
	   success: function(msg){
           if(msg=="ok"){
        	   alert("注册成功")
        	  // window.location.href ="../index.html"
           }else{
        	   alert("注册失败")  
           }
      }});
}