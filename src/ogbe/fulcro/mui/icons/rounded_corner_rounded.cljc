(ns ogbe.fulcro.mui.icons.rounded-corner-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RoundedCornerRounded" :default RoundedCornerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rounded-corner-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoundedCornerRounded)))