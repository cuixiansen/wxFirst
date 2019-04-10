package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.entity.Vedio;
import com.example.demo.entity.VedioExample;
import com.example.demo.mapper.VedioMapper;
import com.example.demo.util.Bpage;



@Service
public class VedioService {
	@Autowired
	private VedioMapper vm;
	//插入
@Transactional
public int insertVedio(Vedio v) {
	int result= vm.insertSelective(v);
//	VedioExample vedioExample=new VedioExample();
//	VedioExample.Criteria criteria=vedioExample.createCriteria();
//	criteria.andVedioIdEqualTo(1) ; //条件放里面
//	vm.selectByExample(vedioExample); //查询还是由example来完成
	return result;
}
   //根据id查找
public Vedio selectVedioById(int id) {
	Vedio vedio=vm.selectByPrimaryKey(id);
	return vedio;
//	VedioExample vedioExample=new VedioExample();
//	VedioExample.Criteria criteria=vedioExample.createCriteria();
//	criteria.andVedioIdEqualTo(1) ; //条件放里面
//	Vedio vedio=vm.selectByExample(vedioExample); //查询还是由example来完成
	
}
  //根据id删除
public int deleteVedioById(int id) {
	int  result =vm.deleteByPrimaryKey(id);
	return result;
}
 //修改
public int updateVedio(Vedio vedio) {
	int result=vm.updateByPrimaryKeySelective(vedio);
	return result;
}
//查找所有的vedio by 推荐num bydesc
public List<Vedio> selectVedioByNominateByDesc( int nominate) {
	List<Vedio> listv=vm.selectVedioByNominateByDesc(nominate) ;//查询还是由example来完成
	return listv;
}
//分页查询
public Bpage showVedioByPage( int limit ,int offset ) {
	HashMap<String ,Object> map=new HashMap(); 
	VedioExample vedioExample=new VedioExample();
	VedioExample.Criteria criteria=vedioExample.createCriteria();
	//criteria. //条件放里面
	int num=vm.countByExample(vedioExample);
	map.put("startindex", offset);
	map.put("pagesize",limit);
	List<Vedio> list=vm.selectVedioByPage(map);
	Bpage<Vedio> bpage=new Bpage<Vedio>();
	bpage.setRows(list);
	bpage.setTotal(num);
	System.out.println(num);
	for(Vedio a:list) {
		System.out.println(a);
	}
	return bpage;
}
 //根据条件查询
public Bpage selectVedioByConditionByPage(Vedio vedio,String date,int cpage,int limit) throws ParseException {

	/*if(date!=null&& date.trim()!="") {
	Date now = new SimpleDateFormat("yyyy-MM-dd").parse(date);
	vedio.setVedioDate(now);
	}*/
	System.out.println(vedio);
		HashMap<String ,Object> map=new HashMap(); 
		int offset=(cpage-1)*limit;
		map.put("startindex", offset);
		map.put("pagesize",limit);
		map.put("vedio", vedio);
		map.put("date", date);
		List<Vedio>list= vm.selectVedioByConditionByPage(map);
		int count= vm.countByExample( new VedioExample());
		Bpage<Vedio> bpage=new Bpage<Vedio>();
		bpage.setRows(list);
		bpage.setTotal(count);
		
		
		return bpage;
	
	
	
   }
////查找所有的vedio by 推荐num
public List<Vedio> selectAllVedio( ) {
	
	VedioExample vedioExample=new VedioExample();
	//VedioExample.Criteria criteria=vedioExample.createCriteria();
	//criteria.andVedioNominateEqualTo(nominate) ; //条件放里面
	List<Vedio> listv=vm.selectByExample(vedioExample); //查询还是由example来完成
	return listv;
}
}
