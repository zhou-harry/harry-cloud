package com.harry.common.core.exception.user;

import com.harry.common.core.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author harry
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
