package user.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import user.bean.UserImageDTO;

@Controller
@RequestMapping(value="user")
public class UserUploadController {

	@GetMapping(value="uploadForm")
	public String uploadForm() {
		return "user/uploadForm";
	}
	
	//-------------name="img"1개일경우------
	/*@PostMapping(value="upload")
	@ResponseBody
	public String upload(@ModelAttribute UserImageDTO userImageDTO,
						 @RequestParam MultipartFile img,
						 HttpSession session) {
		
		//가상폴더
		String filePath_lier = "D:\\spring\\workspace\\Chapter06_Web\\src\\main\\webapp\\WEB-INF\\storage";      
		//실제폴더
		String filePath = session.getServletContext().getRealPath("WEB-INF\\storage");
		System.out.println("실제폴더 = " + filePath);
		//이미지의 이름
		String fileName = img.getOriginalFilename();
		//파일복사
		//File file = new File(filePath_lier, fileName);
		File file = new File(filePath, fileName);
		
		try {
			img.transferTo(file);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		userImageDTO.setImage1(fileName);
		
		//DB
		
		
		return "<img src='/Chapter06_Web/storage/" + fileName +  "'/>";
	}*/
	//-----------name="img"  2개 이상일 경우------
	/*@PostMapping(value="upload")
	@ResponseBody
	public String upload(@ModelAttribute UserImageDTO userImageDTO,
						 @RequestParam MultipartFile[] img,
						 HttpSession session) {     
		//실제폴더
		String filePath = session.getServletContext().getRealPath("WEB-INF\\storage");
		System.out.println("실제폴더 = " + filePath);
		
		//이미지의 이름
		String fileName;
		File file;
		String result="";
		
		if(img[0] != null) {
			fileName = img[0].getOriginalFilename();
			file = new File(filePath, fileName);
			try {
				img[0].transferTo(file);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			result += "<span><img src='/Chapter06_Web/storage/" + fileName +  "'/></span>";
		}//if
		
		if(img[1] != null) {
			fileName = img[1].getOriginalFilename();
			file = new File(filePath, fileName);
			try {
				img[1].transferTo(file);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			result += "<span><img src='/Chapter06_Web/storage/" + fileName +  "'/></span>";
		}//if
		
		return result;
	}*/
	
	//----------------한번에 1개 선택 또는 여러개 선택
	@PostMapping(value="upload")
	@ResponseBody
	public String upload(@ModelAttribute UserImageDTO userImageDTO,
						 @RequestParam("img[]") List<MultipartFile> list,
						 HttpSession session) {     
		//실제폴더
		String filePath = session.getServletContext().getRealPath("WEB-INF\\storage");
		System.out.println("실제폴더 = " + filePath);
		
		//이미지의 이름
		String fileName;
		File file;
		String result="";
		
		//파일명만 모아서 DB로 보내기
		//~~~~;
		for(MultipartFile img : list) {
			fileName = img.getOriginalFilename();
			file = new File(filePath, fileName);
			try {
				img.transferTo(file);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			result += "<span><img src='/Chapter06_Web/storage/" + fileName +  "'/></span>";
		}//for

		return result;
	}
}
















