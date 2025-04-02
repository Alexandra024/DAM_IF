from arango import ArangoClient

# Initialize the ArangoDB client
client = ArangoClient()

# Connect to the database with a username and password
db = client.db("example_db", username="admin", password="securepassword")

# Check if the connection is successful
if db.verify():
    print("Login successful!")
else:
    print("Login failed!")
