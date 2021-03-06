package org.luxoft.interview.movie.domain;

import java.io.Serializable;
import java.util.List;

import org.luxoft.interview.movie.model.User;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiRequest implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty
	private List<Integer> movieList;
	@JsonProperty
    private Integer movieId;
	@JsonProperty
    private String comment;
	@JsonProperty
    private User user;
}
