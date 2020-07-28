SOCKET_URL = 'ws://localhost:9090/beagle-chat'

-- All users in the same channel  version

Send Message =app/sendMessage
New User Login = app/newUser

Receive all Messages = app/topic/beagle-chat

---- Mult Channel version

channel subscribe = /topic/{channel}
addUser to a channel = /app/chat/{channel}/addUser
send message = /app/chat/{channel}/sendMessage
receive message = /topic/{channel}

