package pw.pureboyz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.json.simple.JSONObject;

import pw.pureboyz.vo.QuestionVO;

@Mapper
public interface EIPMapper
{
	List<JSONObject> SelectQuestionList(QuestionVO questionVO);
}
