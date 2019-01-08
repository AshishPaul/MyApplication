//package com.example.a40002778.myapplication.utils.exception;
//
//
//import org.apache.http.conn.ConnectTimeoutException;
//
//import javax.net.ssl.SSLHandshakeException;
//import javax.net.ssl.SSLPeerUnverifiedException;
//import java.net.ConnectException;
//import java.net.SocketTimeoutException;
//import java.net.UnknownHostException;
//
//public interface ErrorMapper<T> {
//    BaseException mapError(T error);
//    default BaseException mapError(Throwable t){
//        if(t==null){
//            return new UnknownError();
//        }
//
//        if (t instanceof SocketTimeoutException
//                || t instanceof ConnectException
//                || t instanceof UnknownHostException
//                || t instanceof SSLPeerUnverifiedException
//                || t instanceof SSLHandshakeException) {
//            return new NetworkError(t);
//        }else{
//            return new UnknownError();
//        }
//        //TODO implement later
//    }
//}
