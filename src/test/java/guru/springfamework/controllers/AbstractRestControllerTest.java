package guru.springfamework.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/22/2017
 */
public abstract class AbstractRestControllerTest {

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}