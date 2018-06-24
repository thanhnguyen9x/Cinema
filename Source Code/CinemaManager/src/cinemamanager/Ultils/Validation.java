/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.Ultils;

import java.util.regex.Pattern;

/**
 *
 * @author Totoro
 */
public class Validation {

    public static final String USERNAME_PATTERN = "^[a-z0-9._-]{3,15}$";
    public static final String PASSWORD_PATTERN = "((?=.d)(?=.[a-z])(?=.[A-Z])(?=.[!.#$$_+,?-]).{8,50})";
    public static final String NUMBER_PATTERN = "[0-9]+";
    public static final String TEXT_PATTERN = "^[a-z0-9._-]";

    public boolean checkValidation(String regexPattern, String regex) {
        Pattern pattern = Pattern.compile(regexPattern);
        return pattern.matcher(regex).matches();
    }
}
