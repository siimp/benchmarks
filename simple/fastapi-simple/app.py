import uvicorn
from fastapi import FastAPI
from fastapi.responses import PlainTextResponse

app = FastAPI()

@app.get("/", response_class=PlainTextResponse)
def home():
    return 'hello world'

if __name__ == "__main__":
    uvicorn.run("app:app", port=8080, access_log=False)