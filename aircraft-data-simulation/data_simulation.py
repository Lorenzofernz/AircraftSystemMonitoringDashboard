from flask import Flask, jsonify
import random

app = Flask(__name__)

@app.route('/status', methods=['GET'])
def get_aircraft_status():
    status = {
        'fuelLevel': random.uniform(0, 100),
        'engineTemp': random.uniform(100, 200),
        'altitude': random.uniform(20000, 40000)
    }
    return jsonify(status)

if __name__ == "__main__":
    app.run(debug=True)
