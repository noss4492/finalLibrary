package kr.co.jhta.service;

import java.util.List;

import kr.co.jhta.dto.UserDTO;

public interface MemberService {
	public List<UserDTO> readAllMember();
	public UserDTO readOneMember(int uno);
	public void wrtieOneMember(UserDTO dto);
	public void changeOneMember(UserDTO dto);
	public void removeOneMember(int uno);
	public int getTotal();

}
