package com.namarahul.namarahulcollab.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Utility class for mapping objects using ModelMapper.
 * Provides methods to map single objects and lists of objects to specified output classes.
 */
@Component
public class ObjectMapperUtils {

    private static ModelMapper modelMapper;

    @Autowired
    public ObjectMapperUtils(ModelMapper modelMapper) {
        ObjectMapperUtils.modelMapper = modelMapper;
    }

    /**
     * Maps a single object to the specified output class using ModelMapper.
     *
     * @param entity   The source object to map from.
     * @param outClass The target class to map to.
     * @param <D>      The type of the destination object.
     * @param <T>      The type of the source object.
     * @return The mapped object of type D.
     */
    public static <D, T> D map(final T entity, Class<D> outClass) {
        return modelMapper.map(entity, outClass);
    }

    /**
     * Maps a list of objects to a list of the specified output class using ModelMapper.
     *
     * @param entityList The list of source objects to map from.
     * @param outCLass   The target class to map to.
     * @param <D>        The type of the destination objects.
     * @param <T>        The type of the source objects.
     * @return A list of mapped objects of type D.
     */
    public static <D, T> List<D> mapAll(final List<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> modelMapper.map(entity, outCLass))
                .collect(Collectors.toList());
    }
}
