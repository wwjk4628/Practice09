package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javaex.ex02.Friend;

public class GoodsApp {

	public static void main(String[] args) {
		List<Goods> myGoods = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String input = null;
		String[] mySplit;
		
		System.out.println("상품을 입력해주세요 (종료 q)");
		while (input != "q") {
			input = sc.next();
			if (input.equals("q")) {
				System.out.println("종료");
				break;
			}else {
				
				mySplit = input.split(",");
				Goods a = new Goods();
				
				a.setName(mySplit[0]);
				a.setPrice(Integer.parseInt(mySplit[1]));
				a.setCount(Integer.parseInt(mySplit[2]));
				myGoods.add(a);
			}

		}
		sc.close(); // 스캐너 종료
		System.out.println("등록된 상품 리스트:");
		
        for (Goods a : myGoods) {
            System.out.println(a);       
        }
        int totalCount = 0;
        for (Goods goods : myGoods) {
            totalCount += goods.getCount();
        }
        System.out.println("총 수량: " + totalCount);
    }
	}

