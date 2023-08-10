package com.ee.common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Commonview {

	private static final String PREFIX = "/WEB-INF/views";
	private static final String SUFFIX = ".jsp";

	public static void forword(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String path = PREFIX + request.getRequestURL() + SUFFIX;
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

	public static String getCmd(HttpServletRequest request) {
		String uri = request.getRequestURI();
		int idx = uri.lastIndexOf("/") + 1;
		return uri.substring(idx);
	}

	public static void forwordMessage(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String path = "WEB-INF/views/common/message.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}
