package com.mybatis3.typeHandlers;

import com.mybatis3.domain.PhoneNumber;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author User
 */
public class PhoneTypeHandler extends BaseTypeHandler<PhoneNumber> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i,
                                    PhoneNumber parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getAsString());
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet rs, String columnName)
            throws SQLException {
        return new PhoneNumber(rs.getString(columnName));
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet rs, int columnIndex)
            throws SQLException {
        return new PhoneNumber(rs.getString(columnIndex));
    }

    @Override
    public PhoneNumber getNullableResult(CallableStatement cs, int columnIndex)
            throws SQLException {
        return new PhoneNumber(cs.getString(columnIndex));
    }
}
