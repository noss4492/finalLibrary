package kr.co.jhta.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestWishBookDTO {
	long requestWishBookId;
	String generalBookId;
	long userId;
	String requestDate;
	byte status;
	String reply;
}
