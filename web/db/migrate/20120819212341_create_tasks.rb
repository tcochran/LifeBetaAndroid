class CreateTasks < ActiveRecord::Migration
  def change
    create_table :tasks do |t|

      t.timestamps
      t.string :name
      t.string :description
    end
  end
end
