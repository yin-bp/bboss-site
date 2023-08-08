package org.frameworkset.web.utf8;

import org.frameworkset.util.annotations.ResponseBody;
import org.frameworkset.web.multipart.MultipartFile;
import org.frameworkset.web.multipart.MultipartHttpServletRequest;
import org.frameworkset.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
 
/**
 * 
 * @Title: FormSubmintController.java
 * @Package com.frameworkset.demo.Formsubmint.web
 * @Description TODO(表单例子控制器)
 * @Copyright:Copyright (c) 2012
 * @Company: bboss
 * @author: yahui.hu
 * @Date:2012-1-17
 */
public class FormSubmintController {
	
	private static final int DOWNLOAD_BUFFER_SIZE = 1024;

	public ModelAndView main() {
		return new ModelAndView("path:main-success");
	}
	
	/**
	 * 普通表单
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView generalForm(SimplEntity en, HttpServletRequest request,
			HttpServletResponse response) {
		//System.out.println(request.getCharacterEncoding());
		return new ModelAndView("path:generalForm-success","simplEntity",en);
	}
	
	/**
	 * easyUiForm 表单
	 * @param request
	 * @param response
	 */
	public @ResponseBody(datatype="json") AjaxResponseBean easyUiForm(SimplEntity entity ,HttpServletRequest request, HttpServletResponse response){
		//System.out.println("cerator");
		AjaxResponseBean ajaxResponseBean=new AjaxResponseBean();
		ajaxResponseBean.setStatus("success");
		/***
		 * 当表单是通过ajax(jquery)提交的
		 * 提交上来的表单编码是 UTF-8 （默认）
		 * 服务器做出响应时需要将 response的编码设置成通request请求一样
		 * 普通表单提交的数据 request.getCharacterEncoding() 为NULL
		 * 而easyuifrom 是对于jquery的一个封装 所有一样要使用  而它提交的表单
		 * request.getCharacterEncoding() 是为 ：NULL
		 * 所以设置response.setCharacterEncoding("utf-8");
		 */	
	 
		ajaxResponseBean.setData( entity);
//		System.out.println(ajaxResponseBean.getData());
//		write(response, ajaxResponseBean);
		return ajaxResponseBean;
	}
	
	/**
	 * easyUiForm 表单
	 * @param request
	 * @param response
	 */
	public @ResponseBody(datatype="json") AjaxResponseBean easyUiFormGet(SimplEntity entity ,HttpServletRequest request, HttpServletResponse response){
		//System.out.println("cerator");
		AjaxResponseBean ajaxResponseBean=new AjaxResponseBean();
		ajaxResponseBean.setStatus("success");
		/***
		 * 当表单是通过ajax(jquery)提交的
		 * 提交上来的表单编码是 UTF-8 （默认）
		 * 服务器做出响应时需要将 response的编码设置成通request请求一样
		 * 普通表单提交的数据 request.getCharacterEncoding() 为NULL
		 * 而easyuifrom 是对于jquery的一个封装 所有一样要使用  而它提交的表单
		 * request.getCharacterEncoding() 是为 ：NULL
		 * 所以设置response.setCharacterEncoding("utf-8");
		 */	
	 
		ajaxResponseBean.setData( entity);
//		System.out.println(ajaxResponseBean.getData());
//		write(response, ajaxResponseBean);
		return ajaxResponseBean;
	}
	
	/**
	 * 普通ajax请求
	 * @param request
	 * @param response
	 */
	public @ResponseBody(datatype="json") AjaxResponseBean generalAjax(SimplEntity entity, HttpServletRequest request,HttpServletResponse response){
		AjaxResponseBean ajaxResponseBean=new AjaxResponseBean();
		ajaxResponseBean.setStatus("success");
		/***
		 * 当表单是通过ajax(jquery)提交的
		 * 提交上来的表单编码是 UTF-8 （默认）
		 * 服务器做出响应时需要将 response的编码设置成通request请求一样
		 * 普通表单提交的数据 request.getCharacterEncoding() 为NULL
		 * 
		 */		
		 
		 
			ajaxResponseBean.setData( entity);
//			System.out.println(ajaxResponseBean.getData());
//			write(response, ajaxResponseBean);
			return ajaxResponseBean;
		  
	}
	
