package pw.pureboyz.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pw.pureboyz.mapper.EIPMapper;
import pw.pureboyz.vo.QuestionVO;

@Service
public class EIPService
{
	@Autowired EIPMapper eipMapper;

	public List<JSONObject> SelectQuestionList(QuestionVO questionVO)
	{
		return eipMapper.SelectQuestionList(questionVO);
	}
	
}
