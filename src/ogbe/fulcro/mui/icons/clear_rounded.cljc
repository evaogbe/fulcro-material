(ns ogbe.fulcro.mui.icons.clear-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ClearRounded" :default ClearRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClearRounded)))