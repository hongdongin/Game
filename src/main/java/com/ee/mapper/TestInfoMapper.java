package com.ee.mapper;

import java.util.List;

import com.ee.vo.TestInfoVO;

public interface TestInfoMapper {

	List<TestInfoVO> selectTestInfoList(Object object);

}
