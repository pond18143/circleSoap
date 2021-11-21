/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circlesoapclient;

import java.util.Scanner;
/**
 *
 * @author poramet
 */
public class CircleSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("radius : ");
        System.out.println("CircleArea : "+circleArea(inp.nextDouble()));
        System.out.println("circumFerence : "+circumFerence(inp.nextDouble()));
    }

    private static double circleArea(double radius) {
        serviceclient.CircleService_Service service = new serviceclient.CircleService_Service();
        serviceclient.CircleService port = service.getCircleServicePort();
        return port.circleArea(radius);
    }

    private static double circumFerence(double radius) {
        serviceclient.CircleService_Service service = new serviceclient.CircleService_Service();
        serviceclient.CircleService port = service.getCircleServicePort();
        return port.circumFerence(radius);
    }
}
