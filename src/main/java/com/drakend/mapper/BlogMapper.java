package com.drakend.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.drakend.model.BlogModel;

public class BlogMapper implements RowMapper<BlogModel> {

	@Override
	public BlogModel mapRow(ResultSet rs) {
		try {
			BlogModel blogs = new BlogModel();
			blogs.setId(rs.getLong("id"));
			blogs.setTitle(rs.getString("title"));
			blogs.setContent(rs.getString("content"));
			blogs.setCategoryId(rs.getLong("categoryid"));
			blogs.setThumbnail(rs.getString("thumbnail"));
			blogs.setShortDescription(rs.getString("shortdescription"));
			blogs.setCreatedDate(rs.getTimestamp("createddate"));
			blogs.setCreatedBy(rs.getString("createdby"));
			if (rs.getTimestamp("modifieddate") != null) {
				blogs.setModifiedDate(rs.getTimestamp("modifieddate"));
			}
			if (rs.getString("modifiedby") != null) {
				blogs.setModifiedBy(rs.getString("modifiedby"));
			}
			return blogs;
		} catch (SQLException e) {
			return null;
		}
	}

}
