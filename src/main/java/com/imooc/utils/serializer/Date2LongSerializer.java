package com.imooc.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * 将Date转换为正确的时间戳格式（1598196855000或者2020-08-23T15:34:15.000+0000->1598196855），
 * 然后在OrderDTO对应的createTime和updateTime上
 * 加上注解@JsonSerialize(using = Date2LongSerializer.class)即可
 */
public class Date2LongSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(date.getTime() / 1000);
    }
}
