package com.example.demo.util;

import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {

    public static boolean isWindows() {
        return System.getProperties().getProperty("os.name").toUpperCase().contains("WINDOWS");
    }

    public static String getExtension(String contentType) {
        MimeTypes allTypes = MimeTypes.getDefaultMimeTypes();
        String extension = null;
        try {
            extension = allTypes.forName(contentType).getExtension();
        } catch (MimeTypeException e) {
            e.printStackTrace();
        }
        return extension;
    }

    public static String save(MultipartFile file, HttpServletRequest request) {
        String bigType = file.getContentType().split("/")[0];
        System.out.println("bigtype_____________---------"+bigType);
        String extension = getExtension(file.getContentType());
        SimpleDateFormat df = new SimpleDateFormat(File.separator + "yyyy" + File.separator + "MM" + File.separator + "dd");
        Date now = new Date();

        String uploadPath = File.separator + Constants.UPLOAD_DIRECTORY + File.separator + bigType;
        String fileName = now.getTime() + "_" + request.getSession().getId() + extension;

        String dirPath = (isWindows() ? Constants.DRIVE_LETTER + ":" : Constants.COMPUTER_USER_NAME + "") + uploadPath + df.format(now);
        String filePath = dirPath + File.separator + fileName;
        String returnPath = filePath.substring(filePath.indexOf(uploadPath)).replaceAll("\\\\", "/");

        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(filePath);
        try {
            file.transferTo(newFile);
            return returnPath;
        } catch (IOException e) {
            return null;
        }
    }
    public static String savetest(MultipartFile file, HttpServletRequest request,Integer id) {
        String bigType = file.getContentType().split("/")[0];
        System.out.println("bigtype_____________---------"+bigType);
        String extension = getExtension(file.getContentType());
        SimpleDateFormat df = new SimpleDateFormat(File.separator + "yyyy" + File.separator + "MM" + File.separator + "dd");
        Date now = new Date();

        String uploadPath = File.separator + Constants.UPLOAD_DIRECTORY + File.separator + bigType;
        String fileName = "编号"+id;

        String dirPath = (isWindows() ? Constants.DRIVE_LETTER + ":" : Constants.COMPUTER_USER_NAME + "") + uploadPath + df.format(now);
        String filePath = dirPath + File.separator + fileName;
        String returnPath = filePath.substring(filePath.indexOf(uploadPath)).replaceAll("\\\\", "/");

        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(filePath);
        try {
            file.transferTo(newFile);
            return returnPath;
        } catch (IOException e) {
            return null;
        }
    }

    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                //System.out.println("删除单个文件" + fileName + "成功！");
                return true;
            } else {
                //System.out.println("删除单个文件" + fileName + "失败！");
                return false;
            }
        } else {
            //System.out.println("删除单个文件失败：" + fileName + "不存在！");
            return false;
        }
    }

}
