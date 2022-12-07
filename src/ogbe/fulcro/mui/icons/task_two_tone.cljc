(ns ogbe.fulcro.mui.icons.task-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TaskTwoTone" :default TaskTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-task-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TaskTwoTone)))