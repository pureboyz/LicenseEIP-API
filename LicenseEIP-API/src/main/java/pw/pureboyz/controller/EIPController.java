package pw.pureboyz.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pw.pureboyz.service.EIPService;
import pw.pureboyz.vo.QuestionVO;

@RestController
public class EIPController
{
	@Autowired EIPService eipService;
	
	@RequestMapping("/SelectQuestionList")
	public List<JSONObject> ServiceQuestionList(QuestionVO questionVO)
	{
		return eipService.SelectQuestionList(questionVO);
	}
	
	@RequestMapping("/SelectRoundList")
	public List<JSONObject> SelectRoundList()
	{
		return eipService.SelectRoundList();
	}
}
