(ns ogbe.fulcro.mui.icons.group-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GroupRounded" :default GroupRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-group-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupRounded)))