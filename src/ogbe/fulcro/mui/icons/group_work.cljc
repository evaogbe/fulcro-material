(ns ogbe.fulcro.mui.icons.group-work
  #?(:cljs (:require
            ["@mui/icons-material/GroupWork" :default GroupWork]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-group-work
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupWork)))