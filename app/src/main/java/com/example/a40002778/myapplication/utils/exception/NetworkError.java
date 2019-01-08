//package com.example.a40002778.myapplication.utils.exception;
//
//import com.example.a40002778.myapplication.R;
//import com.example.a40002778.myapplication.utils.AndroidResourceFactory;
//import com.example.a40002778.myapplication.utils.AndroidResourceProvider;
//import org.apache.http.conn.ConnectTimeoutException;
//
//import javax.net.ssl.SSLHandshakeException;
//import javax.net.ssl.SSLPeerUnverifiedException;
//import java.net.SocketTimeoutException;
//import java.net.UnknownHostException;
//
//public class NetworkError extends BaseException {
////    public NetworkError(String cause) {
////        super(cause);
////    }
////
////    public NetworkError(String causeOfError, String suggestion) {
////        super(causeOfError, suggestion);
////    }
//    /**
//     * Default constructor for Network error which is to be used in case of No response from server.
//     */
//    public NetworkError(){
//        super( AndroidResourceFactory.Companion.getInstance(R.string.alert_network_no_response_from_server)
//                ,ResourceUtils.instance().getString(R.string.alert_common_suggestion));
//    }
//
//    /**
//     * Constructor for Network error which receives only the cause of error
//     * and provided a common suggestion.
//     */
//    public NetworkError(String cause){
//        super( cause
//                ,ResourceUtils.instance().getString(R.string.alert_common_suggestion);
//    }
//
//    /**
//     * Constructor for Network error which receives only the cause of error
//     * and provided a common suggestion.
//     */
//    public NetworkError(String cause, String suggestion){
//        super(cause, suggestion);
//    }
//
//    /**
//     * Parse a {@link Throwable} thrown from network layer in this object with error messages
//     * for some common type of Exceptions.
//     *
//     * <h1>Any unsupported type of Exception will throw {@link UnsupportedOperationException}</h1>
//     *
//     * Supported errors are:
//     * <ul>
//     *     <li>{@link SocketTimeoutException}</li>
//     *     <li>{@link UnknownHostException}</li>
//     *     <li>{@link SSLPeerUnverifiedException}</li>
//     *     <li>{@link SSLHandshakeException}</li>
//     * </ul>
//     * @param throwable {@link UnsupportedOperationException} to be thrown
//     *                                                       if any unsupported type is provided
//     */
//    public NetworkError(Throwable throwable){
//        if (throwable instanceof SocketTimeoutException) {
//
//            super( ResourceUtils.instance().getString(R.string.alert_network_connection_timed_out),
//                    ResourceUtils.instance().getString(R.string.alert_common_suggestion));
//        }  else if (throwable instanceof UnknownHostException ) {
//            super( ResourceUtils.instance().getString(R.string.alert_network_no_network_connection)
//                    ,ResourceUtils.instance().getString(R.string.alert_common_suggestion));
//        } else if (throwable instanceof SSLPeerUnverifiedException
//                || throwable instanceof SSLHandshakeException) {
//            super( ResourceUtils.instance().getString(R.string.alert_network_ssl_error)
//                    ,ResourceUtils.instance().getString(R.string.alert_common_suggestion));
//        }else{
//            throw new UnsupportedOperationException();
//        }
//    }
//}
