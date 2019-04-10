package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Vedio;
import com.example.demo.service.VedioService;
import com.example.demo.util.Bpage;
import com.example.demo.util.FileUpUtil;


@Controller

public class VedioController {
	@Autowired
	VedioService vs;
	@Autowired 
	FileUpUtil fuu;
	//测试配置能否访问的方法
@RequestMapping("/a")
public String s() {
	return "wxBackstage";
}
@RequestMapping("/sendVedio")
public String sendAudio() {
	return "sendVedio";
}
@RequestMapping("/showAllVedio")
public String showAllVedio() {
	return "showAllVedio";
}
//插入
@RequestMapping("/addVedio")
@ResponseBody
public String addVedio(Vedio vedio,MultipartFile vedioImg,MultipartFile vedioFile,HttpServletRequest request) {
try {
	Date now=new Date();
	String vedioImgSrc=fuu.fileUp(vedioImg, request);
	String vedioSrc=fuu.fileUp(vedioFile, request);
	vedio.setVedioImgSrc(vedioImgSrc);
	vedio.setVedioSrc(vedioSrc);
	vedio.setVedioDate(now);
	int result=vs.insertVedio(vedio);
	System.out.println(vedio);
	if(result==1) {
		return "ok";
	}
	else 
	    {return "filed" ;}
   }catch (Exception e) {
	   System.err.println(e);
	   System.out.println(vedio);
	return "filed";
   }
}

///*//update vedio
//@RequestMapping("/updateVedio")
//@ResponseBody
//public String updateVedio(Vedio vedio,MultipartFile vedioImg,MultipartFile vedioFile,HttpServletRequest request) {
//try {
//	String vedioImgSrc=fuu.fileUp(vedioImg, request);
//	String vedioSrc=fuu.fileUp(vedioFile, request);
//	System.out.println("vedioImgSrc:"+vedioImgSrc);
//	System.out.println("vedioSrc:"+vedioSrc);
//	vedio.setVedioImgSrc(vedioImgSrc);
//	vedio.setVedioSrc(vedioSrc);
//	int result=vs.updateVedio(vedio);
//	if(result==1) {
//		return "ok";
//	}
//	else 
//	    {return "filed" ;}
//   }catch (Exception e) {
//	return "filed";
//   }
//}*/

//delete Vedio
@RequestMapping("/removeVedio")
@ResponseBody
public String removeVedio(int id) {
try {
	
	int result=vs.deleteVedioById(id);
	if(result==1) {
		return "ok";
	}
	else 
	    {return "filed" ;}
   }catch (Exception e) {
	return "filed";
   }
}
//查询 
@RequestMapping("/findVedioById")
@ResponseBody
public Vedio findVedioById(int id) {
try {
	
	Vedio vedio=vs.selectVedioById(id);
	if(vedio!=null) {
		return vedio;
	}
	else 
	    {return null ;}
   }catch (Exception e) {
	return null;
   }
}

//查询推荐
@RequestMapping("/findVedioByNominateByDesc")
@ResponseBody
public List<Vedio> findVedioByNominateByDesc(int nominate) {
try {
	
	List<Vedio> listv=vs.selectVedioByNominateByDesc(nominate);
	if(listv.size()!=0) {
		return listv;
	}
	else 
	    {return null ;}
 }catch (Exception e) {
	return null;
 }
}

@RequestMapping("/showVedioByPage")
@ResponseBody
public Bpage showVedioByPage(int limit,int offset) {
try {
	
	Bpage<Vedio> bpage =vs.showVedioByPage(limit, offset);
	List<Vedio> list=bpage.getRows();
	System.out.println(bpage.getTotal());
	System.out.println(list.size());
	for(Vedio a:list) {
		System.out.println(a);
	}
	if(bpage!=null) {
		return bpage;
	}
	else 
	    {return null ;}
 }catch (Exception e) {
	 System.err.println(e);
	return null;
 }
}

@RequestMapping("/deleteVedioById")
@ResponseBody
public  String deleteVedioById(int id) {
try {
	int result=vs.deleteVedioById(id);
	
	if(result==1) {
		return "ok";
	}
	else 
	    {return "filed" ;}
 }catch (Exception e) {
	 System.err.println(e);
	return "filed";
 }
}

@RequestMapping("/showVedioById")
@ResponseBody
public  Vedio showVedioById(int id) {
try {
	Vedio vedio=vs.selectVedioById(id);
	
	if(vedio!=null) {
		return vedio;
	}
	else 
	    {return  null ;}
 }catch (Exception e) {
	 System.err.println(e);
	return null;
 }
}

@RequestMapping("/updateVedio")
@ResponseBody
public String updateVedio(Vedio vedio,MultipartFile vedioImg,MultipartFile vedioFile,HttpServletRequest request) {
try {
	
 if(vedioImg!=null) {
	String vedioImgSrc=fuu.fileUp(vedioImg, request);
	vedio.setVedioImgSrc(vedioImgSrc);
      }
 if(vedioFile!=null) {
    String vedioSrc=fuu.fileUp(vedioFile, request);
    vedio.setVedioSrc(vedioSrc);
      }
	Date now=new Date();
	vedio.setVedioDate(now);
	int result=vs.updateVedio(vedio);
	
	if(result==1) {
		return "ok";
	}
	else 
	    {return "filed" ;}
   }catch (Exception e) {
	   System.err.println(e);
	   System.out.println(vedio);
	return "filed";
   }
}
@PostMapping("/selectVedioByConditionByPage")
@ResponseBody
public Bpage selectVedioByConditionByPage(Vedio vedio,String date,int cpage,int limit) {
try {
	Bpage<Vedio> s= vs.selectVedioByConditionByPage(vedio, date, cpage, limit);
	
	return s;
	
   }catch (Exception e) {
	   System.err.println(e);
	   
	return null;
   }
}
@GetMapping("/wxShowAllVedio")
@ResponseBody
public List<Vedio> ShowAllVedio() {
	
try {
	List<Vedio> s= vs.selectAllVedio();
	
	return s;
	
   }catch (Exception e) {
	   System.err.println(e);
	   
	return null;
   }
}

}