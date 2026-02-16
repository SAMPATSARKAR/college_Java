enum ApiError{
    INVALID_REQUEST(404,"Invalid Request"),
    SERVER_CRASH(500,"Server Crash");

    final int code;
    final String message;

    ApiError(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
class main{
    int code;
    int msg;
    public static void main(String[] args){
        ApiError err = ApiError.SERVER_CRASH;
        System.out.println(err);
        System.out.println(err.code);
        System.out.println(err.message);    

}
}