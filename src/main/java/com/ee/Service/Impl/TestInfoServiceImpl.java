package com.ee.Service.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ee.Service.TestInfoService;
import com.ee.common.MybatisSqlSessionFactory;
import com.ee.mapper.TestInfoMapper;
import com.ee.vo.TestInfoVO;

public class TestInfoServiceImpl implements TestInfoService {
	private SqlSessionFactory ssf = MybatisSqlSessionFactory.getSqlSessionFactory();

	@Override
	public List<TestInfoVO> selectTestInfoList(TestInfoVO test) {
		try (SqlSession session = ssf.openSession()) {
			TestInfoMapper tiMapper = session.getMapper(TestInfoMapper.class);
			return tiMapper.selectTestInfoList(test);
		}
	}

}
