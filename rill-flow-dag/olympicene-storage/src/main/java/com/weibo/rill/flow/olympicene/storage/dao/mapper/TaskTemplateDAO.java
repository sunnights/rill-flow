/*
 *  Copyright 2021-2023 Weibo, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.weibo.rill.flow.olympicene.storage.dao.mapper;

import com.weibo.rill.flow.olympicene.storage.dao.model.TaskTemplateDO;
import com.weibo.rill.flow.olympicene.storage.dao.model.TaskTemplateParams;
import com.weibo.rill.flow.olympicene.storage.dao.provider.TaskTemplateProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TaskTemplateDAO {
    @InsertProvider(type = TaskTemplateProvider.class, method = "insert")
    long insert(TaskTemplateDO taskTemplateDO);

    @SelectProvider(type = TaskTemplateProvider.class, method = "getTaskTemplateList")
    List<TaskTemplateDO> getTaskTemplateList(TaskTemplateParams params);

    @UpdateProvider(type = TaskTemplateProvider.class, method = "update")
    int update(TaskTemplateDO taskTemplateDO);
}
