package com.example.demo.service;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Audio;
import com.example.demo.entity.AudioExample;
import com.example.demo.entity.Vedio;
import com.example.demo.entity.VedioExample;
import com.example.demo.mapper.AudioMapper;
import com.example.demo.mapper.VedioMapper;
import com.example.demo.util.Bpage;
@Service
public class AudioService {



	@Autowired
	private AudioMapper am;
	//插入
@Transactional
public int insertAudio(Audio v) {
	int result= am.insertSelective(v);
//	VedioExample vedioExample=new VedioExample();
//	VedioExample.Criteria criteria=vedioExample.createCriteria();
//	criteria.andVedioIdEqualTo(1) ; //条件放里面
//	vm.selectByExample(vedioExample); //查询还是由example来完成
	return result;
}
   //根据id查找
public Audio selectAudioById(int id) {
	Audio audio=am.selectByPrimaryKey(id);
	return audio;
//	VedioExample vedioExample=new VedioExample();
//	VedioExample.Criteria criteria=vedioExample.createCriteria();
//	criteria.andVedioIdEqualTo(1) ; //条件放里面
//	Vedio vedio=vm.selectByExample(vedioExample); //查询还是由example来完成
	
}
  //根据id删除
public int deleteAudioById(int id) {
	int  result =am.deleteByPrimaryKey(id);
	return result;
}
 //修改
public int updateAudio(Audio audio) {
	int result=am.updateByPrimaryKeySelective(audio);
	return result;
}
//查找所有的vedio by 推荐num 截取前三个
public List<Audio> selectAudioByNominateByDesc( int nominate) {
	List<Audio> lista=am.selectAudioByNominateByDesc(nominate) ;//查询还是由example来完成
	return lista;
}
//分页查询
public Bpage showAudioByPage( int limit ,int offset ) {
	HashMap<String ,Object> map=new HashMap(); 
	AudioExample audioExample=new AudioExample();
	AudioExample.Criteria criteria=audioExample.createCriteria();
	//criteria. //条件放里面
	int num=am.countByExample(audioExample);
	map.put("startindex", offset);
	map.put("pagesize",limit);
	List<Audio> list=am.selectAudioByPage(map);
	Bpage<Audio> bpage=new Bpage<Audio>();
	bpage.setRows(list);
	bpage.setTotal(num);
	System.out.println(num);
//	for(Vedio a:list) {
//		System.out.println(a);
//	}
	return bpage;
}
 //根据条件查询
public Bpage selectAudioByConditionByPage(Audio audio,String date,int cpage,int limit) throws ParseException {

	/*if(date!=null&& date.trim()!="") {
	Date now = new SimpleDateFormat("yyyy-MM-dd").parse(date);
	vedio.setVedioDate(now);
	}*/
	
		HashMap<String ,Object> map=new HashMap(); 
		int offset=(cpage-1)*limit;
		map.put("startindex", offset);
		map.put("pagesize",limit);
		map.put("audio", audio);
		map.put("date", date);
		List<Audio>list= am.selectAudioByConditionByPage(map);
		Bpage<Audio> bpage=new Bpage<Audio>();
		int count= am.countByExample( new AudioExample());
		bpage.setTotal(count);
		
		bpage.setRows(list);
		
		
		return bpage;
	
	
	
   }
////查找所有的vedio by 推荐num
public List<Audio> selectAllAudio( ) {
	
	AudioExample audioExample=new AudioExample();
	//VedioExample.Criteria criteria=vedioExample.createCriteria();
	//criteria.andVedioNominateEqualTo(nominate) ; //条件放里面
	List<Audio> lista=am.selectByExample(audioExample); //查询还是由example来完成
	return lista;
 }
}


