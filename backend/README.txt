SOCKET_URL = 'ws://localhost:9090/beagle-chat'

-- All users in the same channel  version

Send Message =app/send-message
New User Login = app/new-user

Receive all Messages = app/topic/beagle-chat

---- Mult Channel version

channel subscribe = /topic/{channel}
addUser to a channel = /app/chat/{channel}/add-user
send message = /app/chat/{channel}/send-message
receive message = /topic/{channel}