	/**
	 * 普通ajax请求(GET)
	 * @param request
	 * @param response
	 */
	public @ResponseBody(datatype="json") AjaxResponseBean generalAjaxGet(SimplEntity entity, HttpServletRequest request,HttpServletResponse response){
		AjaxResponseBean ajaxResponseBean=new AjaxResponseBean();
		ajaxResponseBean.setStatus("success");
		/***
		 * 当表单是通过ajax(jquery)提交的
		 * 提交上来的表单编码是 UTF-8 （默认）
		 * 服务器做出响应时需要将 response的编码设置成通request请求一样
		 * 普通表单提交的数据 request.getCharacterEncoding() 为NULL
		 * 而easyuifrom 是对于jquery的一个封装 所有一样要使用  而它提交的表单
		 * request.getCharacterEncoding() 是为 ：NULL
		 * 所以设置response.setCharacterEncoding("utf-8");
		 */	
	 
		ajaxResponseBean.setData( entity);
//		System.out.println(ajaxResponseBean.getData());
//		write(response, ajaxResponseBean);
		return ajaxResponseBean;
	}
	
	/**
	 * 文件上传表单
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView  fileUploadForm(MultipartHttpServletRequest  request,HttpServletResponse response){		
		MultipartFile file = request.getFile("test");  
		try {
			File dir = new File("d:/mutifiles/");  
	        if(!dir.exists())  
	            dir.mkdirs();  
			file.transferTo(new File("d:/mutifiles/" + file.getOriginalFilename()));
			String fileName=file.getOriginalFilename();
			return new ModelAndView("path:fileUploadForm-success","fileName",fileName);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return new ModelAndView("path:fileUploadForm-error");		
	}
	
	/**
	 * 文件下载表单
	 * @param request
	 * @param response
	 */
	public void  flieDownloadForm(HttpServletRequest request,HttpServletResponse response){
		String path=request.getSession().getServletContext().getRealPath("/")+"\\demo\\formsubmint\\files\\iReport入门.pdf";
		//System.out.println(path);
		File file=new File(path);
		response.setHeader("Content-Disposition", "attachment;filename=\""
				+ encodFileName(file.getName()) + "\"");
		byte[] b = new byte[DOWNLOAD_BUFFER_SIZE];
		int len = 0;
		try {
			FileInputStream in=new FileInputStream(file);
			ServletOutputStream out = response.getOutputStream();
			boolean bool;
			try {
				while ((len = in.read(b)) > 0) {
					out.write(b, 0, len);
				}
				out.flush(); 

			} catch (IOException e) {
				e.printStackTrace();
				bool = false;
			} finally {

				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
						bool = false;
					}
				}
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
						bool = false;
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 
	
	/**
	 * 把文件名转换成UTF-8编码
	 * 
	 * @param s
	 *            要转换的String
	 * @return
	 */
	public String encodFileName(String s) {
		StringBuffer sb = new StringBuffer();

		if (s.getBytes().length > 32) {
			try {
				return new String(s.getBytes("UTF-8"), "ISO8859-1");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 0 && c <= 255) {
				sb.append(c);
			} else {
				byte[] b;
				try {
					b = Character.toString(c).getBytes("utf-8");
				} catch (Exception ex) {
					b = new byte[0];
				}
				for (int j = 0; j < b.length; j++) {
					int k = b[j];
					if (k < 0)
						k += 256;
					sb.append("%" + Integer.toHexString(k).toUpperCase());
				}
			}
		}
		return sb.toString();
	}

}
