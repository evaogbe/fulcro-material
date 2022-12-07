(ns ogbe.fulcro.mui.icons.add-task-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AddTaskRounded" :default AddTaskRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-task-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddTaskRounded)))