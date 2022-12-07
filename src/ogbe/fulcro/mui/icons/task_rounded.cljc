(ns ogbe.fulcro.mui.icons.task-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TaskRounded" :default TaskRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-task-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TaskRounded)))