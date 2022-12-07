(ns ogbe.fulcro.mui.icons.group-add
  #?(:cljs (:require
            ["@mui/icons-material/GroupAdd" :default GroupAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-group-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupAdd)))