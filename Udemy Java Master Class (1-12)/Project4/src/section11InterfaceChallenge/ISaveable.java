/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package section11InterfaceChallenge;

import java.util.List;

/**
 *
 * @author Manex
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
