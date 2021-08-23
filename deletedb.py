import mysql.connector

try:
    connection = mysql.connector.connect(host='localhost',
                                        database='electronics',
                                        user='root',password='root')
    cursor = connection.cursor()
    print("Laptop table before deleting a row")
    sql_select_query = """select * from Laptop where id = 17"""
    cursor.execute(sql_select_query)
    record = cursor.fetchone()
    print(record)

    # Delete a record
    sql_Delete_query = """Delete from Laptop where id = 17"""
    cursor.execute(sql_Delete_query)
    connection.commit()
    print('number of rows deleted', cursor.rowcount)


    cursor.execute(sql_select_query)
    records = cursor.fetchall()
    if len(records) == 0:
        print("Record Deleted successfully ")

except mysql.connector.Error as error:
    print("Failed to delete record from table: {}".format(error))
finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("MySQL connection is closed")
