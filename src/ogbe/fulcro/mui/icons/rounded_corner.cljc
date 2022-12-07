(ns ogbe.fulcro.mui.icons.rounded-corner
  #?(:cljs (:require
            ["@mui/icons-material/RoundedCorner" :default RoundedCorner]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rounded-corner
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoundedCorner)))