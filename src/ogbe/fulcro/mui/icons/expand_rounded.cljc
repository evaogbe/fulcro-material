(ns ogbe.fulcro.mui.icons.expand-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ExpandRounded" :default ExpandRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExpandRounded)))