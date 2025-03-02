package com.menu;

import com.book.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("loading...");
        load();
        boolean flag = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (flag) {
                System.out.println("========图书管理系统===========");
                System.out.println("1.录入图书数据");
                System.out.println("2.查询图书");
                System.out.println("3.删除图书");
                System.out.println("4.更改图书信息");
                System.out.println("5.退出图书管理系统");
                System.out.println("========图书管理系统===========");
                System.out.println("请输入您的选择：");

                if (scanner.hasNextInt()) {
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    switch (choice) {
                        case 1:
                            insertBook(scanner);
                            break;
                        case 2:
                            list();
                            queryBook(scanner);
                            break;
                        case 3:
                            list();
                            // 实现删除图书逻辑
                            deleteBook(scanner);
                            break;
                        case 4:
                            list();
                            // 实现更改图书信息逻辑
                            updateBook(scanner);
                            break;
                        case 5:
                            save();
                            System.out.println("退出成功");
                            flag = false;
                            break;
                        default:
                            System.out.println("输入错误，请重新输入");
                            break;
                    }
                } else {
                    System.out.println("输入错误，请输入数字选项");
                    scanner.next(); // 清除无效输入
                }
            }
        }
        System.out.println("欢迎下次使用");
    }

    @SuppressWarnings("unchecked")
    public static void load() {
        File file = new File(".\\src\\com\\book\\bookData.log");
        if (file.exists()) {
            try(ObjectInputStream stream = new ObjectInputStream(Files.newInputStream(Paths.get(".\\src\\com\\book\\bookData.log")))) {
                bookList = (List<Book>) stream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            bookList = new ArrayList<>();
        }
    }

    public static void save() {
        try (ObjectOutputStream stream = new ObjectOutputStream(Files.newOutputStream(Paths.get(".\\src\\com\\book\\bookData.log")))) {
            stream.writeObject(bookList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertBook(Scanner scanner) {
        System.out.println("========录入图书数据===========");
        String title = "";
        String author = "";
        long ISBN = 0;

        System.out.println("请输入图书的标题：");
        title = scanner.nextLine().trim();
        if (title.isEmpty()) {
            System.out.println("标题不能为空，请重新输入");
            return;
        }

        System.out.println("请输入图书的作者：");
        author = scanner.nextLine().trim();
        if (author.isEmpty()) {
            System.out.println("作者不能为空，请重新输入");
            return;
        }

        System.out.println("请输入图书的ISBN：");
        if (scanner.hasNextLong()) {
            ISBN = scanner.nextLong();
            scanner.nextLine(); // Consume newline left-over
        } else {
            System.out.println("ISBN格式错误，请输入有效的数字");
            scanner.nextLine(); // 清除无效输入
            return;
        }

        Book book = new Book(title, author, ISBN);
        bookList.add(book); // 将图书添加到列表中
        System.out.println("图书录入成功！");
    }

    public static void list() {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            System.out.println("图书索引: " + i);
            System.out.println("标题: " + book.getTitle());
            System.out.println("作者: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("-------------------------");
        }
    }

    public static void queryBook(Scanner scanner) {
        System.out.println("请输入要查询的图书索引：");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            if (index >= 0 && index < bookList.size()) {
                Book book = bookList.get(index);
                System.out.println("图书信息：");
                System.out.println("标题: " + book.getTitle());
                System.out.println("作者: " + book.getAuthor());
                System.out.println("ISBN: " + book.getISBN());
            } else {
                System.out.println("索引超出范围，请重新输入");
            }
        } else {
            System.out.println("输入错误，请输入有效的数字索引");
            scanner.next(); // 清除无效输入
        }
    }

    public static void deleteBook(Scanner scanner) {
        System.out.println("请输入要删除的图书索引：");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            if (index >= 0 && index < bookList.size()) {
                Book book = bookList.remove(index);
                System.out.println("删除图书成功！");
            } else {
                System.out.println("索引超出范围，请重新输入");
            }
        }
    }

    public static void updateBook(Scanner scanner) {
        System.out.println("请输入要更改的图书索引：");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            if (index >= 0 && index < bookList.size()) {
                Book book = bookList.get(index);

                System.out.println("当前图书信息：");
                System.out.println("标题: " + book.getTitle());
                System.out.println("作者: " + book.getAuthor());
                System.out.println("ISBN: " + book.getISBN());

                System.out.println("请输入新的图书标题（按回车键保持不变）：");
                String title = scanner.nextLine().trim();
                if (!title.isEmpty()) {
                    book.setTitle(title);
                }

                System.out.println("请输入新的图书作者（按回车键保持不变）：");
                String author = scanner.nextLine().trim();
                if (!author.isEmpty()) {
                    book.setAuthor(author);
                }

                System.out.println("请输入新的图书ISBN（必须输入数字）：");
                if (scanner.hasNextLong()) {
                    long ISBN = scanner.nextLong();
                    scanner.nextLine(); // Consume newline left-over
                    book.setISBN(ISBN);
                } else {
                    scanner.nextLine(); // 清除无效输入
                    System.out.println("ISBN格式错误，信息未更新");
                    return;
                }

                System.out.println("图书信息更新成功！");
            } else {
                System.out.println("索引超出范围，请重新输入");
            }
        } else {
            System.out.println("输入错误，请输入有效的数字索引");
            scanner.next(); // 清除无效输入
        }
    }

}
