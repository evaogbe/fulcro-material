(ns ogbe.fulcro.mui.icons.assignment-turned-in
  #?(:cljs (:require
            ["@mui/icons-material/AssignmentTurnedIn" :default AssignmentTurnedIn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assignment-turned-in
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssignmentTurnedIn)))