package com.smallsoup.mybatis.dao;

import com.smallsoup.mybatis.pojo.ProjectAttachmentDo;

public interface ProjectAttachmentDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectAttachmentDo record);

    int insertSelective(ProjectAttachmentDo record);

    ProjectAttachmentDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProjectAttachmentDo record);

    int updateByPrimaryKey(ProjectAttachmentDo record);
}