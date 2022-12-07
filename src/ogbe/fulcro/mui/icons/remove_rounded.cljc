(ns ogbe.fulcro.mui.icons.remove-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RemoveRounded" :default RemoveRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveRounded)))