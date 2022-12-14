/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damc.grupo3.reto1.model;

/**
 *This enum class is used to asign all the type of messages 
 * @author Alejandro
 */
public enum MessageType {
    SIGNIN_REQUEST, 
    SIGNUP_REQUEST, 
    OK_RESPONSE, 
    USER_ALREADY_EXISTS_RESPONSE, 
    USER_NOT_FOUND_RESPONSE, 
    PASSWORD_ERROR_RESPONSE, 
    ERROR_RESPONSE;
}