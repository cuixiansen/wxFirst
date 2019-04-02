package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vedio;
import com.example.demo.entity.VedioExample;
import com.example.demo.mapper.VedioMapper;

@Service
public class VedioService {
	@Autowired
	private VedioMapper vm;
	//插入
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
	return id;
}
 //修改
public int updateVedio(Vedio vedio) {
	int result=vm.updateByPrimaryKey(vedio);
	return result;
}

}
