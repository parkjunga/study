from django.shortcuts import render

def index(request):
    return render(request, 'chat/index.html')

def room(reeuqest, room_name):
    return render(reeuqest, 'chat/room.html', {
        'room_name': room_name
    })