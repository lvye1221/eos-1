/**
 * @(#)BigDecimalDeserializer
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 *<br> Copyright:  Copyright (c) 2014
 *<br> Company:厦门畅享信息技术有限公司
 *<br> @author ulyn
 *<br> 14-2-27 下午12:11
 *<br> @version 1.0
 *————————————————————————————————
 *修改记录
 *    修改者：
 *    修改时间：
 *    修改原因：
 *————————————————————————————————
 */
package com.sunsharing.eos.common.serialize.support.hessian;

import com.caucho.hessian.io.AbstractStringValueDeserializer;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * <pre></pre>
 * <br>----------------------------------------------------------------------
 * <br> <b>功能描述:</b>
 * <br>
 * <br> 注意事项:
 * <br>
 * <br>
 * <br>----------------------------------------------------------------------
 * <br>
 */
public class BigDecimalDeserializer extends AbstractStringValueDeserializer {
    @Override
    public Class getType() {
        return BigDecimal.class;
    }

    @Override
    protected Object create(String value) throws IOException {
        if (null != value) {
            return new BigDecimal(value);
        } else {
            return null;
        }
    }
}

