package 회원정보관리프로그램;

public class Controller {
	JoinDAO dao = new JoinDAO();
	
	// main에서 사용자가 요청
	// 요청을 JoinDAO로 보내주는 역할
	
	// DAO가 보내준 결과값을 처리하여
	// Main으로 결과값 전송
	
	
	// main에서 회원가입 진행위해 id, pw, name을 보내주면
	// 받아주는 메서드
	public void join(JoinDTO dto) {
		int row = dao.join(dto);
		// row
		if (row>0) System.out.println("회원가입 성공!");
		else  System.out.println("회원가입 실패!");
	}

	
	public void delete(JoinDTO dto) {
		int row = dao.delete(dto);
		// row
		if (row>0) System.out.println("회원 삭제 성공!");
		else  System.out.println("회원 삭제 실패!");
	}
	
	
	
	
	
	
	
	
	
	
	
	public void search(JoinDTO dto) {
		JoinDTO res = dao.search(dto);
		if (res != null) System.out.println(res.getId());
		else  System.out.println("없는 회원정보입니다!");
	}

	
	
	
	
}
