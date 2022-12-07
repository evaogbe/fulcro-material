(ns ogbe.fulcro.mui.icons.remove-done-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RemoveDoneRounded" :default RemoveDoneRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-done-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveDoneRounded)))