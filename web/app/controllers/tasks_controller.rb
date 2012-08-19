class TasksController < ApplicationController

	def index
		render :json => Task.find(:all)
	end 
end
