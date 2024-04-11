package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	 List<Friend> myFriend = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         String input;
         String[] mySplit;
         
         System.out.println("친구를 3명 등록해 주세요 [전화번호는 꼭 'xxx-xxxx-xxxx' 형태로 입력하세요]");
         for (int i = 0; i < 3; i++) {
             input = sc.nextLine();
             
             mySplit = input.split(" ");
             Friend friend = new Friend();
             try {
             friend.setName(mySplit[0]);
             friend.setHp(mySplit[1]);
             friend.setSchool(mySplit[2]);
             
             myFriend.add(friend); // 친구를 리스트에 추가
             } catch (ArrayIndexOutOfBoundsException e) {
            	 System.err.println("양식에 맞게 입력해주세요");
            	 --i;
             }
         }
         
         sc.close(); // 스캐너 종료
         
         // 등록된 친구 출력
         System.out.println("등록된 친구 리스트:");
         for (Friend friend : myFriend) {
             System.out.println(friend);
         }
     }
 }
