package com.example.demo.util;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Component

public class FileUpUtil {
	private final static Logger logger = LoggerFactory.getLogger(FileUpUtil.class);

    /**
     * 单个文件上传
     *
     * @param file
     * @param request
     * @return
     */
//  @PostMapping("up")
    //@RequestMapping("up")
    public String fileUp(MultipartFile file, HttpServletRequest request) {
        try {
            logger.info("[接收到单个文件上传文件请求]");
            String fileDir = FileUtil.save(file, request);
            if (fileDir != null) {
            	System.out.println("[文件保存成功，地址为：]" + fileDir);
                logger.info("[文件保存成功，地址为：]" + fileDir);
                return fileDir;
            } else {
                logger.info("[文件保存失败]");
                return "filed";
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("[保存文件失败]", e);
            return "filed";
        }
    }
}
