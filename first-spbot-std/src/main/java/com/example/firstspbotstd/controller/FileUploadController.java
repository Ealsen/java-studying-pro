package com.example.firstspbotstd.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    /**
     * 处理文件上传请求的POST接口。
     * 该接口接收一个昵称和一个文件，并将文件保存到服务器上的指定路径。
     *
     * @param nickname 用户提供的昵称（用于标识上传者）
     * @param photo    用户上传的文件（MultipartFile类型）
     * @param request  HttpServletRequest对象，用于获取上下文路径
     * @return 返回上传成功的信息
     * @throws IOException 如果文件保存过程中发生IO异常
     */
    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        // 打印用户提供的昵称
        System.out.println("昵称: " + nickname);

        // 获取并打印文件名
        System.out.println("文件名: " + photo.getOriginalFilename());

        // 获取并打印文件类型
        System.out.println("文件类型: " + photo.getContentType());

        // 获取文件上传的目标路径
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println("上传路径: " + path);

        // 调用私有方法保存文件
        saveFile(photo, path);

        // 返回上传成功的消息
        return "上传成功";
    }

    /**
     * 私有方法，用于将上传的文件保存到指定路径。
     *
     * @param photo 上传的文件（MultipartFile类型）
     * @param path  文件保存的目标路径
     * @throws IOException 如果文件保存过程中发生IO异常
     */
    private void saveFile(MultipartFile photo, String path) throws IOException {
        // 判断文件夹是否存在，如果不存在则创建
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs(); // 使用mkdirs()以确保创建所有必要的父目录
        }

        // 构建完整的文件路径
        File file = new File(dir, photo.getOriginalFilename());

        // 将文件保存到目标路径
        photo.transferTo(file);
    }
}
