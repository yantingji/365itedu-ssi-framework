/*
 * Copyright (C) 2013～2023 上海颐凡软件科技有限公司
 * Yfann Software Technology (Shanghai) Co.,LTD  
 * All Rights Reserved.
 * 公司网址: www.yfann.com
 * 365IT教育网，成就您高品质的国际软件架构师之梦！
 * 平台网址:
 *         www.365itedu.com
 */

package com.itedu365.ssi.framework.dao;

/**
 * UpdateDAO封装接口。
 * @since V1.0
 * @version 版本1.0 2013.10.20
 * @author 颜廷吉
 */
public interface UpdateDAO {

    /**
     * 根据指定的sqlId，执行SQL，返回结果件数。<br/>
     * 执行SQL种类有「insert, update delete」。
     * @param sqlId 执行SQL的Id
     * @param bindParams SQL的参数
     * @return SQL的执行结果
     */
    int execute(String sqlId, Object bindParams);

}
