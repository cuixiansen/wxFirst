package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Audio;
import com.example.demo.entity.Vedio;
import com.example.demo.service.AudioService;
import com.example.demo.service.VedioService;
import com.example.demo.util.Bpage;
import com.example.demo.util.FileUpUtil;
@Controller
@RequestMapping("/audios")
public class AudioController {
	@Autowired
	AudioService as;
	@Autowired 
	FileUpUtil fuu;
	//测试配置能否访问的方法

@RequestMapping("/sendAudio")
public String sendAudio() {
	return "/audios/sendAudio";
}
@RequestMapping("/showAllAudio")
public String showAllVedio() {
	return "/audios/showAllAudio";
}
//插入
@RequestMapping("/addAudio")
@ResponseBody
public String addVedio(Audio audio,MultipartFile audioImg,MultipartFile audioFile,HttpServletRequest request) {
try {
	Date now=new Date();
	String audioImgSrc=fuu.fileUp(audioImg, request);
	String audioSrc=fuu.fileUp(audioFile, request);
	audio.setAudioImgSrc(audioImgSrc);
	audio.setAudioSrc(audioSrc);
	audio.setAudioDate(now);
	int result=as.insertAudio(audio);
	
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
@RequestMapping("/removeAudio")
@ResponseBody
public String removeAudio(int id) {
try {
	
	int result=as.deleteAudioById(id);
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
@RequestMapping("/findAudioById")
@ResponseBody
public Audio findAudioById(int id) {
try {
	
	Audio audio=as.selectAudioById(id);
	if(audio!=null) {
		return audio;
	}
	else 
	    {return null ;}
   }catch (Exception e) {
	return null;
   }
}

//查询推荐
@RequestMapping("/findAudioByNominateByDesc")
@ResponseBody
public List<Audio> findAudioByNominateByDesc(int nominate) {
try {
	
	List<Audio> listv=as.selectAudioByNominateByDesc(nominate);
	if(listv.size()!=0) {
		return listv;
	}
	else 
	    {return null ;}
 }catch (Exception e) {
	return null;
 }
}

@RequestMapping("/showAudioByPage")
@ResponseBody
public Bpage showAudioByPage(int limit,int offset) {
try {
	
	Bpage<Audio> bpage =as.showAudioByPage(limit, offset);
	List<Audio> list=bpage.getRows();
	System.out.println(bpage.getTotal());
	System.out.println(list.size());
	
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

@RequestMapping("/deleteAudioById")
@ResponseBody
public  String deleteAudioById(int id) {
try {
	int result=as.deleteAudioById(id);
	
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

@RequestMapping("/showAudioById")
@ResponseBody
public  Audio showAudioById(int id) {
try {
	Audio audio=as.selectAudioById(id);
	
	if(audio!=null) {
		return audio;
	}
	else 
	    {return  null ;}
 }catch (Exception e) {
	 System.err.println(e);
	return null;
 }
}

@RequestMapping("/updateAudio")
@ResponseBody
public String updateVedio(Audio audio,MultipartFile audioImg,MultipartFile audioFile,HttpServletRequest request) {
try {
	
 if(audioImg!=null) {
	String vedioImgSrc=fuu.fileUp(audioImg, request);
	audio.setAudioImgSrc(vedioImgSrc);
      }
 if(audioFile!=null) {
    String vedioSrc=fuu.fileUp(audioFile, request);
    audio.setAudioSrc(vedioSrc);
      }
	Date now=new Date();
	audio.setAudioDate(now);
	int result=as.updateAudio(audio);
	
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
@PostMapping("/selectAudioByConditionByPage")
@ResponseBody
public Bpage selectAudioByConditionByPage(Audio audio,String date,int cpage,int limit) {
try {
	Bpage<Audio> s= as.selectAudioByConditionByPage(audio, date, cpage, limit);
	
	return s;
	
   }catch (Exception e) {
	   System.err.println(e);
	   
	return null;
   }
}
@GetMapping("/wxShowAllAudio")
@ResponseBody
public List<Audio> ShowAllVedio() {
	
try {
	List<Audio> s= as.selectAllAudio();
	
	return s;
	
   }catch (Exception e) {
	   System.err.println(e);
	   
	return null;
   }
}


}
