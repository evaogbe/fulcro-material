(ns ogbe.fulcro.mui.icons.nights-stay
  #?(:cljs (:require
            ["@mui/icons-material/NightsStay" :default NightsStay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nights-stay
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NightsStay)))