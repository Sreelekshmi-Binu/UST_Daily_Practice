package com.Int.ust.bean;

import com.Int.ust.service.User;

public class CredentialsBean implements User{
	public static boolean isValidCredentials(String userName, String password) {
 
        if ("AD-001".equals(userName) && "AD-001".equals(password)) {
            return true;
        } else if ("AD-002".equals(userName) && "AD-002".equals(password)) {
            return true;
        } else if ("AD-003".equals(userName) && "AD-003".equals(password)) {
            return true;
        } else if ("AD-004".equals(userName) && "AD-004".equals(password)) {
            return true;
        }
        return false;
    }

	@Override
	public String login(CredentialsBean credentialsBean) {
		// TODO Auto-generated method stub
		return null;
	}
}
