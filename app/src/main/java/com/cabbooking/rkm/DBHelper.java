package com.cabbooking.rkm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by RamaKrishna Math Chennai on 09-09-2016.
 */
public class DBHelper extends SQLiteOpenHelper
{

    /* Static Strings */

    public static final String DATABASE_NAME =  "CabBooking.db";

    /**
        Users Table Definition
     */
    public static final String USERS_TABLE = "Users";
    public static final String USERS_COLUMN_ID = "GlobalUserId";
    public static final String USERS_COLUMN_NAME = "Name";
    public static final String USERS_COLUMN_EMAIL = "Email";
    public static final String USERS_COLUMN_PASSWORD = "Password";
    public static final String USERS_COLUMN_USERROLEID = "UserRoleId";
    public static final String USERS_COLUMN_IS_AVAILABLE = "IsAvailable";

    /**
     Booking Table Definition
 */
    public static final String BOOKING_TABLE = "Booking";

    public static final String BOOKING_COLUMN_ID = "GlobalBookingTransactionId";
    public static final String BOOKING_COLUMN_CABID = "CabId";
    public static final String BOOKING_COLUMN_DRIVERID = "DriverId";
    public static final String BOOKING_COLUMN_BOOKING_REQUESTER_ID = "BookingRequesterId";
    public static final String BOOKING_COLUMN_PLACE_OF_PICKUP = "PlaceOfPickup";
    public static final String BOOKING_COLUMN_PLACE_OF_VISIT = "PlaceOfVisit";
    public static final String BOOKING_COLUMN_PICKUP_DATETIME = "PickupDateTime";
    public static final String BOOKING_COLUMN_NUMBER_OF_PERSONS = "NumberOfPersons";
    public static final String BOOKING_COLUMN_REQUIRED_HOURS = "RequiredHours";
    public static final String BOOKING_COLUMN_REASON_FOR_TRAVEL = "ReasonForTravel";
    public static final String BOOKING_COLUMN_IS_APPROVED = "IsApproved";
    public static final String BOOKING_COLUMN_APPROVEDDATE = "ApprovedDate";
    public static final String BOOKING_COLUMN_APPROVEDBY = "ApprovedBy";
    public static final String BOOKING_COLUMN_IS_TRAVEL_COMPLETE = "IsTravelComplete";
    public static final String BOOKING_COLUMN_TRAVEL_COMPLETE_DATETIME = "TravelCompleteDateTime";
    public static final String BOOKING_COLUMN_CREATED_DATETIME = "CreatedDateTime";
    public static final String BOOKING_COLUMN_CREATED_BY = "CreatedBy";
    public static final String BOOKING_COLUMN_MODIFIED_DATETIME = "ModifiedDateTime";
    public static final String BOOKING_COLUMN_MODIFIEDBY = "ModifiedBy";

    /**
     UsersRole Table Definition
     */
    public static final String USERS_ROLE_TABLE = "UsersRole";

    public static final String USERS_ROLE_COLUMN_ID = "Id";
    public static final String USERS_ROLE_COLUMN_ROLENAME = "RoleName";

    /**
     UsersRolePermissions Table Definition
     */
    public static final String USERS_Role_Permission_TABLE = "UsersRolePermissions";

    public static final String USERS_Role_Permission_COLUMN_ID = "Id";
    public static final String USERS_Role_Permission_COLUMN_USERID = "GlobalUserId";
    public static final String USERS_Role_Permission_COLUMN_USERROLEID = "UsersRoleId";
    public static final String USERS_Role_Permission_COLUMN_PERMISSIONSID = "PermissionsId";

    /**
     BookingStatus Table Definition
     */
    public static final String BOOKING_STATUS_TABLE = "BookingStatus";

    public static final String BOOKING_STATUS_COLUMN_ID  = "Id";
    public static final String BOOKING_STATUS_COLUMN_STATUSNAME = "StatusName";

    /**
     Permissions Table Definition
     */
    public static final String PERMISSION_TABLE = "Permissions";

    public static final String PERMISSION_COLUMN_ID = "Id";
    public static final String PERMISSION_COLUMN_PERMISSIONSNAME = "PermissionsName";

    /**
     BookingStatusChangeTracker Table Definition
     */
    public static final String BOOKING_STATUS_CHANGE_TRACKER_TABLE = "BookingStatusChangeTracker";

    public static final String BOOKING_STATUS_CHANGE_TRACKER_COLUMN_ID = "Id";
    public static final String BOOKING_STATUS_CHANGE_TRACKER_COLUMN_GBTID = "GlobalBookingTransactionId";
    public static final String BOOKING_STATUS_CHANGE_TRACKER_COLUMN_STATUSCODE = "BookingStatusCode";
    public static final String BOOKING_STATUS_CHANGE_TRACKER_COLUMN_MODIFIEDDATE = "ModifiedDate";
    public static final String BOOKING_STATUS_CHANGE_TRACKER_COLUMN_MODIFIEDBY = "ModifiedBy";

    /**
     Cab Table Definition
     */
    public static final String CAB_TABLE = "Cab";

    public static final String CAB_COLUMN_ID = "Id";
    public static final String CAB_COLUMN_DESCRIPTION = "CabDescription";
    public static final String CAB_COLUMN_CAB_NUMBER = "CabNumber";
    public static final String CAB_COLUMN_IS_AVAILABLE = "IsAvailable";

    /**
     CabRepair Table Definition
     */
    public static final String CAB_REPAIR_TABLE = "CabRepair";

    public static final String CAB_REPAIR_COLUMN_ID = "Id";
    public static final String CAB_REPAIR_COLUMN_CABID = "CabId";
    public static final String CAB_REPAIR_COLUMN_DRIVERID = "DriverId";
    public static final String CAB_REPAIR_COLUMN_VEHICLE_CONDITION = "VehicleCondition";
    public static final String CAB_REPAIR_COLUMN_REPAIRDATE = "RepairDateTime";
    public static final String CAB_REPAIR_COLUMN_IS_READY_FOR_TRAVEL = "IsReadyForTravel";

    /* Create Table Commands

     */

    public static final String USERS_TABLE_SQL =  "create table Users " +
            " ( " +
            "GlobalUserId text primary key,Name text, Email text,Mobile text,Password text, UserRoleId text,IsAvailable boolean" +
            " ) " ;

   /* public static final String BOOKING_TABLE_SQL =  "create table Booking " +
            " ( " +
            " "
*/
    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(USERS_TABLE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }

    public void InsertUsers()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
    }

public void Main()
{

}
}