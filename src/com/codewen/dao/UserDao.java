package com.codewen.dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.codewen.entity.User;

public class UserDao extends HibernateDaoSupport {

	// public User add(User user) {
	// // TODO Auto-generated method stub
	// this.getHibernateTemplate().save(user);
	// return null;
	// }

	public User login(User user) {
		// TODO Auto-generated method stub
//		System.out.println("dao............login");
//		String hql = "from User where username=? and password=?";
//		List list = this.getHibernateTemplate().find(hql, user.getUsername(), user.getPassword());
//		if (list.size() > 0) {
//			return (User) list.get(0);
//		}
//		return null;
		
		User firstuser = new User();
		String hql = "from User user where user.username='"
				+ user.getUsername() + "' and user.password= '"
				+ user.getPassword() + "'";
		List<User> userlist = (List<User>) this.getHibernateTemplate().find(hql);
		if (userlist.size() > 0) {

			// 取出查询结果的第一个值，理论上数据库是没有重复的用户信息

			firstuser = userlist.get(0);

		}

		return firstuser;
	}

	
}
