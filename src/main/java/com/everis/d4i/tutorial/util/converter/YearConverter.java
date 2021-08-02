package com.everis.d4i.tutorial.util.converter;

import lombok.extern.log4j.Log4j2;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Year;

@Log4j2
@Converter(autoApply = true)
public class YearConverter implements AttributeConverter<Year, Short> {

	@Override
	public Short convertToDatabaseColumn(Year attribute) {
		short year = (short) attribute.getValue();
		log.info("Convert Year [" + attribute + "] to short [" + year + "]");
		return year;
	}

	@Override
	public Year convertToEntityAttribute(Short dbValue) {
		Year year = Year.of(dbValue);
		log.info("Convert Short [" + dbValue + "] to Year [" + year + "]");
		return year;
	}
}
