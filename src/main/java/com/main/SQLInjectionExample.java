package com.main;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String username = getUserInput();
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
    }

    private static String getUserInput() {
        // 사용자로부터 입력 받는 로직
        return "TEST  2345dfsfsdg";
    }
}
						
						
						
						
						
						
						
						
						
						