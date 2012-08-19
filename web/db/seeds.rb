# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rake db:seed (or created alongside the db with db:setup).
#
# Examples:
#
#   cities = City.create([{ name: 'Chicago' }, { name: 'Copenhagen' }])
#   Mayor.create(name: 'Emanuel', city: cities.first)

Task.create(:name => "Email Jenn", :description =>  "Send an email to Jennifer Woodard")
Task.create(:name => "Email David", :description => "Send an email to David Cochran")
Task.create(:name => "Do washing")