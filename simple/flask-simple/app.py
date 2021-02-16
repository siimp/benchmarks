from flask import Flask,Response
import logging

log = logging.getLogger('werkzeug')
log.disabled = True

app = Flask(__name__)


@app.route('/')
def hello():
    return Response('hello world', mimetype='text/plain')
    

if __name__ == "__main__":
    app.run(port=8080, debug=False)