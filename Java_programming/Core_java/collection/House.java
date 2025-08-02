package p3;

import java.time.*;
import java.util.*;



class House {
    private ArrayList<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room getRoom(String name) {
        for (Room r : rooms) {
            if (r.getName().equalsIgnoreCase(name)) return r;
        }
        return null;
    }

    public void showHouseStatus() {
        for (Room r : rooms) {
            System.out.println("\nRoom: " + r.getName() + " (" + r.getRoomType() + ")");
            r.showStatus();
        }
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        House house = new House();

        while (true) {
            System.out.println("\n--- HOME AUTOMATION MENU ---");
            System.out.println("1. View Rooms");
            System.out.println("2. Add Room");
            System.out.println("3. Select Room");
            System.out.println("4. View All Devices Status");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    for (Room r : house.getRooms())
                        System.out.println("- " + r.getName() + " (" + r.getRoomType() + ")");
                    break;
                case 2:
                    System.out.print("Enter room name: ");
                    String roomName = sc.nextLine();
                    System.out.print("Enter room type (kitchen/bedroom/hall/washroom): ");
                    String roomType = sc.nextLine().toLowerCase();
                    Room newRoom = switch (roomType) {
                        case "kitchen" -> new Kitchen(roomName);
                        case "bedroom" -> new Bedroom(roomName);
                        case "hall" -> new Hall(roomName);
                        case "washroom" -> new Washroom(roomName);
                        default -> null;
                    };
                    if (newRoom != null) {
                        house.addRoom(newRoom);
                        System.out.println("Room added.");
                    } else {
                        System.out.println("Invalid room type.");
                    }
                    break;
                case 3:
                    System.out.print("Enter room to select: ");
                    String selectRoom = sc.nextLine();
                    Room room = house.getRoom(selectRoom);
                    if (room == null) {
                        System.out.println("Room not found.");
                        break;
                    }
                    handleRoomMenu(room, sc);
                    break;
                case 4:
                    house.showHouseStatus();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    public static void handleRoomMenu(Room room, Scanner sc) {
        while (true) {
            System.out.println("\n--- Room: " + room.getName() + " ---");
            System.out.println("1. View Devices");
            System.out.println("2. Add Device");
            System.out.println("3. Switch Device ON/OFF");
            System.out.println("4. Remove Device");
            System.out.println("5. Back");
            System.out.print("Choose: ");
            int opt = sc.nextInt(); sc.nextLine();

            switch (opt) {
                case 1:
                    room.showStatus();
                    break;
                case 2:
                    System.out.print("Enter device name: ");
                    String name = sc.nextLine();
                    System.out.print("Type (light/fan/ac/tv/shower): ");
                    String type = sc.nextLine().toLowerCase();
                    Device d = switch (type) {
                        case "light" -> new Light(name);
                        case "fan" -> new Fan(name);
                        case "ac" -> new AC(name);
                        case "tv" -> new TV(name);
                        case "shower" -> new Shower(name);
                        default -> null;
                    };
                    if (d != null) {
                        room.addDevice(d);
                        System.out.println("Device added.");
                    } else {
                        System.out.println("Invalid device type.");
                    }
                    break;
                case 3:
                    System.out.print("Enter device name: ");
                    String dname = sc.nextLine();
                    Device dev = room.getDevice(dname);
                    if (dev == null) {
                        System.out.println("Device not found.");
                        break;
                    }
                    if (dev.isOn()) {
                        dev.switchOff();
                        System.out.println(dev.name + " switched OFF.");
                    } else {
                        dev.switchOn();
                        System.out.println(dev.name + " switched ON.");
                    }
                    break;
                case 4:
                    System.out.print("Enter device name to remove: ");
                    String rem = sc.nextLine();
                    room.removeDevice(rem);
                    System.out.println("Device removed if it existed.");
                    break;
                case 5:
                    return;
            }
        }
    }
}
