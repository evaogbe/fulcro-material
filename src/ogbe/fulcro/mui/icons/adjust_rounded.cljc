(ns ogbe.fulcro.mui.icons.adjust-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AdjustRounded" :default AdjustRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-adjust-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AdjustRounded)))