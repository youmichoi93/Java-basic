public class BizException extends RuntimeException{
    public BizException(String msg){  //메세지를 가져와 super에게 보내는 생성자
        super(msg);
    }

    public BizException(Exception ex){ //Exception을 받아드려 이를 부모 생성자에게 넘겨주는 생성자
        super(ex);
    }
}
