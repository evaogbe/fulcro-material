(ns ogbe.fulcro.mui.icons.clear-all-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ClearAllRounded" :default ClearAllRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear-all-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClearAllRounded)))