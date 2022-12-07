(ns ogbe.fulcro.mui.icons.task
  #?(:cljs (:require
            ["@mui/icons-material/Task" :default Task]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-task
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Task)))