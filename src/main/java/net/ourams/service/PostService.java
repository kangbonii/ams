package net.ourams.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ourams.dao.PostDao;
import net.ourams.vo.PostVo;

@Service
public class PostService {
	
	@Autowired
	private PostDao postDao;
	
	public Map<String, Object> selectPostPaging( int pageNo){
		int listSize = 10 ;
		int pageNo1 = 1+listSize*(pageNo-1);
		int pageNo2 = listSize*pageNo;
		int countPage = postDao.countPost();
		System.out.println("countPage"+countPage);
		int maxPage = (int)Math.ceil((double)countPage/listSize);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageNo1", pageNo1);
		map.put("pageNo2", pageNo2);
		List<PostVo> list = postDao.selectPaging(map);
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("list", list);
		map2.put("maxPage", maxPage);
		return map2;
	}
	public PostVo read(int postNo) {
		postDao.updateHit(postNo);
		PostVo PostVo = postDao.selectNotice(postNo);
		return PostVo;
	}

	public int write(PostVo postVo) {
		System.out.println(postVo.toString());
		return postDao.insert(postVo);
	}
	
	public int update(PostVo postVo) {
		System.out.println(postVo.toString());
		return postDao.update(postVo);
	}

	public int delete(PostVo postVo) {
		System.out.println(postVo.toString());
		return postDao.delete(postVo);
	}

	public PostVo modifyform(int postNo) {
		PostVo postVo = postDao.selectNotice(postNo);
		return postVo;
	}

	public int modify(PostVo postVo) {
		return postDao.update(postVo); 
	}

	public List<PostVo> searchList(String postTitle){
		List<PostVo> list = postDao.searchList(postTitle);
		return list;
	}
	

}
