(ns ogbe.fulcro.mui.icons.task-alt
  #?(:cljs (:require
            ["@mui/icons-material/TaskAlt" :default TaskAlt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-task-alt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TaskAlt)))