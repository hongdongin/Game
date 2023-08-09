package com.ee.Service;

import java.util.List;

import com.ee.vo.TestInfoVO;

public interface TestInfoService {

	List<TestInfoVO> selectTestInfoList(TestInfoVO test);
}
